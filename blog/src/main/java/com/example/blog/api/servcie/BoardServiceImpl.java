package com.example.blog.api.servcie;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.api.domain.BoardDto;
import com.example.blog.api.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Transactional
	public void saveBoard(BoardDto boardDto) {
		boardRepository.save(boardDto.toEntity());
	}
	
}
