package com.tidder.api.v1.mapper;

import com.tidder.api.domain.Board;
import com.tidder.api.v1.model.BoardDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);

    BoardDto boardToBoardDto(Board board);

    Board boardDtoToBoard(BoardDto boardDto);

}
