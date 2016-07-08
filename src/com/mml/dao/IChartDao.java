package com.mml.dao;
import com.mml.entity.Chart;
import java.util.List;
public interface IChartDao {
	public List<Chart> getChart();
	public void addChart(Chart chart);
	public void deleteChart(Chart chart);
}
