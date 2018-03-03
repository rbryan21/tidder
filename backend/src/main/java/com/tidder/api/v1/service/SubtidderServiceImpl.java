package com.tidder.api.v1.service;

import com.tidder.api.v1.model.SubtidderCreationDto;
import com.tidder.api.v1.model.SubtidderDto;
import com.tidder.api.v1.model.SubtidderUpdationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtidderServiceImpl implements SubtidderService {

    @Override
    public List<SubtidderDto> getAllSubtidders() {
        return null;
    }

    @Override
    public List<SubtidderDto> getAllSubtiddersOwnedByUserId(Long userId) {
        return null;
    }

    @Override
    public SubtidderDto getSubtidderById(Long subtidderId) {
        return null;
    }

    @Override
    public SubtidderDto getSubtidderByName(String subtidderName) {
        return null;
    }

    @Override
    public SubtidderDto createSubtidder(SubtidderCreationDto subtidderCreationDto) {
        return null;
    }

    @Override
    public SubtidderDto updateSubtidder(SubtidderUpdationDto subtidderUpdationDto) {
        return null;
    }

}
