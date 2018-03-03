package com.tidder.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  A DTO for an author, this should contain public information - like username, not personal details, like email
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String email;
    private String username;

    public static class UserDtoBuilder {

        private Long id;
        private String email;
        private String username;

        public UserDtoBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public UserDtoBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserDtoBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserDto build() {
            return new UserDto(this.id, this.email, this.username);
        }

    }

}
