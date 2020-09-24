package kr.green.ebook.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.Cookie;

import org.apache.ibatis.annotations.Param;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.vo.ChoiceVo;
import kr.green.ebook.vo.ClaimVo;
import kr.green.ebook.vo.EpcommentVo;
import kr.green.ebook.vo.EpisodeVo;
import kr.green.ebook.vo.BookeventVo;
import kr.green.ebook.vo.GenreVo;
import kr.green.ebook.vo.PayVo;
import kr.green.ebook.vo.ToonVo;
import kr.green.ebook.vo.UpVo;
import kr.green.ebook.vo.WeekVo;

public interface AdminDao {
//페이지네이션
	public int getTotalCountByToon(@Param("cri")Criteria cri);
	
	int getTotalCountByClaim(@Param("cri")Criteria cri);


//	작품리스트 정렬
	ArrayList<ToonVo> toonList(@Param("cri")Criteria cri);

	void insertToon(@Param("toon")ToonVo toon);

	void insertEp(@Param("ep")EpisodeVo ep);

// 연재
	ToonVo getToon(@Param("num")Integer num);

	void updateToon(@Param("toon")ToonVo toon);

	WeekVo getWeek(@Param("t_week")int t_week);

	ToonVo getToont(@Param("Title")String Title);

	ArrayList<ToonVo> weekList(@Param("cri")Criteria cri);

	EpisodeVo getEp(@Param("Title")String Title, @Param("edition")String edition);

	ArrayList<EpisodeVo> getEpList(@Param("Title")String Title, @Param("edition")String edition);

	ArrayList<EpcommentVo> getCmtList(@Param("Title")String Title, @Param("edition")String edition);

	void insertEpcmt(@Param("epcmt")EpcommentVo epcmt);

	ArrayList<EpisodeVo> getEpcoverlist(@Param("Title")String title);

	int selectChoice(@Param("Title")String Title, @Param("id")String id);

	void insertChoice(@Param("Title")String Title, @Param("id")String id);

	void updateToonByChoice(@Param("Title")String Title);

	ChoiceVo getChoice(@Param("Title")String Title, @Param("id")String id);

	void deleteChoice(@Param("Title")String Title, @Param("id")String id);

	ArrayList<BookeventVo> eventList(@Param("cri")Criteria cri);

	void insertEvent(@Param("event")BookeventVo event);

	ArrayList<PayVo> payList(@Param("cri")Criteria cri);

	BookeventVo paybanner(@Param("cri")Criteria cri);

	void insertPay(@Param("pay")PayVo pay);

	ArrayList<PayVo> getPayList(@Param("name")String name);

	ArrayList<ClaimVo> getClaim(@Param("cri")Criteria cri);

	ArrayList<ToonVo> getPayToon(@Param("name")String name);

	void insertclaim(@Param("cl")ClaimVo cl);

	ClaimVo getClaimT(@Param("num")Integer num);
	
	void updateClaim(@Param("cl")ClaimVo cl);

	int selectUp(@Param("Title")String Title, @Param("id")String id);

	void insertUp(@Param("Title")String Title, @Param("id")String id);

	void updateToonByUp(@Param("Title")String Title);

	UpVo getUp(@Param("Title")String Title, @Param("id")String id);

	ArrayList<ToonVo> toonRanking(@Param("cri")Criteria cri);
	
	ArrayList<ToonVo> toonRankviews(@Param("cri")Criteria cri);

	public ArrayList<ToonVo> genreRank(@Param("cri")Criteria cri);

	public BookeventVo getEvent(@Param("title")String title);

	public void updateEvent(@Param("event")BookeventVo event);

	public ArrayList<PayVo> payattend(@Param("usedate")String usedate);

	public PayVo payattend(@Param("pay")PayVo pay);

	public PayVo getPay(@Param("now")String now, @Param("name")String name);

	public ArrayList<ToonVo> toonEnd(@Param("cri")Criteria cri, @Param("now")String now);

	public ArrayList<GenreVo> getGenrelist(@Param("cri")Criteria cri);

	public ArrayList<ToonVo> TheendGenre(@Param("cri")Criteria cri);

}
