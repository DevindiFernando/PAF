package com.example.demo.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findProductByProductCode(String productCode);
    public void deleteProductById(int id);
    public Product findProductById(int id);
}
