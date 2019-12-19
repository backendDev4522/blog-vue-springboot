package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.BoardDto;

import javassist.NotFoundException;

public interface BoardService {
	void saveBoard(BoardDto boardDto);
	List<BoardDto> getBoardlist();
	BoardDto getBoard(Long id);
	void updateBoard(BoardDto boardDto, Long id) throws NotFoundException;
	void deleteBoard(Long id) throws NotFoundException;
	List<BoardDto> findByTitleLike(String title);
	List<BoardDto> findByWriterLike(String writer);
}
