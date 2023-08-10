package com.element.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.element.entity.OrderHeader;
import com.element.entity.ProductInfo;
import com.element.service.OrderService;

@RestController
public class MainController {
	
	static Logger logger=Logger.getLogger(MainController.class);

	
	@Autowired
	private OrderService orderservice;
	
	@PostMapping("/save")
	public OrderHeader SaveOrder(@RequestBody OrderHeader order ){
		
		
		logger.info("Started Executing Add Method");
 		OrderHeader addOrder = orderservice.AddOrder(order);
 		logger.info("Order Saved Successfully!!!");
 		
 		orderservice.AdDocGenerateandPersist(order);
		return addOrder;
		
	}
	
	@PostMapping("/saveProduct")
	public ProductInfo saveProduct(@RequestBody ProductInfo product) {
		ProductInfo addProduct = orderservice.addProduct(product);
		return addProduct;
		
	}
	

}
