package kr.green.ebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.ebook.service.AdminService;
import kr.green.ebook.service.MemberService;

@Controller
public class WebtoonController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/toon", method = RequestMethod.GET)
	public ModelAndView toon(ModelAndView mv) {
		mv.setViewName("/toon/week");
		return mv;
	}
}
