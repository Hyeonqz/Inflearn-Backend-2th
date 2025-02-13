package com.hkjin.practicaltesting.spring.domian.product;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Product extends BaseEntity{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String productNumber;

	@Enumerated(EnumType.STRING)
	private ProductType type;

	@Enumerated(EnumType.STRING)
	private ProductSellingType sellingType;

	private String name;

	private Integer price;

	@Builder
	public Product (String productNumber, ProductType type, ProductSellingType sellingType, String name,
		Integer price) {
		this.productNumber = productNumber;
		this.type = type;
		this.sellingType = sellingType;
		this.name = name;
		this.price = price;
	}

}
