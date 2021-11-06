package org.example.beans;

import javax.persistence.*;
import java.util.List;

@Entity(name = "product")
@Table(name = "product")
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

    @Column(name = "category")
    private String category;
    private double chest;
    private double waist;
    @Column(name = "arm_inseam")
    private double armInseam;
    @Column(name = "leg_inseam")
    private double legInseam;
    private String style;
    private String color;
    private String season;
    private String sex;

    private String material;
    @Column(name = "arm_circumference")
    private double armCircumference;

    @Column(name = "leg_circumference")
    private double legCircumference;

    @Column(name = "is_kid_friendly")
    private boolean isKidFriendly;



    @OneToMany(mappedBy = "product")
    List<OrderLine> orderLine;



    public Product() {
    }

    public Product(String title, String description, String imgUrl, double unitPrice, int qtyInStock, String category, double chest, double waist, double armInseam, double legInseam, String style, String color, String season, String sex, boolean isKidFriendly) {
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.unitPrice = unitPrice;
        this.qtyInStock = qtyInStock;
        this.category = category;
        this.chest = chest;
        this.waist = waist;
        this.armInseam = armInseam;
        this.legInseam = legInseam;
        this.style = style;
        this.color = color;
        this.season = season;
        this.sex = sex;
        this.isKidFriendly = isKidFriendly;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getChest() {
        return chest;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getArmInseam() {
        return armInseam;
    }

    public void setArmInseam(double armInseam) {
        this.armInseam = armInseam;
    }

    public double getLegInseam() {
        return legInseam;
    }

    public void setLegInseam(double legInseam) {
        this.legInseam = legInseam;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public boolean isKidFriendly() {
        return isKidFriendly;
    }

    public void setKidFriendly(boolean kidFriendly) {
        isKidFriendly = kidFriendly;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
}
