package com.example.blog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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
		// memberRepository.deleteAll();
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
		// given
		MemberDto dto = MemberDto.builder().
		id("test").password("test").address("대구시 북구 동천동").email("test@naver.com").name("tester").build();

		// when
		Member member = dto.toEntity();
		memberService.insert(dto);

		// then
		member.updateMemberInfo("update test", "email" , "진평동");
		
		assertEquals(member.getEmail(),"email");
	}

	@DisplayName("전체 회원 정보 조회")
	@Test
	public void findAllMember() {
		// given
		MemberDto dto = MemberDto.builder().
		id("test").password("test").address("대구시 북구 동천동").email("test@naver.com").name("tester").build();
		MemberDto dto2= MemberDto.builder().
		id("test2").password("test2").address("대구시 북구 동천동2").email("test@naver.com2").name("tester2").build();
		memberService.insert(dto);
		memberService.insert(dto2);

		// when
		Member member = dto.toEntity();
		Member member2 = dto2.toEntity();
		List<MemberDto> list = memberService.getAll();

		// then
		assertEquals(member.getName(),list.get(0).getName());
		assertEquals(member2.getName(),list.get(1).getName());
	}

	@DisplayName("회원 정보 조회")
	@Test
	public void findMember() {
		// given
		MemberDto dto = MemberDto.builder().
		id("test").password("test").address("대구시 북구 동천동").email("test@naver.com").name("tester").build();
		memberService.insert(dto);

		// when
		Member member = memberService.searchById("test");

		// then
		assertEquals(dto.getName(),member.getName());
	}
}