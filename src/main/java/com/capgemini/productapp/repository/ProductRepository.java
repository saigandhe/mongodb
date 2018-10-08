package com.capgemini.productapp.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.productapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{
	@Query("{product: {$productName : 'redmi'}}")
	List<Product> findByProductName(String nameContains);
	@Query("{product: {$productCategory : 'laptop'}}")
	List<Product> findByProductCategory(String categoryContains);
	List<Product> findByProductPrice(double priceContains);

}
