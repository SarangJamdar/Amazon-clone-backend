package com.ecom.api.demo.service;

import java.util.List;

import com.ecom.api.demo.dto.ProductDTO;
import com.ecom.api.demo.model.Product;


public interface AdminService {
	Product createProduct(Product product);

	Product getProduct(int id);

	List<Product> getAllProduct();

	Product updateProduct(Product product);

	String deleteProduct(int id);

	
	
}
