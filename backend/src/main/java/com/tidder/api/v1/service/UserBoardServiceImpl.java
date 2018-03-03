package com.tidder.api.v1.service;

import com.tidder.api.v1.model.UserBoardCreationDto;
import com.tidder.api.v1.model.UserBoardDto;
import com.tidder.api.v1.model.UserBoardUpdationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBoardServiceImpl implements UserBoardService {

    @Override
    public UserBoardDto getUserBoardInteraction(Long userId, Long boardId) {
        return null;
    }

    @Override
    public List<UserBoardDto> getAllUserBoardInteractionsForUserId(Long userId) {
        return null;
    }

    @Override
    public List<UserBoardDto> getAllUserBoardInteractionsForBoardId(Long boardId) {
        return null;
    }

    @Override
    public UserBoardDto createUserBoard(UserBoardCreationDto userBoardCreationDto) {
        return null;
    }

    @Override
    public UserBoardDto updateUserBoard(UserBoardUpdationDto userBoardUpdationDto) {
        return null;
    }

}
