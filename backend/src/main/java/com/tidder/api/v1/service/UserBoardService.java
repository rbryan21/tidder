package com.tidder.api.v1.service;

import com.tidder.api.domain.Board;
import com.tidder.api.domain.associative.UserBoard;
import com.tidder.api.v1.model.UserBoardCreationDto;
import com.tidder.api.v1.model.UserBoardDto;
import com.tidder.api.v1.model.UserBoardUpdationDto;

import java.util.List;

public interface UserBoardService {
    UserBoardDto getUserBoardInteraction(Long userId, Long boardId);
    List<UserBoardDto> getAllUserBoardInteractionsForUserId(Long userId);
    List<UserBoardDto> getAllUserBoardInteractionsForBoardId(Long boardId);
    UserBoardDto createUserBoard(UserBoardCreationDto userBoardCreationDto);
    UserBoardDto updateUserBoard(UserBoardUpdationDto userBoardUpdationDto);
}
