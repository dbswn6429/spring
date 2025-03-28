package com.simple.board.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.command.BoardVO;

@Mapper
public interface BoardMapper {
	
	int insertBoard(BoardVO vo);
	ArrayList<BoardVO> selectBoard(); //여러행 select
	int deleteBoard(String sno);
}
