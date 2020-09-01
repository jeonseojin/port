package kr.green.ebook.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.service.AdminService;
import kr.green.ebook.service.MemberService;
import kr.green.ebook.vo.ToonVo;

@Controller
public class WebtoonController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/toon", method = RequestMethod.GET)
	public ModelAndView toon(ModelAndView mv, Criteria cri) {
		mv.setViewName("/toon/week");
		ArrayList<ToonVo> tlist = adminService.toonList(cri);
		mv.addObject("tlist", tlist);
		ArrayList<ToonVo> wlist = adminService.weekList(cri);
		mv.addObject("wlist", wlist);
		System.out.println(wlist);
		return mv;
	}
}
