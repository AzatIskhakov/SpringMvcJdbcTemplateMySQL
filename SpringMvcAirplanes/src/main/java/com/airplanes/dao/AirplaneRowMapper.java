package com.airplanes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.airplanes.model.Airplane;

public class AirplaneRowMapper implements RowMapper<Airplane> {

	@Override
	public Airplane mapRow(ResultSet rs, int rowNum) throws SQLException {
		Airplane airplane = new Airplane();
		airplane.setAirplaneId(rs.getInt("airplaneId"));
		airplane.setManufacturer(rs.getString("manufacturer"));
		airplane.setModel(rs.getInt("model"));
		airplane.setCity(rs.getString("city"));
		airplane.setRegistrationNumber(rs.getString("registrationNumber"));
		return airplane;
	}

}
