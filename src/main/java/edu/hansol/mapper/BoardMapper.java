package edu.hansol.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hansol.domain.Board;

@Mapper
public interface BoardMapper {

	//모든 게시글 조회
	public List<Board> getBoardList();
	
	//특정 게시글 조회 (상세보기)
	public Board getBoard(Long bno);
	
	//게시글 등록
	public boolean insert(Board board);

	//게시글 수정
	public boolean update(Board board);
	
	//게시글 삭제
	public boolean delete(Long bno);
}
