package com.example.customer.response;

import lombok.Data;

@Data
public class CustomerProductResponse {
    private String customerName;
    private String productName;
    private double productPrice;
	public CustomerProductResponse(String customerName, String productName, double productPrice) {
		super();
		this.customerName = customerName;
		this.productName = productName;
		this.productPrice = productPrice;
	}
  
}
