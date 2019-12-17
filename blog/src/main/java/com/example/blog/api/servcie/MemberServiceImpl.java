package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.MemberDTO;
import com.example.blog.api.repository.MemberRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Override
    public void insert(MemberDTO dto) {
        memberRepository.save(dto.toEntity());
    }

    @Override
    public MemberDTO searchById(String id) {
        return null;
    }

    @Override
    public List<MemberDTO> getAll() {
        return null;
    }

    @Override
    public void update(MemberDTO dto) {

    }

    @Override
    public void delete(String id) {

    }

    
}