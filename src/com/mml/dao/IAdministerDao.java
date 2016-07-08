package com.mml.dao;
import com.mml.entity.Administer;
public interface IAdministerDao {
	public Administer validateAdminLogin(String name,String password);
	public Administer validateSuperAdminLogin(String name,String password);
	public void AdminRegist(Administer administer);
	public void deleteAdmin(Administer administer);
	public void verifyAdmin(Administer administer);
}
