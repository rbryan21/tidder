package com.tidder.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BoardListDto {
    private List<BoardDto> boards;
}
