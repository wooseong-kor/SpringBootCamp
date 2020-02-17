package com.min.edu;

import java.util.Collection;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.min.edu.dtos.BoardDTO;
import com.min.edu.persistence.BoardRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BoardRepositoryTests {

	@Autowired
	private BoardRepository boardRepo;
	
//	@Test
//	public void testInsert() {
//		
//		BoardDTO board = new BoardDTO();
//		board.setTitle("제목");
//		board.setContent("내용");
//		board.setWriter("Master");
//		
//		boardRepo.save(board);
//	}
	
//	@Test
//	public void testSelect() {
//		
//		boardRepo.findById(1L).ifPresent((board) -> {
//			System.out.println(board);
//		});
//	}
	
//	@Test
//	public void testUpdate() {
//		
//		System.out.println("시작");
//		Optional<BoardDTO> board = boardRepo.findById(1L);
//		BoardDTO dto = board.get();
//		
//		System.out.println("update");
//		dto.setTitle("제목 수정!!!!");
//		
//		boardRepo.save(dto);
//	}
	
//	@Test
//	public void testDelete() {
//		
//		System.out.println("삭제");
//		
//		boardRepo.deleteById(1L);
//	}
	
//	@Test
//	public void testByTitle() {
//		boardRepo.findBoardDTOByTitle("제목").forEach(board -> System.out.println(board));
//	}
	
//	@Test
//	public void testByWriter() {
//		
//		Collection<BoardDTO> results = boardRepo.findByWriter("Master");
//		
//		results.forEach(board -> System.out.println(board));
//	}
	
//	@Test
//	public void testByWriterContaining() {
//		
//		Collection<BoardDTO> results = boardRepo.findByWriterContaining("er");
//		
//		results.forEach(board -> System.out.println(board));
//		
//	}
	
//	@Test
//	public void testByTitleContainingOrContentContaining() {
//		
//		Collection<BoardDTO> results = boardRepo.findByTitleContainingOrContentContaining("제", "내");
//		
//		results.forEach(board -> System.out.println(board));
//		
//	}
	
	@Test
	public void testByBnpGreaterThan() {
		
		Collection<BoardDTO> results = boardRepo.findByBnpGreaterThan(2L);
		
		results.forEach(board -> System.out.println(board));
	}
}
