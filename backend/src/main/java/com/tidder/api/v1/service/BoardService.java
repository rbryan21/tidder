package com.tidder.api.v1.service;

import com.tidder.api.v1.model.BoardCreationDto;
import com.tidder.api.v1.model.BoardDto;
import com.tidder.api.v1.model.BoardUpdationDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> getAllBoards();
    List<BoardDto> getAllBoardsForSubtidderId(Long subtidderId);
    BoardDto getBoardById(Long boardId);
    BoardDto createBoard(BoardCreationDto boardCreationDto);
    BoardDto updateBoard(BoardUpdationDto boardUpdationDto);
}
