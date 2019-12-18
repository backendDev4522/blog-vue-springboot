package com.example.blog.api.servcie;

import java.util.List;

import com.example.blog.api.dto.MemberDto;
import com.example.blog.api.repository.MemberRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Transactional
    @Override
    public void insert(MemberDto dto) {
        memberRepository.save(dto.toEntity());
    }

    @Transactional
    @Override
    public MemberDto searchById(String id) {
        return null;
    }

    @Transactional
    @Override
    public List<MemberDto> getAll() {
        return null;
    }

    @Transactional
    @Override
    public void update(MemberDto dto) {

    }

    @Transactional
    @Override
    public void delete(String id) {

    }

    
}