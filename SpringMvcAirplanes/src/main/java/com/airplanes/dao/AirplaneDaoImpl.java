package com.airplanes.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.airplanes.model.Airplane;

public class AirplaneDaoImpl implements AirplaneDao {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	public boolean addAirplane(Airplane airplane) {
		String sqlQuery = "INSERT INTO airplanes (manufacturer, model, city, registrationNumber) VALUES(?,?,?,?)";
		Object[] args = new Object[] { airplane.getManufacturer(), airplane.getModel(), airplane.getCity(), airplane.getRegistrationNumber() };
		return jdbcTemplate.update(sqlQuery, args) == 1;
	}

	public Airplane getAirplaneById(Integer airplaneId) {
		String sqlQuery = "SELECT * FROM airplanes WHERE airplaneId = ?";
		Object[] args = new Object[] {airplaneId};
		Airplane airplane = jdbcTemplate.queryForObject(sqlQuery, new AirplaneRowMapper());
		return airplane;
	}

	public List<Airplane> getAllAirplanes() {
		String sqlQuery = "SELECT * FROM airplanes";
		List<Airplane> airplanes = jdbcTemplate.query(sqlQuery, new AirplaneRowMapper());
		return airplanes;
	}

	public boolean deleteAirplane(Airplane airplane) {
		String sqlQuery = "DELETE FROM airplanes WHERE airplaneId = ?";
		Object[] args = new Object[] { airplane.getAirplaneId() };
		return jdbcTemplate.update(sqlQuery, args) == 1;
	}

	public boolean updateAirplane(Airplane airplane) {
		String sqlQuery = "UPDATE airplanes SET model = ? WHERE airplaneId = ?";
		Object[] args = new Object[] { airplane.getModel(), airplane.getAirplaneId() };
		return jdbcTemplate.update(sqlQuery, args) == 1;
	}

}
