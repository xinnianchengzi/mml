package com.mml.serviceImp;
import java.util.List;

import com.mml.entity.Advertisement;
import com.mml.entity.Categorya;
import com.mml.entity.Categoryb;
import com.mml.entity.Comment;
import com.mml.entity.Goods;
import com.mml.entity.Promotion;
import com.mml.entity.Seller;
import com.mml.entity.Viewboard;
import com.mml.service.IAllUserService;
public class IAllUserServiceImp implements IAllUserService{

	@Override
	public void Logout(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Promotion GetPromotion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertisement> GetAdvertisement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorya> GetCategorya() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoryb> GetCategpryb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List GetGoodsTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> GetGoodsByTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> GetGoodsBySell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> GetGoodsComment(Integer goodsid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller GetSeller(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> GetGoodsOfSeller(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Viewboard WriteView(String message) {
		// TODO Auto-generated method stub
		return null;
	}

}
