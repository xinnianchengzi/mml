package com.mml.serviceImp;

import java.math.BigDecimal;
import java.util.List;

import com.mml.entity.Comment;
import com.mml.entity.Discount;
import com.mml.entity.Fullcut;
import com.mml.entity.Goods;
import com.mml.entity.Orders;
import com.mml.entity.Seller;
import com.mml.service.ISellerService;
public class ISellerServiceImp implements ISellerService{

	@Override
	public Seller SellerLogin(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller SellerRegist(Seller seller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> GetSellerInfo(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller ModifySellerInfo(Seller seller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> GetSellerOrders(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> GetSellerGoods(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods UpdateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteGoodsBySeller(Integer goodsid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Goods ModifyGoodsInfo(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> GetSellerComment(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment ReplyComment(String commentreply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller ModifySellerPage(Seller seller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller UpdateAdvertisement(Seller seller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Discount AddDiscount(BigDecimal discount, Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteDiscount(Integer sellerid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fullcut AddFulcut(BigDecimal full, BigDecimal cut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteFullcut(Integer sellerid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List GetSellerTag(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> GetGoodsWithTag(Integer sellerid, String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteTag(String tag) {
		// TODO Auto-generated method stub
		
	}

}
