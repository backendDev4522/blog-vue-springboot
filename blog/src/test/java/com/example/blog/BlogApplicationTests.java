package com.example.blog;

import com.example.blog.api.domain.Member;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Hello world!!");
	}

	@Test
	void memberLombokTest(){
		Member member = Member.builder().id("id").password("pwd").build();
		member.setEmail("dhzm2aud@naver.com");
		System.out.println("lombok test : " + member);
	}
}
