package com.mml.dao;
import com.mml.entity.Categoryb;
import java.util.List;
public interface ICategorybDao {
	public List<Categoryb> getCategoryb();
	public void addCategoryb(Categoryb categoryb);
	public void deleteCategoryb(Integer id);
}
