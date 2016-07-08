package com.mml.dao;
import com.mml.entity.Categorya;
import java.util.List;
public interface ICategoryaDao {
	public List<Categorya> getCategorya();
	public void addCategorya(Categorya categorya);
	public void deleteCategorya(Integer id);
}
