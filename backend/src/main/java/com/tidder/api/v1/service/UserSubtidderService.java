package com.tidder.api.v1.service;

import com.tidder.api.v1.model.*;

import java.util.List;

public interface UserSubtidderService {
    UserSubtidderDto getUserSubtidderInteraction(Long userId, Long subtidderId);
    List<UserSubtidderDto> getAllUserSubtidderInteractionsForUserId(Long userId);
    List<UserSubtidderDto> getAllUserSubtidderInteractionsForBoardId(Long boardId);
    UserSubtidderDto createUserSubtidder(UserSubtidderCreationDto userSubtidderCreationDto);
    UserSubtidderDto updateUserSubtidder(UserSubtidderUpdationDto userSubtidderUpdationDto);
}
