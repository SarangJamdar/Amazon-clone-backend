package com.ecom.api.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.api.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
