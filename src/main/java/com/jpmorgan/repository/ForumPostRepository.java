package com.jpmorgan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpmorgan.beans.Author;
import com.jpmorgan.beans.Board;
import com.jpmorgan.beans.ForumPost;

@Repository
@Transactional
public interface ForumPostRepository extends JpaRepository<ForumPost, Integer> {

	public List<ForumPost> findByBoard(Board board);

	public List<ForumPost> findByAuthor(Author author);

	public ForumPost findByForumPostID(int forumPostID);

}
