package com.tidder.api.v1.controller;

import com.tidder.api.v1.model.UserListDto;
import com.tidder.api.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<UserListDto> getUsers() {
        return new ResponseEntity<>
                (new UserListDto(userService.findAllUsers()), HttpStatus.OK);
    }

}
