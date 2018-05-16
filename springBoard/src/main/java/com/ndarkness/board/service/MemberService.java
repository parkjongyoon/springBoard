package com.ndarkness.board.service;

import java.util.List;

import com.ndarkness.board.dto.MemberVO;

public interface MemberService {
	public List<MemberVO> selectMember() throws Exception;
}
