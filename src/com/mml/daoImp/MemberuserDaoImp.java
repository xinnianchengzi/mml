package com.mml.daoImp;

import java.util.List;

import org.hibernate.*;

import com.mml.dao.IBaseDao;
import com.mml.dao.IMemberuserDao;
import com.mml.entity.Memberuser;

public class MemberuserDaoImp extends IBaseDao implements IMemberuserDao {
	@Override
	public Memberuser validateMemberLogin(String name, String password) {
		String hql="from Memberuser m where m.MName=? and m.MPassword=?";
		Session session=getSession();
		Query query=session.createQuery(hql);
		query.setParameter(0, name);
		query.setParameter(1,password);
		List memberusers=query.list();
		if(memberusers.size()!=0){
			Memberuser memberuser=(Memberuser)memberusers.get(0);
			return memberuser;
		}
		session.close();
		return null;
	}

	@Override
	public void MemberUserRegist(Memberuser memberuser) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		Memberuser m=memberuser;
		m.setMVerify("1");
		session.save(m);
		tx.commit();
		session.close();
	}

	@Override
	public void modifyMemberUser(Memberuser memberuser) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ memberuser.getMName());
		getSession().update(memberuser);
	}

	@Override
	public void deleteMemberUser(Memberuser memberuser) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ memberuser.getMName());
		getSession().delete(memberuser);
	}

	@Override
	public void addMemberUsr(Memberuser memberuser) {
		// TODO Auto-generated method stub
		
	}
}
