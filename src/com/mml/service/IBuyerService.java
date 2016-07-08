package com.mml.service;

import com.mml.entity.Goods;
import com.mml.entity.Orders;
import com.mml.entity.Comment;
public interface IBuyerService {
	//会员购买商品
	public void AddToChart(Goods goods,Integer number);//会员商品添加到购物车(包括商品数量),同时商品信息中减少相应数量
	public Orders FromChartToOrders(Integer memberid);//由会员的购物车生成订单
	public Orders MemberPayOrders(Orders orders );//会员支付订单，首先查看商家的优惠信息（折扣、满减），再根据选择的支付方式（平台支付、第三方支付、货到付款）,平台支付根据余额和会员等级享受优惠，第三方平台跳转第三方平台，货到付款不做修改
	//非注册用户购买商品
	public Orders UserBuyGoods(Goods goods,Integer number);//未注册用户直接购买,生成订单时用订单所填电话和自动生成的密码生成临时用户
	public Orders UserPayOrders(Orders orders);//未注册用户支付订单，首先查看商家的优惠信息（折扣、满减），计算实际支付的金额，再根据选择的支付方式（第三方平台支付，活到付款），更改付款状态
	//确认收货
	public Orders ConfirmGoodsReceive(Orders orders);
	//评论商品
	public Comment WriteComments(Integer ordersid);
}
