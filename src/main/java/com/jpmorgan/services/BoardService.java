package com.jpmorgan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpmorgan.beans.Author;
import com.jpmorgan.beans.Board;
import com.jpmorgan.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public Board findByboardID(int boardID) {
		return boardRepository.findByboardID(boardID);
	}
	
	public List<Board> findByAuthor(Author author){
		return boardRepository.findByAuthor(author);
	}
	
	public Board createBoard(Board board) {
		return boardRepository.save(board);
	}



}
