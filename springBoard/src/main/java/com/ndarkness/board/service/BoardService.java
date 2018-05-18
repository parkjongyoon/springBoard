package com.ndarkness.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ndarkness.board.dao.BoardDAO;
import com.ndarkness.board.dto.BoardVO;

@Service
public class BoardService {

	@Inject
	private BoardDAO boardDAO;
	
	public void create(BoardVO boardVO) {
		boardDAO.create(boardVO);
	}
	
	public BoardVO read(int bno) {
		return boardDAO.read(bno);
	}
	
	public void update(BoardVO boardVO) {
		boardDAO.update(boardVO);
	}
	
	public void delete(int bno) {
		boardDAO.delete(bno);
	}
	
	public List<BoardVO> list(){
		return boardDAO.list();
	}	
}
