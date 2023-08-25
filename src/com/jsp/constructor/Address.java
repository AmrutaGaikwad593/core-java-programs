package com.jsp.constructor;

public class Address {
	
	private String street_name;
	private String landmark;
	private String city;
	private String state;
	
	Address(String street_name,String landmark,String city,String state)
	{
		this.street_name=street_name;
		this.landmark=landmark;
		this.city=city;
		this.state=state;
	}
	
	
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
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

	
	public void printAddressDetails() {
		System.out.println("====Address====");
		System.out.println(street_name);
		System.out.println(landmark);
		System.out.println(city);
		System.out.println(state);
		
	}
}
