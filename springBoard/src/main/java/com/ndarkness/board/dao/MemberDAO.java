package com.ndarkness.board.dao;

import java.util.List;

import com.ndarkness.board.dto.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
}
