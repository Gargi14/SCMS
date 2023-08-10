package com.element.serviceimpl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.entity.AdDocument;
import com.element.entity.OrderHeader;
import com.element.entity.ProductInfo;
import com.element.repository.AdDocumentRepository;
import com.element.repository.OrderHeaderRepository;
import com.element.repository.ProductInfoRepository;
import com.element.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	static Logger logger=Logger.getLogger(OrderServiceImpl.class);


	@Autowired
	private OrderHeaderRepository repo;
	@Autowired
	private ProductInfoRepository prodrepo;
	@Autowired
	private AdDocumentRepository adDoc;
	
	@Override
	public OrderHeader AddOrder(OrderHeader orderheader) {
		OrderHeader save = repo.save(orderheader);
		return save;
	}

	@Override
	public ProductInfo addProduct(ProductInfo product) {
		ProductInfo save = prodrepo.save(product);
		return save;
	}

	@Override
	public AdDocument AdDocGenerateandPersist(OrderHeader order) {
		AdDocument adDocument=new AdDocument();
		ProductInfo storeProductInfo = prodrepo.findByProductNumber(order.getOrderItems().getProductNumber());
		
		if(storeProductInfo.getProductQty()>=order.getOrderItems().getProductQty()) {
			adDocument.setAcknowledgementType("AD");
			adDocument.setUserName(order.getUserName());
			adDocument.setPurchaseOrderNumber(order.getPurchaseOrderNumber());
			adDocument.setOrderItems(order.getOrderItems());
			
			AdDocument saveaddoc = adDoc.save(adDocument);
			System.out.println(saveaddoc);
		}
		
		
		
		
		return adDocument;
	}

}
