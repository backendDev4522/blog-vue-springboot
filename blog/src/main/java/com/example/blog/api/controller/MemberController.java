package com.example.blog.api.controller;

import java.util.List;

import com.example.blog.api.dto.MemberDto;
import com.example.blog.api.servcie.MemberService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value="member", method=RequestMethod.GET)
class MemberController{

    MemberService memberService;

    @GetMapping("hello")
    public String hello( ){
        return "Hello2222";
    }

    @PostMapping("save")
    public ResponseEntity save(@RequestBody MemberDto memberDto){
        memberService.save(memberDto);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity getAll(){
        List<MemberDto> list = memberService.getAll();
        return new ResponseEntity(list,HttpStatus.OK);
    }
}