package service;

import java.util.ArrayList;
import java.util.List;

import domain.Member;
import repository.MemberDao;
import repository.MemberDaoImpl;

public class MemberService {
	
	private MemberDao memberDao;
	
	public MemberService() throws Exception {
		memberDao = new MemberDaoImpl();
	}
	
	public ArrayList<Member> selectAll() throws Exception {
		return memberDao.selectAll();
	}

}
