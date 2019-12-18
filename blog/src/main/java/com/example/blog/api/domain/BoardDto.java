package com.example.blog.api.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {

	private Long id;
	private String title;
	private String content;
	private String writer;
	private String boardType;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	
	
	public Board toEntity() {
		Board build = Board.builder()
				.writer(writer)
				.title(title)
				.content(content)
				.boardType(boardType)
				.build();
		return build;
	}
	
	@Builder
	public BoardDto(Long id, String title, String content, String writer, String boardType, LocalDateTime createdDate,LocalDateTime updatedDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.boardType = boardType;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
}
