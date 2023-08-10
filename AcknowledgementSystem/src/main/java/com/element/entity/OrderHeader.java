package com.element.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class OrderHeader {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userName;
	private String userMob;
	private String userEmail;
	private Long purchaseOrderNumber;
	
	@CreationTimestamp
	private LocalDate purchaseOrderDate;
	
	@OneToOne(cascade= {CascadeType.ALL})
	private OrderItems orderItems;
	
	@OneToOne(cascade= {CascadeType.ALL})
	private Address address;
	
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
	public String getUserMob() {
		return userMob;
	}
	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public LocalDate getPurchaseOrderDate() {
		return purchaseOrderDate;
	}
	public void setPurchaseOrderDate(LocalDate purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}
	public OrderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrderHeader [id=" + id + ", userName=" + userName + ", userMob=" + userMob + ", userEmail=" + userEmail
				+ ", purchaseOrderNumber=" + purchaseOrderNumber + ", purchaseOrderDate=" + purchaseOrderDate
				+ ", orderItems=" + orderItems + ", address=" + address + "]";
	}
	public OrderHeader(Integer id, String userName, String userMob, String userEmail, Long purchaseOrderNumber,
			LocalDate purchaseOrderDate, OrderItems orderItems, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.userMob = userMob;
		this.userEmail = userEmail;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.purchaseOrderDate = purchaseOrderDate;
		this.orderItems = orderItems;
		this.address = address;
	}
	
	
	
	
	
}
