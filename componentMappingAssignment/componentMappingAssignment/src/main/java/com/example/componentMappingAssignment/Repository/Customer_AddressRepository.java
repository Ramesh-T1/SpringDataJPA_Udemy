package com.example.componentMappingAssignment.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.componentMappingAssignment.entities.Customer_Address;

public interface Customer_AddressRepository extends CrudRepository<Customer_Address, Integer> {
	List<Customer_Address> findAll();
}
