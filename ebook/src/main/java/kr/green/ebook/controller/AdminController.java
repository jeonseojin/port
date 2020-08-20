package kr.green.ebook.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.service.AdminService;
import kr.green.ebook.service.MemberService;
import kr.green.ebook.vo.MemberVo;
import kr.green.ebook.vo.ToonVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	MemberService memberService;
	@Autowired
	AdminService adminService;
	
	//유저관리
	@RequestMapping(value = "/admin/user", method = RequestMethod.GET)
	public ModelAndView user(ModelAndView mv, Criteria cri) {
		mv.setViewName("/admin/user");
		ArrayList<MemberVo> list = memberService.memberList(cri);
		mv.addObject("list", list);
		PageMaker pm = memberService.getPageMakerByMember(cri);
		mv.addObject("pm", pm);
		return mv;
	}
	
	//작품관리
	@RequestMapping(value = "/admin/toon", method = RequestMethod.GET)
	public ModelAndView toon(ModelAndView mv, Criteria cri) {
		mv.setViewName("/admin/toon");
		ArrayList<ToonVo> list = adminService.toonList(cri);
		mv.addObject("list", list);
		System.out.println(list);
		PageMaker pm = adminService.getPageMakerByToon(cri);
		mv.addObject("pm", pm);
		return mv;
	}
	
}