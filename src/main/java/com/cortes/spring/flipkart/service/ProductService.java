package com.cortes.spring.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cortes.spring.flipkart.model.Product;
import com.cortes.spring.flipkart.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts()
	{
		Pageable pg =PageRequest.of(0, 20);
		
		 Page<Product> products = productRepository.findAll(pg);
		List<Product> all = products.getContent();
		return all;
	}
}
