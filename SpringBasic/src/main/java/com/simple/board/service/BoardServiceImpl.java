package com.simple.board.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.board.dao.BoardDAO;
import com.simple.command.BoardVO;


@Service("board")
public class BoardServiceImpl implements BoardService {

	@Autowired
	@Qualifier("boardDAO")
	private BoardDAO boardDAO;
	
	
	@Override
	public void regist(BoardVO vo) {
		
		boardDAO.regist(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boardDAO.getList();
	}

	@Override
	public void delete(String sno) {
		boardDAO.delete(sno);
		
	}

}
