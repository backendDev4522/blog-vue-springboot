package com.example.blog.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.api.dto.BoardDto;
import com.example.blog.api.servcie.BoardService;

import javassist.NotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BoardController {
	private BoardService boardService;
	
	@PostMapping("/board")
	public ResponseEntity saveBoard(@RequestBody BoardDto boardDto){
		boardService.saveBoard(boardDto);
		return new ResponseEntity(true, HttpStatus.OK);
	}
	
	@GetMapping("/boards")
	public ResponseEntity<List<BoardDto>> getBoardList(){
		return new ResponseEntity<List<BoardDto>>(boardService.getBoardlist(),HttpStatus.OK);
	}
	
	
	@GetMapping("/boards/{bid}")
	public ResponseEntity<BoardDto> getBoard(@PathVariable Long bid){
		return new ResponseEntity<BoardDto>(boardService.getBoard(bid),HttpStatus.OK);
	}
	
	
	@PutMapping("boards/{bid}")
	public ResponseEntity updateBoard(@RequestBody BoardDto boardDto, @PathVariable Long bid) throws NotFoundException{
		boardService.updateBoard(boardDto, bid);
		return new ResponseEntity(true, HttpStatus.OK);
	}
	
	@DeleteMapping("boards/{bid}")
	public ResponseEntity deleteBoard(@PathVariable Long bid) throws NotFoundException{
		boardService.deleteBoard(bid);
		return new ResponseEntity(true, HttpStatus.OK);
	}
	
	
	
}
