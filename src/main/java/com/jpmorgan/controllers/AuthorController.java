package com.jpmorgan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpmorgan.beans.Author;
import com.jpmorgan.services.AuthorService;

@RestController
@RequestMapping("/authors")
@Lazy(true)
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Author getAuthor(@PathVariable("id") int id) {
		return authorService.findByAuthorID(id);
	}
	
	@PostMapping
	public Author createAuthor(@RequestBody Author author) {
		Author newAuthor = authorService.createAuthor(author);
		return newAuthor;
	}
	

	
	
}
