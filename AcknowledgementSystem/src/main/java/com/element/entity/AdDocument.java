package com.element.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class AdDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userName;
	private Long purchaseOrderNumber;
	private LocalDate documentsCreateDate;
	private String acknowledgementType;
	
	@OneToOne
	private OrderItems orderItems;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public LocalDate getDocumentsCreateDate() {
		return documentsCreateDate;
	}

	public void setDocumentsCreateDate(LocalDate documentsCreateDate) {
		this.documentsCreateDate = documentsCreateDate;
	}

	public String getAcknowledgementType() {
		return acknowledgementType;
	}

	public void setAcknowledgementType(String acknowledgementType) {
		this.acknowledgementType = acknowledgementType;
	}

	public OrderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "AdDocument [id=" + id + ", userName=" + userName + ", purchaseOrderNumber=" + purchaseOrderNumber
				+ ", documentsCreateDate=" + documentsCreateDate + ", acknowledgementType=" + acknowledgementType
				+ ", orderItems=" + orderItems + "]";
	}
	
	
	

}
