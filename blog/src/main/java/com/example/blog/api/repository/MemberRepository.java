package com.example.blog.api.repository;

import com.example.blog.api.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String>{
    
}