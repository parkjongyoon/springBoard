package com.ndarkness.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ndarkness.board.dto.BoardVO;
import com.ndarkness.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void registerGET(BoardVO boardVO, Model model) {
		logger.debug("register get.....");
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(BoardVO boardVO, RedirectAttributes rttr) {
		logger.debug("register post.....");
		service.create(boardVO);
		rttr.addFlashAttribute("msg", "success");
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView();
		model.addObject("list", service.list());
		model.setViewName("/board/list");
		return model;
	}
}
