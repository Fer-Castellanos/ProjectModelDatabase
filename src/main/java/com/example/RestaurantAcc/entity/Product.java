package com.example.RestaurantAcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity

@Table (name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private long idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "idcategory")
    private long idcategory;


    @Column(name = "price")
    private BigDecimal price;


    public long getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getIdcategory() {
        return idcategory;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIdcategory(long idcategory) {
        this.idcategory = idcategory;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
