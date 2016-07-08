package com.mml.service;

import java.util.List;
import com.mml.entity.Memberuser;
import com.mml.entity.Orders;
import com.mml.entity.Couponget;
import com.mml.entity.Gift;
public interface IMemberService {
	public Memberuser MemberLogin(String membername,String password);//会员登录
	public Memberuser MemberRegist(Memberuser memberuser);//会员注册
	//会员个人信息管理模块
	public Memberuser GetMemberInfo(Integer memberid);//获得会员基本信息
	public List<Orders> GetMembersOrders(Integer memberid);//查看交易记录
	public Memberuser ModifyMemberInfo(Memberuser memberuser);//修改基本信息
	public List GetChartByMember(Integer memberid);//查看购物车
	//领取优惠券
	public Couponget GetCoupon(Integer memberid,Integer sellerid);
	//领取赠品
	public List<Gift> GetGift();//获得赠品列表
	public Gift AddGiftToChart(Integer giftid);//将赠品添加到购物车
	
}
