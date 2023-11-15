package com.fonyouAssesment.productApi.services;

import com.fonyouAssesment.productApi.data.model.Product;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

public interface ProductService {
    Product addProduct(Product product);
    BigDecimal getAmountById(Long productId);
}
