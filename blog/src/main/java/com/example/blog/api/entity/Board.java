package com.example.blog.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Setter
@ToString
@Table(name = "board")
public class Board extends BaseEntity{
	/*
	 * 연관관계 설정부분.
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="member_id") private Member member;
	 */
	// 먼저 연관관계를 생각하지 않은 CRUD 게시판을 만든 후 연관관계를 설정해준다.
	@Column(nullable = false, length = 20)
	private String writer;

	@Column(nullable = false, length = 50)
	private String title;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String content;

	@Column(nullable = false, length = 50,name="board_type")
	private String boardType;


	@Builder
	private Board(String writer, String title, String content, String boardType) {
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.boardType = boardType;
	}

}
