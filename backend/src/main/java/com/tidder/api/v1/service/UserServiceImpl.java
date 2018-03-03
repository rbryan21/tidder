package com.tidder.api.v1.service;

import com.tidder.api.domain.User;
import com.tidder.api.repository.UserRepository;
import com.tidder.api.v1.mapper.UserMapper;
import com.tidder.api.v1.model.UserDto;
import com.tidder.api.v1.model.UserLoginDto;
import com.tidder.api.v1.model.UserRegistrationDto;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private PasswordEncoder passwordEncoder;

    private UserRepository repository;

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(PasswordEncoder passwordEncoder, UserRepository repository, UserMapper userMapper) {
        this.passwordEncoder = passwordEncoder;
        this.repository = repository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return repository.findAll()
                .stream()
                .map(userMapper::userToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public User findUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public boolean validateUserLogin(final UserLoginDto userLoginDto) {
        User userToFind;
        if (userLoginDto.getEmail() == null && userLoginDto.getUsername() == null) {
            return false;
        } else if (userLoginDto.getEmail() != null) {
            userToFind = repository.findByEmail(userLoginDto.getEmail());
        } else {
            userToFind = repository.findByUsername(userLoginDto.getUsername());
        }
        return passwordEncoder.matches(userLoginDto.getPassword(), userToFind.getPassword());
    }

    @Override
    public User registerNewUserAccount(final UserRegistrationDto userRegistrationDto) {
        if (emailExist(userRegistrationDto.getEmail())) {
            // TODO: email already exists throw exception
        }
        if (usernameExist(userRegistrationDto.getUsername())) {
            // TODO: username already exists throw exception
        }
        final User user = new User.UserBuilder()
                .setEmail(userRegistrationDto.getEmail())
                .setUsername(userRegistrationDto.getUsername())
                .setPassword(passwordEncoder.encode(userRegistrationDto.getPassword()))
                .build();

        return repository.save(user);
    }

    private boolean emailExist(final String email) {
        return repository.findByEmail(email) != null;
    }

    private boolean usernameExist(final String username) {
        return repository.findByUsername(username) != null;
    }

}
