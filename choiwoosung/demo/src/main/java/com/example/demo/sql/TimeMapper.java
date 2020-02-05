package com.example.demo.sql;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.DTO;

@Mapper
public interface TimeMapper {

//	@Select("select id from answerboard")
	public List<DTO> getList();
	
}
