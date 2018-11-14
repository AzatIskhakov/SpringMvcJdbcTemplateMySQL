package com.airplanes.model;

public class Airplane {
	
//	private static final long serialVersionUID = -7788619177798333712L;
	
	private int airplaneId;
	private String manufacturer;
	private int model;
	private String city;
	private String registrationNumber;
	
	public int getAirplaneId() {
		return airplaneId;
	}
	public void setAirplaneId(int airplaneId) {
		this.airplaneId = airplaneId;
	}
	
//	@JsonSerialize(using=StringSerializer.class)
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	@Override
	public String toString() {
		return "Airplane [airplaneId=" + airplaneId + ", manufacturer=" + manufacturer + ", model=" + model + ", city="
				+ city + ", registrationNumber=" + registrationNumber + "]";
	}
	
}
