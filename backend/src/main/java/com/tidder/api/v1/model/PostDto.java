package com.tidder.api.v1.model;

import lombok.Data;

import java.sql.Date;

@Data
public class PostDto {
    private Long id;
    private String content;
    private Date createdDate;
    private Date updatedDate;
    private BoardDto board;
    private UserDto user;
}
