package com.udemy.springjpa.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.springjpa.product.entities.Product;
import com.udemy.springjpa.product.repos.ProductRepository;

@SpringBootTest
class ProductdataApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {

	}

	@Test
	void testCreateProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Costly");
		product.setPrice(1000d);
		productRepository.save(product);
	}

	@Test
	void testReadProduct() {
		Product product = productRepository.findById(1).get();
		assertNotNull(product);
		assertEquals("Costly", product.getDesc());
	}

	@Test
	void testUpdateProduct() {
		if (productRepository.existsById(1)) {
			Product product = productRepository.findById(1).get();
			product.setPrice(5000d);
			productRepository.save(product);
		}

	}
	
	@Test
	void testDeleteProduct() {
		if (productRepository.existsById(1)) {
			Product product = productRepository.findById(1).get();
			product.setPrice(5000d);
			productRepository.delete(product);
		}

	}
	
	@Test
	void testCountProduct() {
		System.out.println(productRepository.count());
	}

}
