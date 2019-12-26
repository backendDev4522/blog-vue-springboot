package com.example.blog.api.controller;

import java.util.List;

import com.example.blog.api.dto.MemberDto;
import com.example.blog.api.servcie.MemberService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value="member", method=RequestMethod.GET)
class MemberRestController{

    MemberService memberService;

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("save")
    public ResponseEntity save(@RequestBody final MemberDto dto){
        memberService.save(dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity getAll(){
        List<MemberDto> list = memberService.getAll();
        if(list.size() == 0) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("searchById/{id}")
    public ResponseEntity searchById(@PathVariable("id") final String id){
        MemberDto dto = memberService.searchById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity update(@RequestBody final MemberDto dto){
        memberService.update(dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}