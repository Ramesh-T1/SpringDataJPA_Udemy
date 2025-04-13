package com.example.componentMappingAssignment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_address")
public class Customer_Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String customerName;
	@Column(name="age")
	private String customerAge;
	@Embedded
	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer_Address [id=" + id + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", address=" + address + "]";
	}

}
