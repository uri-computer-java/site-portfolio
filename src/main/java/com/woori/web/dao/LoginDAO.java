package com.woori.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woori.web.dto.LoginDTO;

@Repository
public class LoginDAO {
	@Autowired
	private SqlSession sqlsession;
	
	public LoginDTO login(LoginDTO dto) {
		return sqlsession.selectOne("login.login", dto);
	}
}
