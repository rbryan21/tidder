package com.tidder.api.v1.service;

import com.tidder.api.domain.Subtidder;
import com.tidder.api.v1.model.SubtidderCreationDto;
import com.tidder.api.v1.model.SubtidderDto;
import com.tidder.api.v1.model.SubtidderUpdationDto;

import java.util.List;

public interface SubtidderService {
    List<SubtidderDto> getAllSubtidders();
    List<SubtidderDto> getAllSubtiddersOwnedByUserId(Long userId);
    SubtidderDto getSubtidderById(Long subtidderId);
    SubtidderDto getSubtidderByName(String subtidderName);
    SubtidderDto createSubtidder(SubtidderCreationDto subtidderCreationDto);
    SubtidderDto updateSubtidder(SubtidderUpdationDto subtidderUpdationDto);
}
