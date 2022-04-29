package com.woori.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.woori.web.dto.LoginDTO;
import com.woori.web.service.LoginService;

/*
 * 로그인 관련 컨트롤러
 */

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value = "/logout") // 로그아웃
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("lname");
		session.removeAttribute("lid");
		// session.invalidate(); 세션 강제종료
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		System.out.println(id);
		System.out.println(pw);
		
		LoginDTO dto = new LoginDTO();
		dto.setLid(id);
		dto.setLpw(pw);
		
		LoginDTO result = loginService.login(dto);
		System.out.println(result.getCount());
		if(result.getCount() == 1){
			HttpSession session = request.getSession();
			session.setAttribute("lid", id);
			session.setAttribute("lname", result.getLname());
			return "redirect:/board";
		}
		else {
			return "redirect:/login?error=1450";
		}
	}
}
