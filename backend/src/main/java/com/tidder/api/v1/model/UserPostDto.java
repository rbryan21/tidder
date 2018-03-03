package com.tidder.api.v1.model;

import lombok.Data;

@Data
public class UserPostDto {
    private Long userId;
    private Long postId;
    private Boolean isUpvote;
    private UserDto user;
    private PostDto post;
}
