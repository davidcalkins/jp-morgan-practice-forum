package com.jpmorgan.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpmorgan.beans.AuthorSession;
import com.jpmorgan.services.AuthorSessionService;

@RestController
@RequestMapping("/authorsessions")
public class AuthorSessionController {

	private AuthorSessionService authorSessionService;
	
	@GetMapping(value = "/{token}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public AuthorSession getAuthorSession(@PathVariable("token") String token) {
		return authorSessionService.findByauthorSessionToken(token);
	}
	
	@PostMapping
	public AuthorSession createForumPost(@RequestBody AuthorSession authorSession) {
		AuthorSession newAuthorSession = authorSessionService.createAuthorSession(authorSession);
		return newAuthorSession;
	}
	// need help with this
//	@PutMapping(value = "/{token}",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public AuthorSession updateAuthorSession(@PathVariable("token") String token) {
//		
//		AuthorSession sess = authorSessionService.findByauthorSessionToken(token);
		
		
	}
	
	
	

