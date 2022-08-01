package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity

@Table (name = "ORDER")
public class Order {

    @Id
    @Column(name = "idOrder")
    private long idOrder;

    @Column(name = "orderDate")
    private date orderDate;

    List<Product> list = new ArrayList<>();

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
