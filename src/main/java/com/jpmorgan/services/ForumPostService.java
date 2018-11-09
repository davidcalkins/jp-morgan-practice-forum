package com.jpmorgan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpmorgan.beans.Author;
import com.jpmorgan.beans.Board;
import com.jpmorgan.beans.ForumPost;
import com.jpmorgan.repository.ForumPostRepository;

@Service
public class ForumPostService {
	@Autowired
	private ForumPostRepository forumPostRepository;

	public List<ForumPost> findByBoard(Board board) {
		return forumPostRepository.findByBoard(board);
	}

	public List<ForumPost> findByAuthor(Author author) {
		return forumPostRepository.findByAuthor(author);
	}
	

	public ForumPost findByForumPostID(int forumPostID) {
		return forumPostRepository.findByForumPostID(forumPostID);
	}
	
	public ForumPost createForumPost(ForumPost forumPost) {
		return forumPostRepository.save(forumPost);
	}
	
	public ForumPost updateForumPost(ForumPost forumPost) {
		return forumPostRepository.save(forumPost);
	}
	
	public void deleteForumPost(int id) {
		ForumPost forumPost = findByForumPostID(id);
		if(forumPost != null) {
			forumPostRepository.deleteById(id);
		}
				
	}
	
	

}
