package com.shopee.shopeebackend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopee.shopeebackend.Entities.Product;
import com.shopee.shopeebackend.repositories.ProductRepository;

@Service("productDaoImpl")
public class ProductDaoImpl implements ProductDao{
		
	@Autowired
	private ProductRepository productRepo;

	public List<Product> getAllProducts(){
		
		return productRepo.findAll();
	}
}