package com.airplanes.dao;

import java.util.List;

import javax.sql.DataSource;

import com.airplanes.model.Airplane;

public interface AirplaneDao {
	
public void setDataSource(DataSource ds);
	
	public boolean addAirplane(Airplane airplane);
	
	public Airplane getAirplaneById(Integer airplaneId);
	
	public List<Airplane> getAllAirplanes();
	
	public boolean deleteAirplane(Airplane airplane);
	
	public boolean updateAirplane(Airplane airplane);

}
