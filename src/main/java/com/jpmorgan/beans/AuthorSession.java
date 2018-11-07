package com.jpmorgan.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorsession")
public class AuthorSession {

	@Id
	@Column(name = "authorsessiontoken")
	private String authorSessionToken;
	
	@Column(name = "expirationdate")
	private Date expirationDate;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "authorID")
	private Author Author;

	public AuthorSession(String authorSessionToken, Date expirationDate, com.jpmorgan.beans.Author author) {
		super();
		this.authorSessionToken = authorSessionToken;
		this.expirationDate = expirationDate;
		Author = author;
	}

	public AuthorSession() {
	}

	public String getAuthorSessionToken() {
		return authorSessionToken;
	}

	public void setAuthorSessionToken(String authorSessionToken) {
		this.authorSessionToken = authorSessionToken;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Author getAuthor() {
		return Author;
	}

	public void setAuthor(Author author) {
		Author = author;
	}
	
	
	
	
	
}
