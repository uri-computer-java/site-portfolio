package com.woori.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woori.web.dao.BoardDAO;
import com.woori.web.dto.BoardDTO;
import com.woori.web.dto.LoginDTO;
import com.woori.web.dto.WriteDTO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		return boardDAO.boardList();
	}

	public BoardDTO detail(int bno) {
		// TODO Auto-generated method stub
		return boardDAO.detail(bno);
	}

	public void dele(int bno) {
		boardDAO.dele(bno);
	}

	public void write(WriteDTO writeDTO) {
		boardDAO.write(writeDTO);
		
	}
}
