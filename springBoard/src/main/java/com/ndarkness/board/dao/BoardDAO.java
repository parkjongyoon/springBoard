package com.ndarkness.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ndarkness.board.dto.BoardVO;

@Repository
public class BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.ndarkness.mapper.boardMapper";
	
	public void create(BoardVO boardVO) {
		sqlSession.insert(NAMESPACE + ".create", boardVO);
	}
	
	public BoardVO read(int bno) {
		return sqlSession.selectOne(NAMESPACE + ".read", bno);
	}
	
	public void update(BoardVO boardVO) {
		sqlSession.update(NAMESPACE + ".update", boardVO);
	}
	
	public void delete(int bno) {
		sqlSession.delete(NAMESPACE + ".delete", bno);
	}
	
	public List<BoardVO> list(){
		return sqlSession.selectList(NAMESPACE + ".listAll");
	}
}
