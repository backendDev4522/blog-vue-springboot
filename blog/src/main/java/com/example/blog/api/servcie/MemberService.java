package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.MemberDto;

public interface MemberService {
    
    void insert(MemberDto dto);
    MemberDto searchById(String id);
    List<MemberDto> getAll();
    void update(MemberDto dto);
    void delete(String id);
}