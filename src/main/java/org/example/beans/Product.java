package org.example.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "qty_in_stock")
    private int qtyInStock;

    @OneToMany(mappedBy = "product")
    List<OrderLine> orderLine;

    public Product() {
    }

    public Product(String title, String description, String imgUrl, double unitPrice, int qtyInStock) {
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.unitPrice = unitPrice;
        this.qtyInStock = qtyInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
}
