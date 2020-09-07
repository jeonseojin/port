package kr.green.ebook.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.service.AdminService;
import kr.green.ebook.service.MemberService;
import kr.green.ebook.service.ToonService;
import kr.green.ebook.vo.ToonVo;

@Controller
public class ToonController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	AdminService adminService;
	@Autowired
	ToonService toonService;
	
	@RequestMapping(value = "/toon", method = RequestMethod.GET)
	public ModelAndView toon(ModelAndView mv, Criteria cri) {
		mv.setViewName("/toon/week");
		ArrayList<ToonVo> wlist = adminService.weekList(cri);
		mv.addObject("wlist", wlist);
		PageMaker pm = adminService.getPageMakerByToon(cri);
		mv.addObject("pm", pm);
		return mv;
	}
	@RequestMapping(value = "/toon/ep", method = RequestMethod.GET)
	public ModelAndView toonEp(ModelAndView mv,String title, Criteria cri) {
		mv.setViewName("/toon/ep");
		ToonVo toon = toonService.view(title);
		mv.addObject("toon", toon);
		mv.addObject("cri", cri);
		System.out.println(toon);
		return mv;
	}
}
