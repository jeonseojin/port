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
	
	//작품 + 정렬
	@Override
	public ArrayList<ToonVo> toonList(Criteria cri) {
		return adminDao.toonList(cri);

	}
	
	// 작품페이지네이션
	@Override
	public PageMaker getPageMakerByToon(Criteria cri) {
		PageMaker pm = new PageMaker();
		pm.setCri(cri);
		pm.setTotalCount(adminDao.getTotalCountByToon(cri));
		return pm;
	}

	//작품등록
	@Override
	public void insertToon(ToonVo toon) {
		if(toon.getT_week() == 0) toon.setT_week(1);
		if(toon.getG_code() == null || toon.getG_code().length()==0) toon.setG_code("#1");
		toon.setLastEpisode("N");
		adminDao.insertToon(toon);
		
	}



  
}
