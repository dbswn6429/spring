package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.service.BoardService;
import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		return "/board/boardList";
	}
	
	@RequestMapping("/boardRegister")
	public String boardRequest() {
		return "/board/boardRegister";
	}
	@RequestMapping("/boardResult")
	public String boardResult() {
		return "/board/boardResult";
	}
	
	@RequestMapping(value="boardForm", method=RequestMethod.POST)
	public String boardForm(BoardVO vo) {
		boardService.regist(vo);
		
		return "redirect:/board/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	   public String scoreDelete(@RequestParam("sno") String sno) {
		   boardService.delete(sno);
		   return "redirect:/board/boardList";
	   }
	

}
