package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity

@Table (name = "ORDER")
public class Order {

    @Id
    @Column(name = "idOrder")
    private long idOrder;

    @Column(name = "orderDate")
    //private date orderDate;

    List<Product> list = new ArrayList<>();

   // @Column(name = "totalAmount")
   // private bigdecimal totalAmount;
}
