package com.example.RestaurantAcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table (name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory")
    private long idCategory;

    @Column( name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public long getIdCategory() {

        return idCategory;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }

    public void setIdCategory(long idCategory) {

        this.idCategory = idCategory;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setDescription(String description) {

        this.description = description;
    }


}
