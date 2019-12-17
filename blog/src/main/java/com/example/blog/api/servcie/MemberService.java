package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.MemberDTO;

public interface MemberService {
    
    void insert(MemberDTO dto);
    MemberDTO searchById(String id);
    List<MemberDTO> getAll();
    void update(MemberDTO dto);
    void delete(String id);
}