package com.example.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ManyToMany.entities.Programmer;
import com.example.ManyToMany.entities.Project;
import com.example.ManyToMany.repos.Project_Programmer_Repository;

@SpringBootTest
class ManyToManyApplicationTests {
	@Autowired
	Project_Programmer_Repository ppr;

	@Test
	void contextLoads() {
	}
	
	//As I am using Child Class Repository (Working)
/*	@Test
	public void createData() {
		Programmer pg=new Programmer();
		pg.setName("Anu Nadar");
		pg.setAge(30);
		List<Project> pj=new ArrayList<>();
		Project p=new Project();
		p.setProject_name("Grameen Phone");
		p.setProgrammers(List.of(pg));
		pj.add(p);
		pg.setProjects(pj);
		ppr.save(pg);
	}*/
	
	//Using Parent Class Repository
	@Test
	public void parentCreateData() {
		Project pj=new Project();
		pj.setProject_name("Airtel");
		Programmer pg=new Programmer();
		List<Programmer> p=new ArrayList<>();
		pg.setName("Ramesh Nadar");
		pg.setAge(25);
		p.add(pg);
		pj.setProgrammers(p);
        ppr.save(pj);
	}

}
