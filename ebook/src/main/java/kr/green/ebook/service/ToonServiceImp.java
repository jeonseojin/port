package kr.green.ebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.ebook.dao.AdminDao;
import kr.green.ebook.vo.ToonVo;

@Service
public class ToonServiceImp implements ToonService {
	@Autowired
    AdminDao adminDao;
	
	//toon
	@Override
	public ToonVo view(String title) {
		ToonVo toon = adminDao.getToon(title);
		if(toon != null) {
			toon.setViews(toon.getViews()+1);
			adminDao.updateToon(toon);
		}
		return toon;
	}



  
}
