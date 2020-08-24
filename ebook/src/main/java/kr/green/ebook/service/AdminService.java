package kr.green.ebook.service;

import java.util.ArrayList;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.vo.ToonVo;

public interface AdminService {

	ArrayList<ToonVo> toonList(Criteria cri);

	PageMaker getPageMakerByToon(Criteria cri);

	void insertToon(ToonVo toon);

}
