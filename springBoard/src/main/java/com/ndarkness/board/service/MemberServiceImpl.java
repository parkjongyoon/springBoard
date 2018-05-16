package com.ndarkness.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ndarkness.board.dao.MemberDAO;
import com.ndarkness.board.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO memberDAO;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		return memberDAO.selectMember();
	}

}
