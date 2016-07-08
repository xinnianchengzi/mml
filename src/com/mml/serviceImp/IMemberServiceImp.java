package com.mml.serviceImp;

import java.util.List;

import com.mml.entity.Couponget;
import com.mml.entity.Gift;
import com.mml.entity.Memberuser;
import com.mml.entity.Orders;
import com.mml.service.IMemberService;
public class IMemberServiceImp implements IMemberService{

	@Override
	public Memberuser MemberLogin(String membername, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memberuser MemberRegist(Memberuser memberuser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memberuser GetMemberInfo(Integer memberid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> GetMembersOrders(Integer memberid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memberuser ModifyMemberInfo(Memberuser memberuser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List GetChartByMember(Integer memberid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Couponget GetCoupon(Integer memberid, Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gift> GetGift() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gift AddGiftToChart(Integer giftid) {
		// TODO Auto-generated method stub
		return null;
	}

}
