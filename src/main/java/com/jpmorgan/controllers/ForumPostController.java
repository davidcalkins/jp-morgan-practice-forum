package com.jpmorgan.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpmorgan.beans.ForumPost;
import com.jpmorgan.services.ForumPostService;

@RestController
@RequestMapping("/forumposts")
public class ForumPostController {
	
	private ForumPostService forumPostService;
	
	@PostMapping
	public ForumPost createForumPost(@RequestBody ForumPost forumPost) {
		ForumPost newForumPost = forumPostService.createForumPost(forumPost);
		return newForumPost;
	}
	

}
