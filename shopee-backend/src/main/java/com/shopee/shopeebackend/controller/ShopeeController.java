package com.shopee.shopeebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopee.shopeebackend.models.AppResponse;
import com.shopee.shopeebackend.services.ShopeeService;

import lombok.extern.slf4j.Slf4j;


/**
 * Controller related to game
 * 
 * @author shivam kumar
 */
@RestController
@RequestMapping(value = "/api/v1/shopee")
@Slf4j
@CrossOrigin("*")
public class ShopeeController {
	
	private ShopeeService shopeeService;

	@Autowired
	public ShopeeController(@Qualifier("shopeeService") ShopeeService shopeeService){
		this.shopeeService= shopeeService;
	}
	
	@GetMapping(path="/products", produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<AppResponse> listBets(){
		
		AppResponse res = shopeeService.listAllProducts();
		log.info("Output Json : Lists extraction finished -- ");
		return ResponseEntity.ok(res);
	}
}