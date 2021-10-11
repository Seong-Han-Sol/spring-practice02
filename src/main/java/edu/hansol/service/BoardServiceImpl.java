package edu.hansol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.hansol.domain.Board;
import edu.hansol.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardMapper boardMapper;
	
	@Override
	public List<Board> findByAll() {
		return boardMapper.getBoardList();
	}

	@Override
	public Board findOne(Long bno) {
		return boardMapper.getBoard(bno);
	}

	@Override
	public boolean register(Board board) {
		return boardMapper.insert(board);
	}

	@Override
	public boolean modify(Board board) {
		return boardMapper.update(board);
	}

	@Override
	public boolean remove(Long bno) {
		return boardMapper.delete(bno);
	}
	
	
}
