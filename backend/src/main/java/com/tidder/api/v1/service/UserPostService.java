package com.tidder.api.v1.service;

import com.tidder.api.v1.model.UserPostCreationDto;
import com.tidder.api.v1.model.UserPostDto;
import com.tidder.api.v1.model.UserPostUpdationDto;

import java.util.List;

public interface UserPostService {
    UserPostDto getUserPostInteraction(Long userId, Long postId);
    List<UserPostDto> getAllUserPostInteractionsForUserId(Long userId);
    List<UserPostDto> getAllUserPostInteractionsForPostId(Long postId);
    UserPostDto createUserPost(UserPostCreationDto userPostCreationDto);
    UserPostDto updateUserPost(UserPostUpdationDto userPostUpdationDto);
}
