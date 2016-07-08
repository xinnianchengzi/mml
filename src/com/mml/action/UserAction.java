package com.mml.action;

import javax.annotation.Resource;

import com.mml.entity.User;
import com.mml.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private User user;

	@Resource  
	private IUserService userManage;
	

	public void setUserManage(IUserService userManage) {
		this.userManage = userManage;
	}
	
	public IUserService getUserManage() {
		return userManage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String addUser()
	{
		System.out.println("-------userAction.addUser--------"+user.getName());
		
		userManage.addUser(user);
		return "success";
	}
	
	public String modifyUser()
	{
		System.out.println("-------userAction.modifyUser--------"+user.getName());
		userManage.modifyUser(user);
		return "success";
	}
	
	public String deleteUser()
	{
		System.out.println("-------userAction.deleteUser--------"+user.getName());
		userManage.deleteUser(user);
		return "success";
	}
	
	
}
