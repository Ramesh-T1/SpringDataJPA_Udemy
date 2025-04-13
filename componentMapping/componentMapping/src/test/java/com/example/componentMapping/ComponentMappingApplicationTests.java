package com.example.componentMapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.componentMapping.entities.Address;
import com.example.componentMapping.entities.Employee;
import com.example.componentMapping.repos.EmployeeRepository;

@SpringBootTest
class ComponentMappingApplicationTests {
    @Autowired
    EmployeeRepository emprepo;
	
	@Test
	void contextLoads() {
	}
    @Test
    public void createEmpDetails() {
    	Employee e=new Employee();
    	e.setId(1);
    	e.setName("Ramesh Nadar");
    	Address a=new Address();
    	a.setStreetname("JNPT highway");
    	a.setCity("Mumbai");
    	a.setState("Maharashtra");
    	a.setPincode("600102");
    	e.setAddress(a);
    	emprepo.save(e);
    }
}
