package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.domain.BoardDto;

import javassist.NotFoundException;

public interface BoardService {
	public void saveBoard(BoardDto boardDto);
	public List<BoardDto> getBoardlist();
	public BoardDto getBoard(Long bid);
	public void updateBoard(BoardDto boardDto, Long bid) throws NotFoundException;
	public void deleteBoard(Long bid) throws NotFoundException;
}
