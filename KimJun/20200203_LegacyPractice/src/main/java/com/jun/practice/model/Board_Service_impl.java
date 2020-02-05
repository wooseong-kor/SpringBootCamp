package com.jun.practice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.practice.dto.Board_Dto;

@Service
public class Board_Service_impl implements IBoard_Service {

	
	@Autowired
	private IBoard_Dao dao;
	
	@Override
	public List<Board_Dto> selectAll() {
		List<Board_Dto> lists = dao.selectAll();
		return lists;
	}

	@Override
	public Board_Dto selectOne(int board_seq) {
		Board_Dto dto = dao.selectOne(board_seq);
		return dto;
	}

}
