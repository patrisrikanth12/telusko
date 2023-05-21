package com.patrisrikanth12.live2.productmanagement;

import java.util.List;

import com.patrisrikanth12.live2.productmanagement.entities.Product;
import com.patrisrikanth12.live2.productmanagement.services.ProductService;

public class Main {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		productService.addProduct(new Product("Dell Mouse", "Mouse", "Table", 2022));
		productService.addProduct(new Product("MI Charger", "Charger", "Cupboard", 2023));
		productService.addProduct(new Product("Mobile Phone", "Phone", "Table", 2024));
		
		System.out.println("=== all products ===");
		List<Product> products = productService.getAllProducts();
		for(Product p : products) {
			System.out.println(p);
		}
		
		System.out.println("=== mouse product ===");
		Product mouse = productService.getProduct("Dell Mouse");
		System.out.println(mouse);
		
		System.out.println("=== products constaing text \" table \" ===");
		List<Product> productsWithTextTable = productService.getProductsWithText("table");
		for(Product p : productsWithTextTable) {
			System.out.println(p);
		}
		
		System.out.println("=== out of warranty");
		List<Product> outOfWarrantyProducts = productService.getProductsOutOfWarranty();
		for(Product p : outOfWarrantyProducts) {
			System.out.println(p);
		}
	}
}
