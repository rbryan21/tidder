package com.tidder.api.v1.mapper;

import com.tidder.api.domain.User;
import com.tidder.api.v1.model.UserDto;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserMapperTest {

    UserMapper userMapper = UserMapper.INSTANCE;

    private String userEmail = "example@email.com";
    private String userUsername = "username";
    private Long id = 1L;

    @Test
    public void userToUserDto() {
        User user = new User.UserBuilder()
                .setUsername(userUsername)
                .setEmail(userEmail)
                .setId(id)
                .build();

        UserDto userDto = userMapper.userToUserDto(user);

        assertEquals(user.getEmail(), userDto.getEmail());
        assertEquals(user.getUsername(), userDto.getUsername());
        assertEquals(user.getId(), userDto.getId());
    }

    @Test
    public void userDtoToUser() {
        UserDto userDto = new UserDto.UserDtoBuilder()
                .setUsername(userUsername)
                .setEmail(userEmail)
                .setId(id)
                .build();

        User user = userMapper.userDtoToUser(userDto);

        assertEquals(userDto.getEmail(), user.getEmail());
        assertEquals(userDto.getUsername(), user.getUsername());
        assertEquals(userDto.getId(), user.getId());
    }

}