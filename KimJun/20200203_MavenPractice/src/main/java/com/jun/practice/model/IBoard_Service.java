package com.jun.practice.model;

import java.util.List;

import com.jun.practice.dto.Board_Dto;

public interface IBoard_Service {

	public List<Board_Dto> selectAll();

	public Board_Dto selectOne(int board_seq);
}
