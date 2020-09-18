package com.bit.camp.service;

import com.bit.camp.model.entity.MemberVo;

public interface MemberService {

	public void register(MemberVo vo) throws Exception;
	
	public MemberVo login(MemberVo vo) throws Exception;
	
}