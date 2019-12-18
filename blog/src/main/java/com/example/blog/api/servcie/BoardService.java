package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.BoardDto;

import javassist.NotFoundException;

public interface BoardService {
	public void saveBoard(BoardDto boardDto);
	public List<BoardDto> getBoardlist();
	public BoardDto getBoard(Long id);
	public void updateBoard(BoardDto boardDto, Long id) throws NotFoundException;
	public void deleteBoard(Long id) throws NotFoundException;
}
