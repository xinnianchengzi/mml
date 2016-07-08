package com.mml.dao;
import com.mml.entity.Grades;
import java.util.List;
public interface IGradesDao {
	public List<Grades> getGrades();
	public void modifyGrades(Integer points,Integer id);
}
