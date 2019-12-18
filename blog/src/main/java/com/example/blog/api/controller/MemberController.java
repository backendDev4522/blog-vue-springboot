package com.example.blog.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value="member", method=RequestMethod.GET)
class MemberController{

    @GetMapping("hello")
    public String hello( ){
        return "Hello2222";
    }
}