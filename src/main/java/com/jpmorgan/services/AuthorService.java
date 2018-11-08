package com.jpmorgan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpmorgan.beans.Author;
import com.jpmorgan.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	public Author findByAuthorID(int id) {
		return authorRepository.findByAuthorID(id);
	}
	
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
	}

}
