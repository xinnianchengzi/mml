package com.mml.service;

import java.util.List;
import com.mml.entity.Administer;
import com.mml.entity.Memberuser;
import com.mml.entity.Seller;
import com.mml.entity.Grades;
import com.mml.entity.Goods;
import com.mml.entity.Categorya;
import com.mml.entity.Categoryb;
import com.mml.entity.Orders;
import com.mml.entity.Viewboard;
import com.mml.entity.Promotion;
import com.mml.entity.Coupon;
import com.mml.entity.Gift;

public interface IAdministerService {
	//管理员模块
	public Administer SuperAdministerLogin(Administer administer);//超级管理员登录
	public Administer NormalAdminiterLogin(Administer administer);//普通管理员登录
	public Administer AdministerRegist(Administer administer);//管理员注册
	public List<Administer> GetAdministerList();//获得所有管理员列表（是否通过验证由前台区分）
	public Administer VerifyAdminister(Integer adminid);//通过管理员注册
	public Administer RefuseAdminister(Integer adminid);//拒绝管理员注册
	//用户管理模块
	public List<Memberuser> GetMemberList();//获得用户信息列表
	public List<Grades> GetGradesList();//获得会员等级信息列表
	public void ModifyGrades(Integer gradesid,Integer grades);//修改等级规则（相应等级对应的积点数）
	//商家管理模块
	public List<Seller> GetRegistedSellerList();//获得所有商家列表（是否通过验证由前台区分）
	public void DeleteSeller(Integer sellerid);//删除已注册商家（仅提供已注册商家该接口，未注册商家将在拒绝验证的同时删除）
	public String GetRegistFile(Integer sellerid);//获得商家上传的注册文件路径
	public void RefuseSeller(Integer sellerid);//拒绝商家注册
	//商品管理模块
	public List<Goods> GetGoodsListByAdmin();//获得商品列表
	public void DeleteGoodsByAdmin(Integer goodsid);//管理员删除商品，同时删除相关订单和评论
	public List<Categorya> GetCategorya();//获得一级类别列表
	public List<Categoryb> GetCategoryb();//获得二级类别列表
	public void AddCategorya(String name);//添加一级类别
	public void AddCategoryv(Integer categorya,String name);//添加二级类别,仅能添加在已有的一级类别下
	public void DeleteCategorya(Integer categorya);//删除一级类别(先确认该类别下无商品才可删除，同时删除二级类别)
	public void DeleteCategoryb(Integer categoryb);//删除二级类别（先确认该类别下无商品才可删除）
	//订单管理模块
	public List<Orders> GetAllOrders();
	public List<Orders> GetOrdersBySeller(Integer sellerid);//按商家查询订单
	public List<Orders> GetOrdersByMember(Integer memberid);//按用户查询订单
	public void DeleteOrders(Integer ordersid);
	//留言板管理
	public List<Viewboard> GetViewboard();//获得留言板列表（会员和商家由前端区分）
	public void ModifyState(Integer viewboardid);//更改处理状态
	public void DeleteViewboard(Integer viewboardid);//删除留言板
	//商城活动管理
	public Coupon UpdateCoupon(Coupon coupon);//上传优惠券
	public Gift UpdateGift(Gift gift);//上传赠品
	public List<Promotion> GetPromotion();//获得平台促销活动信息（可能没有）
	public Promotion UpdatePromotion(Promotion promotion);//发布平台促销活动	
}
