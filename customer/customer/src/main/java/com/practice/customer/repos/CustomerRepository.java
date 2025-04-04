package com.practice.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.practice.customer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
