package com.example.RestaurantAcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

@Table (name = "ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //te genera el numero automaticamente para el id
    @Column(name = "idOrder")
    private long idOrder;

    @Column(name = "orderDate")
    private Date orderDate;

    // accesos como puedes utilizar el framework hibernate
    //nos ayuda a definir la relacion de uno a muchos
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "idOrder")
    private List<Product> list = new ArrayList<>();



    @Column(name = "totalAmount")
    private BigDecimal totalAmount;


    public long getIdOrder() {
        return idOrder;
    }

    public List<Product> getList() {
        return list;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void setOrder(Order order) {
    }
}
