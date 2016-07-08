package com.mml.dao;
import com.mml.entity.Advertisement;
import java.util.List;
public interface IAdvertismentDao {
	public List<Advertisement> getAdvertisements();
	public void addAdvertisement(Advertisement advertisment);
	public void deleteAdvertisement(Integer id);
}
