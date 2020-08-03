package com.shopee.shopeebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopee.shopeebackend.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
