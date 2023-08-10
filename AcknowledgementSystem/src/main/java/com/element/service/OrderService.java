package com.element.service;

import com.element.entity.AdDocument;
import com.element.entity.OrderHeader;
import com.element.entity.ProductInfo;

public interface OrderService {
	
	public OrderHeader AddOrder(OrderHeader orderheader);
	
	public ProductInfo addProduct(ProductInfo product);
	
	public AdDocument AdDocGenerateandPersist(OrderHeader order);

}
