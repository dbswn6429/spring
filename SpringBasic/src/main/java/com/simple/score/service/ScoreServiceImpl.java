package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;
import com.simple.score.dao.ScoreMapper;

@Service("aaaaaaa")   //@Service 어노페이션을 붙이고, 패키지를 읽어서 빈으로 만드는 전략 
public class ScoreServiceImpl implements ScoreService{

//	@Autowired
//	@Qualifier("scoreDAO")
//	private ScoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public void regist(ScoreVO vo) {
		scoreMapper.insertTwo(vo);
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		return scoreMapper.selectThree();
		
	}

	@Override
	public void delete(String sno) {
		scoreMapper.deleteOne(sno);
		
	}

}
