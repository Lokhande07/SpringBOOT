package com.sky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.domain.Product;
import com.sky.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public @ResponseBody List<Product> getProducts(){
		return productService.getProduct();
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public @ResponseBody Product addProduct(@RequestBody Product product) {
		System.out.println(product);
		productService.addProduct(product);
		return product;
	}
	
	@RequestMapping(value="/product/{id}" ,method=RequestMethod.GET)
	public @ResponseBody Product getProductByid(@PathVariable("id") String id) {
		return productService.getProductByid(id);
	}

	@RequestMapping(value="/product/{id}" ,method=RequestMethod.DELETE)
	public @ResponseBody Product deleteByid(@PathVariable("id") String id) {
		return productService.deleteByid(id);
	}
	
	@RequestMapping(value="/product" ,method=RequestMethod.PUT)
	public @ResponseBody Product updateByid(@RequestBody Product newProduct) {
		return productService.updateByid(newProduct);
	}


}
