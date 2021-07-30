package com.udemy.springjpa.product.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springjpa.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findByName(String name);

	List<Product> findByNameAndDesc(String name, String desc);

	List<Product> findByPriceGreaterThan(Double price);

	List<Product> findByDescContains(String name);

	List<Product> findByPriceBetween(Double price1, Double price2);
	
	List<Product> findByDescLike(String desc);
	
	List<Product> findByIdIn(List<Integer> ids);

}
