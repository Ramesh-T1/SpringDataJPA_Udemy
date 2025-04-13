package com.example.componentMapping.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String streetname;
	private String city;
	private String state;
	private String pincode;
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
    
}
