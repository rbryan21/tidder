package com.tidder.api.v1.service;

import com.tidder.api.repository.BoardRepository;
import com.tidder.api.v1.mapper.BoardMapper;
import com.tidder.api.v1.model.BoardCreationDto;
import com.tidder.api.v1.model.BoardDto;
import com.tidder.api.v1.model.BoardUpdationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardServiceImpl implements BoardService {

    private BoardRepository repository;

    private BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardRepository repository, BoardMapper boardMapper) {
        this.repository = repository;
        this.boardMapper = boardMapper;
    }

    @Override
    public List<BoardDto> getAllBoards() {
        return repository.findAll()
                .stream()
                .map(boardMapper::boardToBoardDto)
                .collect(Collectors.toList());
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
