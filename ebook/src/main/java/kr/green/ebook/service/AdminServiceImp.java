package kr.green.ebook.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.ebook.dao.AdminDao;
import kr.green.ebook.dao.MemberDao;
import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.vo.ToonVo;

@Service
public class AdminServiceImp implements AdminService {
	@Autowired
    AdminDao adminDao;
	
//	작품 + 정렬
	@Override
	public ArrayList<ToonVo> toonList(Criteria cri) {
		return adminDao.toonList(cri);
	}

	@Override
	public PageMaker getPageMakerByToon(Criteria cri) {
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(adminDao.getTotalCountByToon(cri));
		return null;
	}

  
}
