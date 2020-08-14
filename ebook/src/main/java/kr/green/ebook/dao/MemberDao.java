package kr.green.ebook.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.ebook.vo.MemberVo;

public interface MemberDao {
    public MemberVo getMember(@Param("id")String id);

	public void insertMember(@Param("member")MemberVo member);
    

}