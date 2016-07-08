package com.mml.service;

import java.math.BigDecimal;
import java.util.List;
import com.mml.entity.Seller;
import com.mml.entity.Orders;
import com.mml.entity.Goods;
import com.mml.entity.Comment;
import com.mml.entity.Discount;
import com.mml.entity.Fullcut;
public interface ISellerService {
	//商家登录注册模块
	public Seller SellerLogin(String name,String password);//商家注册
	public Seller SellerRegist(Seller seller);//商家注册
	//商家信息管理
	public List<Seller> GetSellerInfo(Integer sellerid);//商家信息
	public Seller ModifySellerInfo(Seller seller);//修改商家信息
	
	//商家商品管理模块
	public List<Orders> GetSellerOrders(Integer sellerid);//获得订单信息
	public List<Goods> GetSellerGoods(Integer sellerid);//获得商品信息
	public Goods UpdateGoods(Goods goods);//商品上架
	public void DeleteGoodsBySeller(Integer goodsid);//商品下架
	public Goods ModifyGoodsInfo(Goods goods);//修改商品信息
	public List<Comment>  GetSellerComment(Integer sellerid);//获得商品评论
	public Comment ReplyComment(String commentreply);//同用户商品评论，只是根据登录角色在评论表中添加不同的用户信息
	public Seller ModifySellerPage(Seller seller);//修改主页信息
	public Seller UpdateAdvertisement(Seller seller);//仅上传了广告信息,经管理员通过后才写入广告表
	
	//商家促销信息管理（可以没有折扣和满减）
	public Discount AddDiscount(BigDecimal discount,Integer sellerid);//发布折扣
	public void DeleteDiscount(Integer sellerid);//删除折扣活动
	public Fullcut AddFulcut(BigDecimal full,BigDecimal cut);//发布满减
	public void DeleteFullcut(Integer sellerid);//删除满减活动
	
	//商家品牌管理*可以不实现
	public List GetSellerTag(Integer sellerid);//获得商家所有品牌
	public List<Goods> GetGoodsWithTag(Integer sellerid,String tag);//商家查看自己品牌下的商品
	public void DeleteTag(String tag);//删除品牌，相应删除该品牌下所有商品及相关信息
	
}
