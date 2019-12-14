package com.example.blog;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blog.api.domain.Board;
import com.example.blog.api.repository.BoardRepository;

@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void getAllBoards() {
		//given
		boardRepository.save(Board.builder()
				.writer("writer")
				.title("title")
				.content("content")
				.boardType("boardType")
				.build()
				);
		
		//when
		List<Board> boardList = boardRepository.findAll();
		
		//then
		Board board = boardList.get(0);
		System.out.println(board);
	}
	
	
}
