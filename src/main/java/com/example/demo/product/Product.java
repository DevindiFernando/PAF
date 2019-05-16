package com.example.demo.product;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "product_code", nullable = false,unique = true)
    private String productCode;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private float productPrice;

    @Column(name = "product_category", nullable = false)
    private String productCategory;

    @Column(name = "product_description", nullable = false)
    private String productDescription;

    @Column(name = "Product_quantity", nullable = false)
    private int productQuantity;


    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    public Product(){

    }

    public Product(String productCode,String productName, float productPrice, String productCategory, String productDescription, int productQuantity){
        this.setProductCode(productCode);
        this.setProductName(productName);
        this.setProductPrice(productPrice);
        this.setProductCategory(productCategory);
        this.setProductDescription(productDescription);
        this.setProductQuantity(productQuantity);
    }

    public int getId(){ return id;}

    public String getProductCode(){return productCode;}

    public void setProductCode(String productCode) {this.productCode = productCode;}

    public String getProductName() {return productName;}

    public void setProductName(String productName){this.productName = productName;}

    public float getProductPrice(){return productPrice;}

    public void setProductPrice(float productPrice){this.productPrice = productPrice;}

    public String getProductCategory() {return productCategory;}

    public void setProductCategory(String productCategory){this.productCategory = productCategory;}

    public String getProductDescription() {return productDescription;}

    public void setProductDescription(String productDescription){this.productDescription = productDescription;}

    public int getProductQuantity() {return productQuantity;}

    public void setProductQuantity(int productQuantity){this.productQuantity = productQuantity;}


    public Date getCreatedAt() {return createdAt;}

    public void setCreatedAt(Date createdAt){this.createdAt = createdAt;}

    public Date getUpdatedAt(){ return updatedAt;}

    public void setUpdatedAt(Date updatedAt){this.updatedAt = updatedAt;}

}









