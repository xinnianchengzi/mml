package com.mml.dao;

import com.mml.entity.Address;
import com.mml.entity.Memberuser;
public interface IAddressDao {
	public void getAddressById(Memberuser member);
	public void addAddress(Address address);
	public void deleteAddress(Address address);
	public void modifyAddress(Address address);
}
