package com.bit.camp.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bit.camp.model.MemberDAO;
import com.bit.camp.model.entity.MemberVo;


@Service
public class MemberServiceImpl implements MemberService {

	@Inject 
	MemberDAO dao;
		
	
	@Override
	public void register(MemberVo vo) throws Exception {
		dao.register(vo);
		
	}


	@Override
	public MemberVo login(MemberVo vo) throws Exception {
		return dao.login(vo);
	}




}
