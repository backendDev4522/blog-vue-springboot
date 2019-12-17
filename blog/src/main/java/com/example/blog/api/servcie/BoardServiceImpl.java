package com.example.blog.api.servcie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.blog.api.domain.Board;
import com.example.blog.api.domain.BoardDto;
import com.example.blog.api.repository.BoardRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardRepository boardRepository;
	
	@Transactional
	public void saveBoard(BoardDto boardDto) {
		boardRepository.save(boardDto.toEntity());
	}

	@Transactional
    public List<BoardDto> getBoardlist() {
       
		List<Board> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();
        for ( Board board : boardEntities) {
            BoardDto boardDTO = BoardDto.builder()
                    .bid(board.getBid())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .writer(board.getWriter())
                    .createdDate(board.getCreatedDate())
                    .updatedDate(board.getUpdatedDate())
                    .build();

            boardDtoList.add(boardDTO);
        }
        return boardDtoList;
    }

	@Transactional
	public BoardDto getBoard(Long bid) {
		Board board = boardRepository.findById(bid).get();
		return entityToDto(board);
	}
	
	public BoardDto entityToDto(Board board) {
		BoardDto boardDto = BoardDto.builder()
				.bid(board.getBid())
				  .title(board.getTitle())
                  .content(board.getContent())
                  .writer(board.getWriter())
                  .createdDate(board.getCreatedDate())
                  .updatedDate(board.getUpdatedDate())
                  .build();
		return boardDto;
	}
	
	
}
