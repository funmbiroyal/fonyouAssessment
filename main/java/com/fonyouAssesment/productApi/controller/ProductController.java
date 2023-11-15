package com.fonyouAssesment.productApi.controller;

import com.fonyouAssesment.productApi.data.model.Product;
import com.fonyouAssesment.productApi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product createdProduct = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @GetMapping("/get/{productId}")
    public ResponseEntity<BigDecimal> getProductAmount(@PathVariable Long productId) {
        BigDecimal amount = productService.getAmountById(productId);
        return ResponseEntity.ok(amount);
    }



}