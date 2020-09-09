package kr.green.ebook.service;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.vo.EpisodeVo;
import kr.green.ebook.vo.GenreVo;
import kr.green.ebook.vo.ToonVo;
import kr.green.ebook.vo.WeekVo;

public interface AdminService {

	ArrayList<ToonVo> toonList(Criteria cri);

	PageMaker getPageMakerByToon(Criteria cri);

	void insertToon(ToonVo toon);

	ToonVo getToonT(String Title);

	void updateToon(ToonVo toon);

	void insertEp(EpisodeVo ep);

	GenreVo getGr(String t_code);

	WeekVo getWeek(Integer t_week);

	ToonVo getToon(Integer num);

	ToonVo getToon(HttpServletRequest r);

}
