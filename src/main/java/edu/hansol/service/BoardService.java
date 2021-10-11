package edu.hansol.service;

import java.util.List;

import edu.hansol.domain.Board;

public interface BoardService {

	public List<Board> findByAll();
	
	public Board findOne(Long bno);
	
	public boolean register(Board board);
	
	public boolean modify(Board board); 
	
	public boolean remove(Long bno);
}
