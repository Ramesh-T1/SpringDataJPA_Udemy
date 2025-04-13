package com.example.CustomerAssignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.CustomerAssignment.entities.Customer_Assgn;
import com.example.CustomerAssignment.repos.Customer_AssgnRepository;

@SpringBootTest
class CustomerAssignmentApplicationTests {
    @Autowired
    Customer_AssgnRepository cagn;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createCustomer() {
		Customer_Assgn c1=new Customer_Assgn();
		c1.setName("Ramesh");
		c1.setEmail("ramesh123@gmail.com");
		cagn.save(c1);
		/*Customer_Assgn c2=new Customer_Assgn();
		c2.setName("Ravindra");
		c2.setEmail("ravindra@gmail.com");
		cagn.save(c2);*/
	}
}
