package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.domain.BoardDto;

public interface BoardService {
	public void saveBoard(BoardDto boardDto);
	public List<BoardDto> getBoardlist();
	public BoardDto getBoard(Long bid);
	
	
}
