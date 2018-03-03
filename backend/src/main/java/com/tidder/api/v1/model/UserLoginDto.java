package com.tidder.api.v1.model;

import lombok.Data;

/**
 * A DTO for User Login - should contain information used for login.
 * A user can login with a username or a password.
 */
@Data
public class UserLoginDto {
    private String email;
    private String username;
    private String password;
}
