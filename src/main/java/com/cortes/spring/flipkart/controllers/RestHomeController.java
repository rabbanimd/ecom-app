package com.cortes.spring.flipkart.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cortes.spring.flipkart.model.Product;
import com.cortes.spring.flipkart.service.ProductService;

@RestController
@RequestMapping("/api/")
public class RestHomeController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
}
