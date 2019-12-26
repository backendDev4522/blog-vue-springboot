package com.example.blog.api.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import com.example.blog.api.dto.MemberDto;
import com.example.blog.api.servcie.MemberService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@AllArgsConstructor
@RestController
@RequestMapping(value="member", method=RequestMethod.GET)
class MemberController{

    MemberService memberService;

    @GetMapping("hello")
    public String hello( ){
        return "Hello2222";
    }

    @GetMapping("save")
    public ResponseEntity save(@RequestBody MemberDto memberDto){
        memberService.save(memberDto);

        return new ResponseEntity(HttpStatus.OK);
    }

}