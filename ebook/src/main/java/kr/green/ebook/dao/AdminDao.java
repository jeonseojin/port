package kr.green.ebook.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.pagination.PageMaker;
import kr.green.ebook.vo.EpisodeVo;
import kr.green.ebook.vo.ToonVo;

public interface AdminDao {

//	작품리스트 정렬
	ArrayList<ToonVo> toonList(@Param("cri")Criteria cri);

	public int getTotalCountByToon(@Param("cri")Criteria cri);

	void insertToon(@Param("toon")ToonVo toon);

	ArrayList<ToonVo> weekList(@Param("cri")Criteria cri);

	void insertEp(@Param("ep")EpisodeVo ep);

// 연재
	
	ToonVo getToon(@Param("title")String title);

	void updateToon(@Param("toon")ToonVo toon);
}
