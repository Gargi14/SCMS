package com.element.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.entity.OrderHeader;
@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Integer> {
	
	

}