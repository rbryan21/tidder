package com.tidder.api.v1.service;

import com.tidder.api.v1.model.UserSubtidderCreationDto;
import com.tidder.api.v1.model.UserSubtidderDto;
import com.tidder.api.v1.model.UserSubtidderUpdationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSubtidderServiceImpl implements UserSubtidderService {

    @Override
    public UserSubtidderDto getUserSubtidderInteraction(Long userId, Long subtidderId) {
        return null;
    }

    @Override
    public List<UserSubtidderDto> getAllUserSubtidderInteractionsForUserId(Long userId) {
        return null;
    }

    @Override
    public List<UserSubtidderDto> getAllUserSubtidderInteractionsForBoardId(Long boardId) {
        return null;
    }

    @Override
    public UserSubtidderDto createUserSubtidder(UserSubtidderCreationDto userSubtidderCreationDto) {
        return null;
    }

    @Override
    public UserSubtidderDto updateUserSubtidder(UserSubtidderUpdationDto userSubtidderUpdationDto) {
        return null;
    }

}
