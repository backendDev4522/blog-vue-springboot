package com.example.blog;

import com.example.blog.api.domain.Member;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberJUintTest{
    @Test
	void memberLombokTest(){
		try{
			Member member = Member.builder().id("id").password("pwd").build();
			member.setEmail("dhzm2aud@naver.com");
			System.out.println("lombok test : " + member);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}