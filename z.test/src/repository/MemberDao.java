package repository;

import java.util.ArrayList;

import domain.Member;

public interface MemberDao {
	
	public ArrayList<Member> selectAll();
	
}