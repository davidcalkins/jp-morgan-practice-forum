package com.jpmorgan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpmorgan.beans.Author;
import com.jpmorgan.beans.AuthorSession;

@Repository
@Transactional
public interface AuthorSessionRepository extends JpaRepository <AuthorSessionRepository, String> { 

	
	public AuthorSession findByToken(String token );
	public AuthorSession findByAuthor(Author author);
 
}
