package com.sky.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImp1 implements ProductRepository {

	private static List<Product> products = new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {

		System.out.println("in repository ADD");
		products.add(product);
	}

	@Override
	public List<Product> getProduct() {
		return products;
	}
	
	public Product getProductByid(String id) {
		
		for(Product prod: products) {
			if(prod.getProductId().equals(id)) {
				return prod;
			}
		}
		return null;
	}

	@Override
	public Product deleteByid(String id) {
		int index=0;
		for(Product del: products) {
		if(del.getProductId().equals(id)) {
			products.remove(index);   ////list of objects
			
			return del;
		}
		index=index +1;
	}
		return null;
	}

	@Override
	public Product updateByid(Product newProduct) {
		System.out.println("in repository UPDATE");
		int index=0;
		for(Product update: products) {
		if(update.getProductId().equals(newProduct.getProductId())) {
			products.set(index, newProduct);
			
			return update;
		}
		index=index +1;
	}
		return null;
	}

}
