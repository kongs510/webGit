package com.bit.camp.model;

import com.bit.camp.model.entity.MemberVo;

public interface MemberDAO {
	//회원가입
	public void register(MemberVo vo) throws Exception;
	//로그인
	public MemberVo login(MemberVo vo) throws Exception;
	
}
