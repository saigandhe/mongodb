package com.capgemini.productapp.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.productapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{
	@Query("{'productName': {'$regex':?0}}")
	public List<Product> findByProductName(String nameContains);
	
	@Query("{productCategory : ?0}")
	public List<Product> findByProductCategory(String categoryContains);
	
	@Query("{'productCategory': ?0 , 'productPrice':{$gt : ?2 , $lt: ?1}}")
	public List<Product> findProductByCategoryAndPrice(String categoryContains , double max, double min);

}
