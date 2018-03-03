package com.tidder.api.v1.service;

import com.tidder.api.v1.model.BoardCreationDto;
import com.tidder.api.v1.model.BoardDto;
import com.tidder.api.v1.model.BoardUpdationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Override
    public List<BoardDto> getAllBoards() {
        return null;
    }

    @Override
    public List<BoardDto> getAllBoardsForSubtidderId(Long subtidderId) {
        return null;
    }

    @Override
    public BoardDto getBoardById(Long boardId) {
        return null;
    }

    @Override
    public BoardDto createBoard(BoardCreationDto boardCreationDto) {
        return null;
    }

    @Override
    public BoardDto updateBoard(BoardUpdationDto boardUpdationDto) {
        return null;
    }

}
