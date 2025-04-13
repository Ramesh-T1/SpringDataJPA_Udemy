package com.example.componentMappingAssignment;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.componentMappingAssignment.Repository.Customer_AddressRepository;
import com.example.componentMappingAssignment.entities.Address;
import com.example.componentMappingAssignment.entities.Customer_Address;

@SpringBootTest
class ComponentMappingAssignmentApplicationTests {
    @Autowired
    Customer_AddressRepository carepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createData() {
		Customer_Address ca=new Customer_Address();
		ca.setCustomerName("Prabhakaran");
		ca.setCustomerAge("30");
		Address a=new Address();
		a.setStreet("DY Patil Road");
		a.setCity("Navi Mumbai");
		a.setState("Maharashtra");
		a.setPincode("400112");
		a.setCountry("India");
		ca.setAddress(a);
		carepo.save(ca);
	}
	
	@Test
	public void readData() {
		List<Customer_Address> l=carepo.findAll();
		for(Customer_Address x:l) {
			System.out.println(x.getId());
			System.out.println(x.getCustomerName());
			System.out.println(x.getCustomerAge());
			System.out.println(x.getAddress().getStreet());
			System.out.println(x.getAddress().getCity());
			System.out.println(x.getAddress().getState());
			System.out.println(x.getAddress().getPincode());
			System.out.println(x.getAddress().getCountry());
			System.out.println(x);
		}
	}
}
