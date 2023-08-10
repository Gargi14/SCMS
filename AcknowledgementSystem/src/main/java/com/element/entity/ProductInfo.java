package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String productName;
	private Long productNumber;
	private Integer productQty;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}
	public Integer getProductQty() {
		return productQty;
	}
	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}
	
	ProductInfo(){}
	
	
	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", productName=" + productName + ", productNumber=" + productNumber
				+ ", productQty=" + productQty + "]";
	}
	public ProductInfo(Integer id, String productName, Long productNumber, Integer productQty) {
		super();
		this.id = id;
		this.productName = productName;
		this.productNumber = productNumber;
		this.productQty = productQty;
	}
	
	
	
	

}
