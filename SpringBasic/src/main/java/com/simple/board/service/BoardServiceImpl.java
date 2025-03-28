package com.simple.board.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.board.dao.BoardDAO;
import com.simple.board.dao.BoardMapper;
import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;


@Service("board")
public class BoardServiceImpl implements BoardService {

//	@Autowired
//	@Qualifier("boardDAO")
//	private BoardDAO boardDAO;
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@Override
	public void regist(BoardVO vo) {
		boardMapper.insertBoard(vo);
		
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boardMapper.selectBoard();
	}

	@Override
	public void delete(String sno) {
		
		boardMapper.deleteBoard(sno);
	}

}
