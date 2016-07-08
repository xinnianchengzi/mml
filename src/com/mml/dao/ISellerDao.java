package com.mml.dao;
import com.mml.entity.Seller;

public interface ISellerDao {
	public Seller validateSellerLogin(String name,String password);
	public void SellerRegist(Seller seller);
	public void deleteSeller(Seller seller);
	public void verifySeller(Seller seller);
	public void modifySeller(Seller selle);
	
}
