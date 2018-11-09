package com.jpmorgan.beans;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "board")
public class Board {


	@Id
	@Min(1)
	@Column(name = "boardID")
	@SequenceGenerator(name = "boardID", sequenceName = "boardID")
	@GeneratedValue(generator = "boardID", strategy = GenerationType.SEQUENCE)
	private int boardID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "category")
	private String Category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "authorID", nullable = false)
	private Author author;
	
	@Column(name = "submittedtime")
	private Timestamp submittedTime;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "forumPostID")
	private Set<ForumPost> forumPost;

	public Board(@Min(1) int boardID, String name, String category, Author author, Timestamp submittedTime) {
		super();
		this.boardID = boardID;
		this.name = name;
		Category = category;
		this.author = author;
		this.submittedTime = submittedTime;
	}
	
	

	public Board() {
		
	}



	public int getBoardID() {
		return boardID;
	}



	public void setBoardID(int boardID) {
		this.boardID = boardID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCategory() {
		return Category;
	}



	public void setCategory(String category) {
		Category = category;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public Timestamp getSubmittedTime() {
		return submittedTime;
	}



	public void setSubmittedTime(Timestamp submittedTime) {
		this.submittedTime = submittedTime;
	}



	public Set<ForumPost> getForumPost() {
		return forumPost;
	}



	public void setForumPost(Set<ForumPost> forumPost) {
		this.forumPost = forumPost;
	}
	
	



	
	
	
}
