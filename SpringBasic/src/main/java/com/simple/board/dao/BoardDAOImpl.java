package com.simple.board.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("boardDAO") 
public class BoardDAOImpl implements BoardDAO {
	
	//디비라고 가정
	private ArrayList<BoardVO> list = new ArrayList<>();

	@Override
	public void regist(BoardVO vo) {
		list.add(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return list;
	}

	@Override
	public void delete(String sno) {
		list.remove(Integer.parseInt(sno));
		
	}

}
