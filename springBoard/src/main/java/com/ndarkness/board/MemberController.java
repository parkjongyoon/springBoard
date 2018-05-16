package com.ndarkness.board;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ndarkness.board.service.MemberService;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String memberList(Locale locale, Model model) throws Exception {
		List list = service.selectMember();
		model.addAttribute("list", list);
		return "memberList";
	}
}
