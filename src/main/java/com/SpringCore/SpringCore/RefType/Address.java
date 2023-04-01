package com.SpringCore.SpringCore.RefType;

public class Address {
	
	private int flatNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
	
	
	public Address() {
		
	}

	public Address(int flatNumber, String streetName, String city, String state, String zipCode) {
		super();
		this.flatNumber = flatNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}
	
	
	
	


}
