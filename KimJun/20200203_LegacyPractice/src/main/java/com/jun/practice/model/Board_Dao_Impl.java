package com.jun.practice.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jun.practice.dto.Board_Dto;

@Repository
public class Board_Dao_Impl implements IBoard_Dao {
	
	@Autowired
	private SqlSessionTemplate session;
	private final String NS = "com.jun.board.";

	@Override
	public List<Board_Dto> selectAll() {
		List<Board_Dto> lists = session.selectList(NS+"selectAll");
		return lists;
	}

	@Override
	public Board_Dto selectOne(int board_seq) {
		Board_Dto dto = session.selectOne(NS+"selectOne", board_seq);
		return dto;
	}

}
