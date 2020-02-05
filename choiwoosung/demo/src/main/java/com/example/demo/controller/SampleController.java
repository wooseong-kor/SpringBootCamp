package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DTO;
import com.example.demo.domain.SampleVO;
import com.example.demo.sql.TimeMapper;

@RestController
//@MapperScan(basePackages = "com.example.demo.sql")
public class SampleController {

	@Autowired
	TimeMapper timeMapper;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/sample")
	public SampleVO makeSmaple() {
		SampleVO vo = new SampleVO();

		vo.setVal1("v1");
		vo.setVal2("v2");
		vo.setVal3("v3");
		return vo;
	}
	
	@GetMapping("/time")
	public List<DTO> getList(){
		List<DTO> list = timeMapper.getList();		
		
		return list;
	}
}
