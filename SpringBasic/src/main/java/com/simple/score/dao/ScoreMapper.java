package com.simple.score.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //매퍼임을 명시함
public interface ScoreMapper {

	String getTime();
	//select ,update, delete에도 모두 동일하게 적용됨 
	int insertOne(String name);  //매개변수가 1개일 ( #{name} )
	int insertTwo(ScoreVO vo); //매개변수가 DTO일때 ( #{getter명} )
	int insertThree(Map<String, Object> map); //매개변수가 map ( #{key값} )
	int insertFour(@Param("name") String name, 
				   @Param("kor")String kor, 
				   @Param("eng")String eng); //매개변수가 여러개면 @Param("이름")
	
	ScoreVO selectOne(int sno);
	HashMap<String, Object> selectTwo(int sno);
	ArrayList<ScoreVO> selectThree(); //여러행 select
	ArrayList<HashMap<String,Object>> selectFour(); 
	
	int updateOne(ScoreVO vo);
	int deleteOne(String sno);
	
	
	
}
