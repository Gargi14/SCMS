package com.element.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.entity.ProductInfo;
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,Integer> {

	public ProductInfo findByProductNumber(Long productNumber);
}
