package com.tidder.api.v1.model;

import lombok.Data;

@Data
public class UserSubtidderDto {
    private Long userId;
    private Long subtidderId;
    private SubtidderDto subtidder;
    private UserDto user;
}
