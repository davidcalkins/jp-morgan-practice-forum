package com.jpmorgan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpmorgan.beans.AuthorSession;
import com.jpmorgan.repository.AuthorSessionRepository;

@Service
public class AuthorSessionService {
	
	@Autowired
	private AuthorSessionRepository authorSessionRepository;
	
	
	public AuthorSession findByauthorSessionToken(String token) {
		return authorSessionRepository.findByauthorSessionToken(token);
	}
	
	public AuthorSession createAuthorSession(AuthorSession authorSession) {
		return authorSessionRepository.save(authorSession);
	}
	public AuthorSession updateAuthorSession(AuthorSession authorSession) {
		return authorSessionRepository.save(authorSession);
	}


}
