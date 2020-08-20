package kr.green.ebook.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.ebook.pagination.Criteria;
import kr.green.ebook.vo.ToonVo;

public interface AdminDao {

//	작품리스트 정렬
	ArrayList<ToonVo> toonList(@Param("cri")Criteria cri);

	int getTotalCountByToon(@Param("cri")Criteria cri);

}
