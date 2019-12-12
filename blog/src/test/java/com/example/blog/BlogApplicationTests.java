package com.example.blog;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blog.api.domain.Board;

@SpringBootTest
class BlogApplicationTests {

	@Test
	public void lombokTest() {
		Board board = Board.builder()
				.bid(1)
				.title("exam")
				.content("examlple")
				.boardType("자유게시판")
				.createdDate(Calendar.getInstance().getTime())
				.build();
	}
	
}
