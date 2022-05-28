package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {

	public void addProduct(Product product);
	public List<Product> getProduct();
	public Product getProductByid(String id);
	public Product deleteByid(String id);
	public Product updateByid(Product newProduct);

}
