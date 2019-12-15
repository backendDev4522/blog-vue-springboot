package com.example.blog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.api.domain.BoardDto;
import com.example.blog.api.servcie.BoardServiceImpl;

@RestController
public class BoardController {

	@Autowired
	private BoardServiceImpl boardService;
	
	@PostMapping("/board")
	public ResponseEntity<BoardDto> saveBoard(@RequestBody BoardDto boardDto){
		boardService.saveBoard(boardDto);
		return new ResponseEntity<BoardDto>(boardDto, HttpStatus.OK);
	}
	
}
