package com.jun.practice.ctrl;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jun.practice.dto.Board_Dto;
import com.jun.practice.model.IBoard_Service;

@Controller
public class BoardCtrl {

	private Logger log = LoggerFactory.getLogger(BoardCtrl.class);
	@Autowired
	private IBoard_Service service;
	
	@RequestMapping(value = "/selectAll.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String selectAll(Model model) {
		log.info("전체조회");
		List<Board_Dto> lists = service.selectAll();
		model.addAttribute("lists", lists);
		return "selectAll";
	}
	
	@RequestMapping(value="/selectOne.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String selectOne(Model model, int board_seq) {
		log.info("상세조회");
		Board_Dto dto = service.selectOne(board_seq);
		model.addAttribute("dto", dto);
		return "selectOne";
	}
}
