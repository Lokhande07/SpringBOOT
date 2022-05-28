package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;

@Service
public class ProductServiceImp1 implements ProductService {

	@Autowired
	private ProductRepository productRepository;  //

	@Override
	public void addProduct(Product product) {
		System.out.println("in service");
		if(product.getPrice()>20) {
			productRepository.addProduct(product);
		}
		
	}

	@Override
	public List<Product> getProduct() {
		return productRepository.getProduct();
	}

	@Override
	public Product getProductByid(String id) {
		System.out.println("get by id");
		return productRepository.getProductByid(id);
	}

	@Override
	public Product deleteByid(String id) {
		System.out.println("delete by id");
		return productRepository.deleteByid(id);
	}

	@Override
	public Product updateByid(Product newProduct) {
		System.out.println("Update by id");
		return productRepository.updateByid(newProduct);
	}

	

}
