package com.shopee.shopeebackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shopee.shopeebackend.Entities.Product;
import com.shopee.shopeebackend.dao.ProductDao;
import com.shopee.shopeebackend.dao.ProductDaoImpl;
import com.shopee.shopeebackend.models.AppResponse;

@Service("shopeeService")
public class ShopeeService {
	
	private ProductDao productDao;
	
	@Autowired
	public ShopeeService(@Qualifier("productDaoImpl") ProductDaoImpl productDaoImpl){
		this.productDao= productDaoImpl;
	}
	
	public AppResponse listAllProducts(){
		
		List<Product> productList =  productDao.getAllProducts();
		AppResponse appResponse = AppResponse.builder().description("Product List").success(true).result(productList).build();
		return appResponse;
	}
}
