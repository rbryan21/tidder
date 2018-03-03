package com.tidder.api.v1.model;

import lombok.Data;
import java.sql.Date;

@Data
public class BoardDto {
    private Long id;
    private String title;
    private Date createdDate;
    private Date updatedDate;
    private UserDto user;
    private SubtidderDto subtidder;
}
