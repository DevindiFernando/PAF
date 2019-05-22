package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductByProductCode(String productCode) {
        return productRepository.findProductByProductCode(productCode);
    }

    public Product createProduct(Product product) {return productRepository.save(product);}

    public Product updateProduct(int id, Product productDetails){
        Product product = productRepository.findProductById(id);
        product.setProductCode(productDetails.getProductCode());
        product.setProductName(productDetails.getProductName());
        product.setProductPrice(productDetails.getProductPrice());
        product.setProductCategory(productDetails.getProductCategory());
        product.setProductDescription(productDetails.getProductDescription());
        product. setProductQuantity(productDetails.getProductQuantity());

        return productRepository.save(product);
    }

    public void deleteProduct(int id){productRepository.deleteProductById(id);}


}