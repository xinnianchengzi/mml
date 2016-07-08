package com.mml.serviceImp;

import com.mml.entity.Comment;
import com.mml.entity.Goods;
import com.mml.entity.Orders;
import com.mml.service.IBuyerService;
public class IBuyerServiceImp implements IBuyerService{

	@Override
	public void AddToChart(Goods goods, Integer number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Orders FromChartToOrders(Integer memberid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders MemberPayOrders(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders UserBuyGoods(Goods goods, Integer number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders UserPayOrders(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders ConfirmGoodsReceive(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment WriteComments(Integer ordersid) {
		// TODO Auto-generated method stub
		return null;
	}

}
