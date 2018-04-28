package com.jrb.assignment2;

import javax.transaction.Transactional;

@Transactional
public class MemberServiceImpl implements MemberService {
	public MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void save(Member member) {
		memberDao.save(member);
	}

}
