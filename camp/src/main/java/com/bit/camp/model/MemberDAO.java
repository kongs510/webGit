package com.bit.camp.model;

import com.bit.camp.model.entity.MemberVo;

public interface MemberDAO {
	//ȸ������
	public void register(MemberVo vo) throws Exception;
	//�α���
	public MemberVo login(MemberVo vo) throws Exception;
	
}
