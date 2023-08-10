package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItems {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer productId;
		private Long productNumber;
		private String productDescription;
		private Integer productQty;
		private Long productPrice;
		
		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public Long getProductNumber() {
			return productNumber;
		}
		public void setProductNumber(Long productNumber) {
			this.productNumber = productNumber;
		}
		public String getProductDescription() {
			return productDescription;
		}
		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}
		public Integer getProductQty() {
			return productQty;
		}
		public void setProductQty(Integer productQty) {
			this.productQty = productQty;
		}
		public Long getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(Long productPrice) {
			this.productPrice = productPrice;
		}
		@Override
		public String toString() {
			return "OrderItems [productId=" + productId + ", productNumber=" + productNumber + ", productDescription="
					+ productDescription + ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
		}
		public OrderItems(Integer productId, Long productNumber, String productDescription, Integer productQty,
				Long productPrice) {
			super();
			this.productId = productId;
			this.productNumber = productNumber;
			this.productDescription = productDescription;
			this.productQty = productQty;
			this.productPrice = productPrice;
		}
		
		
}
