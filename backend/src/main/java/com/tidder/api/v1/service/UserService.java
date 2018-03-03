package com.tidder.api.v1.service;

import com.tidder.api.domain.User;
import com.tidder.api.v1.model.UserDto;
import com.tidder.api.v1.model.UserLoginDto;
import com.tidder.api.v1.model.UserRegistrationDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUsers();
    User findUserByEmail(String email);
    boolean validateUserLogin(UserLoginDto userLoginDto);
    User registerNewUserAccount(UserRegistrationDto userRegistrationDto);
}
