package org.example.beans;

import javax.persistence.*;
import java.util.Date;

//The last Created Class

//I need to add this Entity to my session factory configuration

//If you don't the login won't work plus many other things!!!

@Entity(name = "cart")
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "id_client")
    private int idClient;

    @Column(name = "id_product")
    private int idProduct;

    @Column(name = "unit_price")
    private double unitPrice;

    private int quantity;
    private Date date;

    public Cart() {
    }

    public Cart(double unitPrice, int quantity, Date date) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
