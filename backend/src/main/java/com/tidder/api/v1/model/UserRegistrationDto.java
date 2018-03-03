package com.tidder.api.v1.model;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String email;
    private String password;
    private String username;
}
