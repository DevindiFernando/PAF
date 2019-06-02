package com.buyer.demo.buyer;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "buyer")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "buyer_regno", nullable = false, unique = true)
    private String buyerRegno;

    @Column(name = "buyer_firstname", nullable = false)
    private String buyerFirstname;

    @Column(name = "buyer_lastname", nullable = false)
    private String buyerLastname;

    @Column(name = "buyer_password", nullable = false)
    private String buyerPassword;

    @Column(name = "buyer_streetAddress", nullable = false)
    private String buyerStreetAddress;

    @Column(name = "buyer_city", nullable = false)
    private String buyerCity;

    @Column(name = "buyer_zipcode", nullable = false)
    private int buyerZipcode;

    @Column(name = "buyer_country", nullable = false)
    private String buyerCountry;

   @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @CreationTimestamp
    private Date updatedAt;

    public Buyer(){

    }

    public Buyer(String buyer_regno, String buyer_firstname, String buyer_lastname, String buyer_password, String buyer_streetAddress, String buyer_city, int buyer_zipcode, String buyer_country){
        this.setBuyerRegno(buyerRegno);
        this.setBuyerFirstname(buyerFirstname);
        this.setBuyerLastname(buyerLastname);
        this.setBuyerPassword(buyerPassword);
        this.setBuyerStreetAddress(buyerStreetAddress);
        this.setBuyerCity(buyerCity);
        this.setBuyerZipcode(buyerZipcode);
        this.setBuyerCountry(buyerCountry);
    }

    public int getId(){return id;}

    public String getBuyerRegno(){return buyerRegno;}

    public void setBuyerRegno(String buyerRegno) {this.buyerRegno = buyerRegno;}

    public String getBuyerFirstname(){return buyerFirstname;}

    public void setBuyerFirstname(String buyerFirstname) {this.buyerFirstname = buyerFirstname;}

    public String getBuyerLastname(){return buyerLastname;}

    public void setBuyerLastname(String buyerLastname) {this.buyerLastname = buyerLastname;}

    public String getBuyerPassword(){return buyerPassword;}

    public void setBuyerPassword(String buyerPassword) {this.buyerPassword = buyerPassword;}

    public String getBuyerStreetAddress(){return buyerStreetAddress;}

    public void setBuyerStreetAddress(String buyerStreetAddress) {this.buyerStreetAddress = buyerStreetAddress;}

    public String getBuyerCity(){return buyerCity;}

    public void setBuyerCity(String buyerCity) {this.buyerCity = buyerCity;}

    public int getBuyerZipcode(){return buyerZipcode;}

    public void setBuyerZipcode(int buyerZipcode) {this.buyerZipcode = buyerZipcode;}

    public String getBuyerCountry(){return buyerCountry;}

    public void setBuyerCountry(String buyer_country) {this.buyerCountry = buyerCountry;}

    public Date getCreatedAt() {return createdAt;}

    public void setCreatedAt(Date createdAt){this.createdAt = createdAt;}

    public Date getUpdatedAt(){ return updatedAt;}

    public void setUpdatedAt(Date updatedAt){this.updatedAt = updatedAt;}
}
