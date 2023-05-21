package com.patrisrikanth12.live2.productmanagement.services;

import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.patrisrikanth12.live2.productmanagement.entities.Product;

public class ProductService {
	List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public List<Product> getAllProducts() {
		return products;
	}
	
	public Product getProduct(String name) {
		Product product = null;
		for(Product p: products) {
			if(p.getName().equals(name)) {
				product = p;
			}
		}
		return product;
	}
	
	public List<Product> getProductsWithText(String str) {
		final String text = str.toLowerCase();
		List<Product> requiredProducts;
		
		requiredProducts = products.stream().filter((p) -> {
			boolean flag = false;
			String name = p.getName().toLowerCase();
			String place = p.getPlace().toLowerCase();
			String type = p.getType().toLowerCase();
			if(name.contains(text) || place.contains(text) ||  type.contains(text)) {
				flag = true;
			}
			return flag;
		}).toList();
		
		return requiredProducts;
	}
	
	public List<Product> getProductsByPlace(String place) {
		place = place.toLowerCase();
		List<Product> requiredProducts = new ArrayList<Product>();
		for(Product p: products) {
			if(place.equals(place)) {
				requiredProducts.add(p);
			}
		}
		return requiredProducts;
	}
	
	public List<Product> getProductsOutOfWarranty() {
		List<Product> requiredProducts = new ArrayList<Product>();
		for(Product p: products) {
			if(p.getWarranty() < Year.now().getValue()) {
				requiredProducts.add(p);
			}
		}
		
		System.out.println(Year.now().getValue());
		return requiredProducts;
	}
}


