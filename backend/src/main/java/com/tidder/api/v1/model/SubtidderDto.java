package com.tidder.api.v1.model;

import lombok.Data;

@Data
public class SubtidderDto {
    private Long id;
    private String name;
    private UserDto user;
}
