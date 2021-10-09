package edu.hansol.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/board/list")
	public String showBoardList() {
		//
		return "board/boardList";
	}
	
	@GetMapping("/board/detail")
	public String showViewDetail() {
		//
		return "board/boardDetail";
	}
	
	@GetMapping("/board/modify")
	public String boardModify() {
		//
		return "board/boardModify";
	}
	
	@GetMapping("/board/write")
	public String boardWrite() {
		//
		return "board/boardWrite";
	}

}
