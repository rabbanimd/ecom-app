package com.cortes.spring.flipkart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cortes.spring.flipkart.model.Product;
import com.cortes.spring.flipkart.service.ProductService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="", method = RequestMethod.GET)
	public String root(Model model)
	{
		List<Product> allProducts = productService.getAllProducts();
		model.addAttribute("allProducts",allProducts);
		return "index";
	}
}
