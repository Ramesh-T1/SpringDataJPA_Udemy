package com.practice.product_data.repos;

import org.springframework.data.repository.CrudRepository;

import com.practice.product_data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
