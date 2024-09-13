package com.ecom.api.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.demo.model.Product;
import com.ecom.api.demo.repo.ProductRepository;

@Service
public class UserProductServiceImpl implements UserProductService {

	@Autowired
	private ProductRepository proRepo;

	@Override
	public List<Product> getAllProduct() {
		List<Product> list= null;
		
		list=proRepo.findAll();
		return list;
	}
	
}
