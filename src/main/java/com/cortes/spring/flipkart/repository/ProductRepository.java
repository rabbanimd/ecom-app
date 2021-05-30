package com.cortes.spring.flipkart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cortes.spring.flipkart.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
