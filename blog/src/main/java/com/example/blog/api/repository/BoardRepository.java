package com.example.blog.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.api.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
	List<Board> findByTitleLike(String title);
	List<Board> findByWriterLike(String writer);
	
}
