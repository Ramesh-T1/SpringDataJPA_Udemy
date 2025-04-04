package com.practice.product_data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.product_data.entities.Product;
import com.practice.product_data.repos.ProductRepository;

@SpringBootTest
class ProductDataApplicationTests {
    @Autowired
    ProductRepository productRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Product p=new Product();
		p.setId(1);
		p.setName("Iphone");
		p.setDesc("Pro");
		p.setPrice(10000d);
		productRepository.save(p);
	}
	
	@Test
	public void testRead() {
		Product pr=productRepository.findById(1).get();
		assertNotNull(pr);
		assertEquals("Iphone",pr.getName());
		System.out.println("Product Price = "+pr.getPrice());
	}
	
	@Test
	public void testUpdate() {
		Product pr=productRepository.findById(1).get();
		pr.setPrice(20000d);
		productRepository.save(pr);
	}
	
	@Test
	public void testDelete() {
		if(productRepository.existsById(1)) {
			productRepository.deleteById(1);
		}	
	}
	
	@Test
	public void testCount() {
		System.out.println("Count = "+productRepository.count());
	}

}
