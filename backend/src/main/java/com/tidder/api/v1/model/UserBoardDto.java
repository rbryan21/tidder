package com.tidder.api.v1.model;

import lombok.Data;

@Data
public class UserBoardDto {
    private Long userId;
    private Long boardId;
    private Boolean isUpvote;
    private UserDto user;
    private BoardDto board;
}
