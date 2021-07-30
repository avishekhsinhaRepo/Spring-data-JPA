package com.udemy.springjpa.product.repos;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springjpa.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
