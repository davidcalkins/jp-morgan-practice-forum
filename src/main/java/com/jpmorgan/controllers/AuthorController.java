package com.jpmorgan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpmorgan.beans.Author;
import com.jpmorgan.repository.AuthorRepository;

@RestController
@RequestMapping("/author")

public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Author getUser(@PathVariable("id") int id) {
		return authorRepository.findById(id);
	}
}
