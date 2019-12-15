package com.example.blog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.example.blog.api.entity.Member;
import com.example.blog.api.repository.MemberRepository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MemberJUintTest{

	@Autowired
	MemberRepository memberRepository;

	@BeforeEach
	public void setup(){
		//given
		memberRepository.save(Member.builder()
			.id("test")
			.password("test")
			.address("대구시 북구 동천동")
			.email("test@naver.com")
			.name("tester")
			.build()
		);
	}

	@AfterEach
	public void cleanup(){
		memberRepository.deleteAll();
	}

	@DisplayName("회원 추가")
	@Test
	public void insertMember(){
		//when
		List<Member> memberList = memberRepository.findAll();
		
		//then
		Member member = memberList.get(0);
		assertEquals(member.getId(), "test");
		assertEquals(member.getPassword(), "test");
		assertEquals(member.getEmail(), "test@naver.com");
		assertEquals(member.getName(), "tester");
		assertEquals(member.getAddress(), "대구시 북구 동천동");

	}

	@DisplayName("회원 정보 수정")
	@Test
	public void updateMember(){
		
	}
}