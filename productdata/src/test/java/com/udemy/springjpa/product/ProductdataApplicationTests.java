package com.udemy.springjpa.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

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
		product.setName("IPhone");
		product.setDesc("From Apple");
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
	
	@Test
	void testFindProductByName() {
		List<Product> products = productRepository.findByName("TV");
		products.forEach(product -> System.out.println(product.getDesc()));
	}
	
	@Test
	void testFindProductByNameAndDesc() {
		List<Product> products = productRepository.findByNameAndDesc("TV", "From Samsung");
		products.forEach(product -> System.out.println(product.getName()));
	}
	
	@Test
	void testFindProductByPriceGreaterThan() {
		List<Product> products = productRepository.findByPriceGreaterThan(3000d);
		products.forEach(product -> System.out.println(product.getName()));
	}
	
	@Test
	void testFindProductByDescContains() {
		List<Product> products = productRepository.findByDescContains("LG");
		products.forEach(product -> System.out.println(product.getName()));
	}
	
	@Test
	void testFindProductByPriceBetween() {
		List<Product> products = productRepository.findByPriceBetween(2000d, 5000d);;
		products.forEach(product -> System.out.println(product.getName()));
	}
	
	@Test
	void testFindProductDescLike() {
		List<Product> products = productRepository.findByDescLike("%Apple%");
		products.forEach(product -> System.out.println(product.getName()));
	}
	
	@Test
	void testFindProductByIdsIn() {
		List<Product> products = productRepository.findByIdIn(Arrays.asList(1,2,3));
		products.forEach(product -> System.out.println(product.getName()));
	}

}
