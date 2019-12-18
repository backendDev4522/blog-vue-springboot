package com.example.blog.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.api.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
