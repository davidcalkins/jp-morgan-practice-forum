package com.jpmorgan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpmorgan.beans.ForumPost;


@Repository
@Transactional
public interface ForumPostRepository extends JpaRepository<ForumPost, Integer>{

}
