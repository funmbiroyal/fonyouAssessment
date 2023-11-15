package com.fonyouAssesment.productApi.services;

import com.fonyouAssesment.productApi.data.model.Product;
import com.fonyouAssesment.productApi.data.repositories.ProductRepository;
import com.fonyouAssesment.productApi.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public BigDecimal getAmountById(Long productId) {
        Optional<Product> productOptional = productRepository.findById(productId);

        if (productOptional.isPresent()) {
            return productOptional.get().getAmount();
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }
}

