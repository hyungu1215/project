package repository;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Member;
import mapper.MemberMapper;


public class MemberDaoImpl implements MemberDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public MemberDaoImpl() {
		InputStream mybatisCongifinputStream;
		try {
			mybatisCongifinputStream = 
					Resources.getResourceAsStream("mybatis-config-mapping-interface.xml");
			this.sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(mybatisCongifinputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Member> selectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		List<Member> memberList = memberMapper.selectAll();
		ArrayList<Member> memberArrayList = (ArrayList<Member>) memberList;
		return memberArrayList;
	}

}
