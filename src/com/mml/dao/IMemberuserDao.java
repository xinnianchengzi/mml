package com.mml.dao;

import com.mml.entity.Memberuser;

public interface IMemberuserDao {
	public Memberuser validateMemberLogin(String name,String password);
	public void addMemberUsr(Memberuser memberuser);
	public void MemberUserRegist(Memberuser memberuser);
	public void modifyMemberUser(Memberuser memberuser);
	public void deleteMemberUser(Memberuser memberuser);
}
