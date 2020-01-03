package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blog.api.entity.Board;

@SpringBootTest
class BlogApplicationTests {

	@Test
	public void lombokTest() {
		Board board = Board.builder().title("exam").content("examlple").boardType("자유게시판")
				.build();
		System.out.println(board);
	}

	@Test
	void contextLoads() {
		System.out.println("Hello world!!");
	}

}
