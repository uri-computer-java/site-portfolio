package com.woori.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.woori.web.dto.BoardDTO;
import com.woori.web.dto.WriteDTO;
import com.woori.web.service.BoardService;

@Controller
public class BoardController {
	
	@RequestMapping(value="/del")
	public String delete(@RequestParam("bno") int bno) {
		System.out.println(bno);
		boardService.dele(bno);
		
		return "redirect:/board";
	}
	
	@RequestMapping(value="/detail")
	public ModelAndView detail(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("detail");
		int bno = Integer.parseInt(request.getParameter("bno"));
		System.out.println(bno);
		
		BoardDTO detail = boardService.detail(bno);
		
		mv.addObject("detail", detail);
		
		return mv;
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "main";
	}
	
	@Autowired
	private BoardService boardService;
	@RequestMapping(value = "/board")
	public ModelAndView board(){
		ModelAndView mv = new ModelAndView("board");
		List<BoardDTO> board = boardService.boardList();
		mv.addObject("board", board);
		return mv;
	}
	@GetMapping (value = "/write")
	public String write(HttpServletRequest request){
		HttpSession session = request.getSession();
		if(session.getAttribute("lname") != null && session.getAttribute("lid") != null) {
			return "write"; 
		}else{
			return "redirect:/login";
		}
	}
	
	@PostMapping (value = "/write")
	public String writeAction(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String content = request.getParameter("content");
		if(session.getAttribute("lname") != null && session.getAttribute("lid") != null) {
			String title = request.getParameter("title");
			WriteDTO writeDTO = new WriteDTO();
			writeDTO.setTitle(title);
			writeDTO.setContent(content);
			writeDTO.setLid(String.valueOf(session.getAttribute("lid")));
			
			boardService.write(writeDTO);
			
			return "redirect:/board"; 
		}else{
			return "redirect:/login";
		}
	}
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// 사용자 요청 -> controller -> service -> DAO -> model -> mybatis -> DB
	//                                           ArrayList <- BoardDTO <-
}