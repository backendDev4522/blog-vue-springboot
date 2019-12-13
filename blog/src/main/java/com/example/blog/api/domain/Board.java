package com.example.blog.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@ToString
@Table(name="board")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	@Column(nullable = false, length = 50)
	private String title;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String content;
	
	@Column(nullable = false, length = 50)
	private String boardType;
	
	@CreatedDate
    @Column(updatable = false, name="reg_date")
	private Date regDate;
	
	
	@Builder
	private Board(Member member, String title, String content, String boardType) {
		this.member = member;
		this.title = title;
		this.content = content;
		this.boardType = boardType;
	}
	
	
	
	
}
