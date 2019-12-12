package com.example.blog.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Entity
@Getter
@Table(name="board")
@ToString
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	@Column(nullable = false, length = 20)
	private String id;
	@Column(nullable = false, length = 50)
	private String title;
	@Column(nullable = false)
	private String content;
	@Column(nullable = false, length = 50)
	private String boardType;
	@Column(nullable = true, length = 50)
	private Date createdDate;
	
	
	
	
}
