package com.min.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dtos.BoardDTO;
import com.min.edu.persistence.BoardRepository;

@Controller
public class BoardController {

	@Autowired
	private BoardRepository boardRepo;
	
	@RequestMapping(value = "/select.do", method = RequestMethod.GET)
	public String selectAll(Model model) {
		
		List<BoardDTO> lists = (List<BoardDTO>) boardRepo.findAll();
		model.addAttribute("lists", lists);
		return "list";
	}
	
	@RequestMapping(value = "/goinsert.do", method = RequestMethod.GET)
	public String goInsert() {
		return "input";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public String Insert(BoardDTO dto) {
		
		BoardDTO one = new BoardDTO();
		one.setTitle(dto.getTitle());
		one.setWriter(dto.getWriter());
		one.setContent(dto.getContent());
		boardRepo.save(one);
		return "redirect:/select.do";
	}
	
	@RequestMapping(value = "/selectOne.do", method = RequestMethod.GET)
	public String selectOne(Model model, String bnp) {
		
		Long num = Long.parseLong(bnp);
		BoardDTO dto = boardRepo.findById(num).get();
		model.addAttribute("dto", dto);
		return "selectOne";
	}
	
	@RequestMapping(value =  "/delete.do", method = RequestMethod.POST)
	public String deleteOne(String bnp) {
		
		Long num = Long.parseLong(bnp);
		boardRepo.deleteById(num);
		return "redirect:/select.do";
	}
	
	@RequestMapping(value = "/updateform.do", method = RequestMethod.POST)
	public String goUpdateForm(Model model,String bnp) {
		
		Long num = Long.parseLong(bnp);
		BoardDTO dto = boardRepo.findById(num).get();
		model.addAttribute("dto", dto);
		return "updateForm";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public String update(BoardDTO dto) {
		
		BoardDTO one = boardRepo.findById(dto.getBnp()).get();
		one.setTitle(dto.getTitle());
		one.setContent(dto.getContent());
		boardRepo.save(one);
		return "redirect:/selectOne.do?bnp="+dto.getBnp();
	}
	
	@RequestMapping(value = "/page.do", method = RequestMethod.GET)
	public String pageSelect(Model model) {
		
		Pageable paging = PageRequest.of(0, 3, Sort.Direction.ASC, "bnp");
		
		Page<BoardDTO> result = boardRepo.findByBnpGreaterThan(0L, paging);
		
		List<Integer> numlist = new ArrayList<Integer>();
		for (int i = 1; i <= result.getTotalPages(); i++) {
			numlist.add(i);
		}
		
		int pg = result.getNumber();
		String page = String.valueOf(pg);
		List<BoardDTO> lists = result.getContent();
		
		model.addAttribute("lists", lists);
		model.addAttribute("numlist", numlist);
		model.addAttribute("pg", page);
		
		return "pageList";
	}
	
	@RequestMapping(value = "/prepage.do", method = RequestMethod.GET)
	public String prePage(Model model, String pagenum) {
		
		int pg = Integer.parseInt(pagenum);
				
		Pageable paging = PageRequest.of(pg, 3, Sort.Direction.ASC, "bnp");
		
		Page<BoardDTO> result = boardRepo.findByBnpGreaterThan(0L, paging);
		
		if (result.hasPrevious()) {
			paging = result.previousPageable();
		}else {
			paging = PageRequest.of(0, 3, Sort.Direction.ASC, "bnp");
		}
		result = boardRepo.findByBnpGreaterThan(0L, paging);
		
		List<Integer> numlist = new ArrayList<Integer>();
		for (int i = 1; i <= result.getTotalPages(); i++) {
			numlist.add(i);
		}
		pg = result.getNumber();
		String page = String.valueOf(pg);
		List<BoardDTO> lists = result.getContent();
		
		model.addAttribute("lists", lists);
		model.addAttribute("numlist", numlist);
		model.addAttribute("pg", page);
		return "pageList";
	}
	
	@RequestMapping(value = "nextpage.do", method = RequestMethod.GET)
	public String nextPage(Model model, String pagenum) {
		
		int pg = Integer.parseInt(pagenum);
		
		Pageable paging = PageRequest.of(pg, 3, Sort.Direction.ASC, "bnp");
		
		Page<BoardDTO> result = boardRepo.findByBnpGreaterThan(0L, paging);
		
		if(result.hasNext()) {
			paging = result.nextPageable();
		}else {
			paging = PageRequest.of(0, 3, Sort.Direction.ASC, "bnp");
		}
		
		result = boardRepo.findByBnpGreaterThan(0L, paging);
		
		List<Integer> numlist = new ArrayList<Integer>();
		
		for (int i = 1; i <= result.getTotalPages(); i++) {
			numlist.add(i);
		}
		
		pg = result.getNumber();
		String page = String.valueOf(pg);
		
		List<BoardDTO> lists = result.getContent();
		
		model.addAttribute("lists", lists);
		model.addAttribute("numlist", numlist);
		model.addAttribute("pg", page);
		
		return "pageList";
	}
	
	@RequestMapping(value = "/numpage.do", method = RequestMethod.GET)
	public String numberToPage(Model model, String num) {
		
		int pg = Integer.parseInt(num) - 1;
		
		Pageable paging = PageRequest.of(pg, 3, Sort.Direction.ASC, "bnp");
		
		Page<BoardDTO> result = boardRepo.findByBnpGreaterThan(0L, paging);
		
		List<Integer> numlist = new ArrayList<Integer>();
		
		for (int i = 1; i <= result.getTotalPages(); i++) {
			numlist.add(i);
		}
		
		List<BoardDTO> lists = result.getContent();
		
		String page = String.valueOf(pg);
		
		model.addAttribute("lists", lists);
		model.addAttribute("numlist", numlist);
		model.addAttribute("pg", page);
		
		return "pageList";
	}
}
