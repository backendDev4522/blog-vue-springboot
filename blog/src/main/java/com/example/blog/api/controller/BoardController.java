package com.example.blog.api.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.api.domain.BoardDto;
import com.example.blog.api.servcie.BoardService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BoardController {
	private BoardService boardService;
	
	@PostMapping("/board")
	public ResponseEntity<BoardDto> saveBoard(@RequestBody BoardDto boardDto){
		boardService.saveBoard(boardDto);
		return new ResponseEntity<BoardDto>(boardDto, HttpStatus.OK);
	}
	
	@GetMapping("/boards")
	public ResponseEntity<List<BoardDto>> getBoardList(){
		return new ResponseEntity<List<BoardDto>>(boardService.getBoardlist(),HttpStatus.OK);
	}
	
	@GetMapping("/boards/{bid}")
	public ResponseEntity<BoardDto> getBoard(@PathVariable Long bid){
		return new ResponseEntity<BoardDto>(boardService.getBoard(bid),HttpStatus.OK);
	}
	
}
