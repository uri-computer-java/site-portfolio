package com.woori.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woori.web.dao.LoginDAO;
import com.woori.web.dto.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	public LoginDTO login(LoginDTO dto) {
		return loginDAO.login(dto);
	}
}
