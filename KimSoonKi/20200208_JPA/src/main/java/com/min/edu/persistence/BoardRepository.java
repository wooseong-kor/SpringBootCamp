package com.min.edu.persistence;


import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.min.edu.dtos.BoardDTO;

public interface BoardRepository extends CrudRepository<BoardDTO, Long> {

	public List<BoardDTO> findBoardDTOByTitle(String title); 
	
	public Collection<BoardDTO> findByWriter(String writer);
	
	public Collection<BoardDTO> findByWriterContaining(String writer);
	
	public Collection<BoardDTO> findByTitleContainingOrContentContaining(String title, String content);
	
	public Collection<BoardDTO> findByBnpGreaterThan(Long num);

	public Page<BoardDTO> findByBnpGreaterThan(Long bno, Pageable paging);
}
