package com.bgapparov.demo.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bgapparov.demo.domain.Product;



@RestController
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value = "/{userId}")
	public String displayUser(@PathVariable int userId) {
		
		return "User found: " + userId;
	}
	
	@RequestMapping(value = "/{userId}/invoices")
	public String displayUserInvoices(@PathVariable int userId, @RequestParam(value = "date", required = false) Date dateOrNull) {
		
		return "Invoice found for user " + userId + " on the date " + dateOrNull;
	}
	
	@RequestMapping("{userId}/items")
	public List<String> displayStringJson(){	
		
		return Arrays.asList("Baiaman", "Emil", "Elbek");
	}
	
	@RequestMapping("{userId}/productList")
	public List<Product> displayProductsJson(){
	
		return Arrays.asList(new Product(1, "pro1", 30.5),
				new Product(1, "pro1", 30.5),
				new Product(1, "pro1", 30.5));
	}
	
}
