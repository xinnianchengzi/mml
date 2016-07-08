package com.mml.serviceImp;
import java.util.List;

import com.mml.entity.Administer;
import com.mml.entity.Categorya;
import com.mml.entity.Categoryb;
import com.mml.entity.Coupon;
import com.mml.entity.Gift;
import com.mml.entity.Goods;
import com.mml.entity.Grades;
import com.mml.entity.Memberuser;
import com.mml.entity.Orders;
import com.mml.entity.Promotion;
import com.mml.entity.Seller;
import com.mml.entity.Viewboard;
import com.mml.service.IAdministerService;
public class IAdministerServiceImp implements IAdministerService{

	@Override
	public Administer SuperAdministerLogin(Administer administer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administer NormalAdminiterLogin(Administer administer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administer AdministerRegist(Administer administer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administer> GetAdministerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administer VerifyAdminister(Integer adminid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administer RefuseAdminister(Integer adminid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Memberuser> GetMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Grades> GetGradesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifyGrades(Integer gradesid, Integer grades) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seller> GetRegistedSellerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteSeller(Integer sellerid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String GetRegistFile(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RefuseSeller(Integer sellerid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> GetGoodsListByAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteGoodsByAdmin(Integer goodsid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categorya> GetCategorya() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoryb> GetCategoryb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddCategorya(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddCategoryv(Integer categorya, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteCategorya(Integer categorya) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteCategoryb(Integer categoryb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Orders> GetAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> GetOrdersBySeller(Integer sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> GetOrdersByMember(Integer memberid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteOrders(Integer ordersid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Viewboard> GetViewboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifyState(Integer viewboardid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteViewboard(Integer viewboardid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Coupon UpdateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gift UpdateGift(Gift gift) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promotion> GetPromotion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Promotion UpdatePromotion(Promotion promotion) {
		// TODO Auto-generated method stub
		return null;
	}

}
