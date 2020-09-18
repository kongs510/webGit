package com.bit.camp.model;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bit.camp.model.entity.MemberVo;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject 
	SqlSession sql;
		
	@Override
	public void register(MemberVo vo) throws Exception {
		sql.insert("memberMapper.register",vo);
		
	}

	@Override
	public MemberVo login(MemberVo vo) throws Exception {
		return sql.selectOne("memberMapper.login", vo);
	}

}
