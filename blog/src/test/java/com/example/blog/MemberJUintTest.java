package com.example.blog;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.example.blog.api.dto.MemberDto;
import com.example.blog.api.entity.Member;
import com.example.blog.api.repository.MemberRepository;
import com.example.blog.api.servcie.MemberService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberJUintTest {

	@Autowired
	MemberRepository memberRepository;
	@Autowired
	MemberService memberService;

	@BeforeEach
	public void setup() {
		System.out.println("TEST START!!");
	}

	@AfterEach
	public void cleanup() {
		memberRepository.deleteAll();
	}


	@DisplayName("회원 추가")
	@Test
	public void insertMember() {
		// given
		MemberDto dto = MemberDto.builder().id("test").password("test").address("대구시 북구 동천동").email("test@naver.com")
				.name("tester").build();

		// when
		memberService.insert(dto);

		// then
		Member member = memberRepository.findAll().get(0);
		assertEquals(member.getId(), dto.getId());
		assertEquals(member.getPassword(), dto.getPassword());
		assertEquals(member.getName(),dto.getName());
		assertEquals(member.getEmail(),dto.getEmail());
		assertEquals(member.getAddress(),dto.getAddress());
	}

	@DisplayName("회원 정보 수정")
	@Test
	public void updateMember() {
		System.out.println("회원정보수정");
	}
}