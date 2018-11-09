package com.jpmorgan.beans;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "forumpost")
public class ForumPost {
	
	@Id
	@Min(1)
	@Column(name = "forumpostID")
	@SequenceGenerator(name = "forumpostID", sequenceName = "forumpostID")
	@GeneratedValue(generator = "forumpostID", strategy = GenerationType.SEQUENCE)
	private int forumPostID;
	
	@Column(name = "submittedtime")
	private Timestamp submittedTime;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "authorID", nullable = false)
	private Author author;
	
	@Column(name = "body")
	private String body;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "boardID", nullable = false)
	private Board board;

	public ForumPost(@Min(1) int forumPostID, Timestamp submittedTime, Author author, String body, Board board) {
		super();
		this.forumPostID = forumPostID;
		this.submittedTime = submittedTime;
		this.author = author;
		this.body = body;
		this.board = board;
	}

	public ForumPost() {
		
	}

	public int getForumPostID() {
		return forumPostID;
	}

	public void setForumPostID(int forumPostID) {
		this.forumPostID = forumPostID;
	}

	public Timestamp getSubmittedTime() {
		return submittedTime;
	}

	public void setSubmittedTime(Timestamp submittedTime) {
		this.submittedTime = submittedTime;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	
	
	
	
	
	
	
	
}
