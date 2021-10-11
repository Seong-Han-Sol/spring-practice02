package edu.hansol.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hansol.domain.Board;
import edu.hansol.service.BoardService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) {
		final List<Board> boardList = boardService.findByAll();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
}
