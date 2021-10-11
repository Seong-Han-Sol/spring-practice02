package edu.hansol.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.hansol.domain.Board;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testExist() {
		log.info(boardMapper);
	}
	
	@Test
	public void testGetBoardList() {
		boardMapper.getBoardList().
			forEach(board -> log.info("board = " + board));
	}
	
	@Test
	public void testGetBoard() {
		final Board board = boardMapper.getBoard(21L);
		log.info("board = " + board);
	}
	
	@Test
	public void testInsert() {
		final Board board = new Board("테스트 제목1", "테스트 내용1", "admin");
		final boolean success = boardMapper.insert(board);
		if (success) {
			log.info("게시글 등록에 성공했습니다.");
		} else {
			log.info("게시글 등록에 실패했습니다.");
		}
	}
	
	@Test
	public void testUpdate() {
		final Board updateBoard = 
				new Board("테스트 제목1(수정)", "테스트 내용1(수정)", "admin");
		updateBoard.setBno(41L);
		
		final boolean success = boardMapper.update(updateBoard);
		if (success) {
			log.info("게시글 수정에 성공했습니다.");
		} else {
			log.info("게시글 수정에 실패했습니다.");
		}
	}
	
	@Test
	public void testDelete() {
		final boolean success = boardMapper.delete(41L);
		if (success) {
			log.info("게시글 삭제에 성공했습니다.");
		} else {
			log.info("게시글 삭제에 실패했습니다.");
		}
	}
}
