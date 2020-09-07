package kr.green.ebook.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.service.AdminService;
import kr.green.ebook.service.MemberService;
import kr.green.ebook.utils.UploadFileUtils;
import kr.green.ebook.vo.EpisodeVo;
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
	
	private String uploadPath = "D:\\전서진\\포트폴리오\\port\\ebook\\src\\main\\webapp\\resources\\img";
	
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
	public ModelAndView adminToon(ModelAndView mv, Criteria cri){
		mv.setViewName("/admin/toon");
		ArrayList<ToonVo> tlist = adminService.toonList(cri);
		mv.addObject("tlist", tlist);
		PageMaker pm = adminService.getPageMakerByToon(cri);
		mv.addObject("pm", pm);
		return mv;
	}
	
	//작품등록 기능
	@RequestMapping(value = "/admin/toon", method = RequestMethod.POST)
	public ModelAndView adminToonPost(ModelAndView mv, ToonVo toon, MultipartFile file2) throws IOException, Exception {
		mv.setViewName("redirect:/admin/toon");
		String t_img = UploadFileUtils.uploadFile(uploadPath,"\\"+toon.getTitle(), file2.getOriginalFilename(), file2.getBytes());
		toon.setT_img(t_img);
		adminService.insertToon(toon);
		return mv;
	}
	
	//연재등록 기능
	@RequestMapping(value = "/admin/ep", method = RequestMethod.POST)
	public ModelAndView adminEpPost(ModelAndView mv, EpisodeVo ep, MultipartHttpServletRequest mr) throws IOException, Exception {
		mv.setViewName("redirect:/admin/toon");
		String filename = "";
		byte[] fileby;
		List<MultipartFile> fileList = mr.getFiles("file2");
		for(MultipartFile filePart : fileList) {
			filename = filePart.getOriginalFilename();
			fileby = filePart.getBytes();
			for(int i=1; i<=fileList.size();i++) {
				String e_img = UploadFileUtils.uploadFile(uploadPath,"\\"+ ep.getE_t_title(),filename,fileby);
				ep.setE_img(e_img);
			}
			adminService.insertEp(ep);
		}
		return mv;
	}
}