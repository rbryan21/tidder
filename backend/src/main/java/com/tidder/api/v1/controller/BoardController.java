package com.tidder.api.v1.controller;

import com.tidder.api.v1.model.BoardListDto;
import com.tidder.api.v1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardController {

    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public ResponseEntity<BoardListDto> getBoards() {
        return new ResponseEntity<>
                (new BoardListDto(boardService.getAllBoards()), HttpStatus.OK);
    }

}
