package com.example.ManyToMany.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.ManyToMany.entities.Project;

/*Using Parent Class repository
 public interface Project_Programmer_Repository extends CrudRepository<Programmer,Integer> {
 
}*/

public interface Project_Programmer_Repository extends CrudRepository<Project,Integer>{}