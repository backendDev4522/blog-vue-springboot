package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.MemberDto;
import com.example.blog.api.entity.Member;

public interface MemberService {
    
    String save(MemberDto dto);
    Member searchById(String id);
    List<MemberDto> getAll();
    void update(MemberDto dto);
    void delete(MemberDto dto);
}