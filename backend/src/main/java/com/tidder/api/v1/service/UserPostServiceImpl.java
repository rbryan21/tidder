package com.tidder.api.v1.service;

import com.tidder.api.v1.model.UserPostCreationDto;
import com.tidder.api.v1.model.UserPostDto;
import com.tidder.api.v1.model.UserPostUpdationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPostServiceImpl implements UserPostService {

    @Override
    public UserPostDto getUserPostInteraction(Long userId, Long postId) {
        return null;
    }

    @Override
    public List<UserPostDto> getAllUserPostInteractionsForUserId(Long userId) {
        return null;
    }

    @Override
    public List<UserPostDto> getAllUserPostInteractionsForPostId(Long postId) {
        return null;
    }

    @Override
    public UserPostDto createUserPost(UserPostCreationDto userPostCreationDto) {
        return null;
    }

    @Override
    public UserPostDto updateUserPost(UserPostUpdationDto userPostUpdationDto) {
        return null;
    }

}
