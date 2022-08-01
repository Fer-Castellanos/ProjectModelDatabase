package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table (name = "PRODUCT")
public class Product {

    @Id
    @Column(name = "idProduct")
    private long idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public long getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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


}
