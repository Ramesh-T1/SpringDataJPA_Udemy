package com.practice.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.customer.entities.Customer;
import com.practice.customer.repos.CustomerRepository;

@SpringBootTest
class CustomerApplicationTests {
    @Autowired
    CustomerRepository customerRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createData() {
		Customer c=new Customer();
		c.setId(1);
		c.setName("Ramesh");
		c.setEmail("ramesh@gmail.com");
		customerRepository.save(c);
	}
	
	@Test
	public void readData() {
		Customer cg=customerRepository.findById(1).get();
		System.out.println("Customer Id = "+cg.getId());
		System.out.println("Customer Name = "+cg.getName());
		System.out.println("Customer Email = "+cg.getEmail());
	}
	
	@Test
	public void updateData() {
		Customer cf=customerRepository.findById(1).get();
		cf.setEmail("ramesh123@gmail.com");
		customerRepository.save(cf);
	}
	
	@Test
	public void deleteData() {
		customerRepository.deleteById(1);
	}
	
	@Test
	public void countData() {
		System.out.println("Count = "+customerRepository.count());
	}

}
