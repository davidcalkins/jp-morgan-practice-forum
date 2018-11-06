package com.jpmorgan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpmorgan.beans.Author;
import com.jpmorgan.beans.Board;

@Repository
@Transactional
public interface BoardRepository extends JpaRepository<Board, Integer> {

	public Board findById(Board boardID);

	public List<Board> findByAuthor(Author author);

}
