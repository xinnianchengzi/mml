package com.mml.daoImp;
import org.hibernate.*;

import java.util.List;
import org.hibernate.*;
import com.mml.dao.BaseDao;
import com.mml.dao.ISellerDao;
import com.mml.entity.Seller;

public class SellerDaoImp extends BaseDao implements ISellerDao{
	public Seller validateSellerLogin(String name, String password) {
		String hql="from Seller s where s.SName=? and s.SPassword=? and s.SVerify=1";//ºÏ—È
		Session session=getSession();
		Query query=session.createQuery(hql);
		query.setParameter(0, name);
		query.setParameter(1,password);
		List sellers=query.list();
		if(sellers.size()!=0){
			Seller seller=(Seller)sellers.get(0);
			return seller;
		}
		session.close();
		return null;
	}
	public void SellerRegist(Seller seller) {
		getSession().seller;
		session.close();
	}

	@Override
	public void modifySeller(Seller seller) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ seller.getSName());
		getSession().update(seller);
	}

	@Override
	public void deleteSeller(Seller seller) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ seller.getSName());
		getSession().delete(seller);
	}
	@Override
	public void verifySeller(Seller seller) {
		// TODO Auto-generated method stub
		
	}

}
