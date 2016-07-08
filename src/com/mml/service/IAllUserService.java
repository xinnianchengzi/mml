package com.mml.service;

import java.util.List;
import com.mml.entity.Goods;
import com.mml.entity.Advertisement;
import com.mml.entity.Promotion;
import com.mml.entity.Categorya;
import com.mml.entity.Categoryb;
import com.mml.entity.Comment;
import com.mml.entity.Seller;
import com.mml.entity.Viewboard;
public interface IAllUserService {
	//退出登录
	public void Logout(Integer id);//会员、商家、管理员、超级管理员均使用该接口退出登录
	//用于用户浏览平台主页显示的内容
	public Promotion GetPromotion();//获得平台发布的活动
	public List<Advertisement> GetAdvertisement();//获得广告（用户可通过广告所带商家ID访问商家主页）
	public List<Categorya> GetCategorya();//获得商品一级分类
	public List<Categoryb> GetCategpryb();//获得商品二级分类
	public List GetGoodsTag();//获得商品数量最多的品牌，由前端选取置于主页
	public List<Goods> GetGoodsByTime();//获得商品列表，按更新时间排序（前端存为全局变量）
	
	//商品列表排序
	public List<Goods> GetGoodsBySell();//按销量排序，显示订单中数量最多且未销售完的的商品
	/*按价格排序由前端完成*/
	/*畅销商品置顶也由前端完成，前端用于排序的字段是点击量，由查询商品详情这一动作加一完成*/
	
	//商品搜索
	/*点击一级类别
	     点击二级类别
	     用品牌查询
	     在搜索栏用关键词搜索，依据有：商品名；商品描述；商品品牌；商品一级类别；商品二级类别（建立索引）*/
	
	//商品详情查看
	/*由于取得商品列表时已有该商品信息，此动作由前端完成*/
	public List<Comment> GetGoodsComment(Integer goodsid);//获取商品评论列表
	
	//进入商家主页
	public Seller GetSeller(Integer sellerid);//用户通过点击广告进入商家页面，商家信息中包含了商家主页所需图片等信息
	public List<Goods> GetGoodsOfSeller(Integer sellerid);//获得商家的商品列表*商家可重用
	
	//留言板反馈
	public Viewboard WriteView(String message);//登录的用户留言，根据登录信息添加留言用户信息
}
