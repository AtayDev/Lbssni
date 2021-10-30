package org.example.beans;

import javax.persistence.*;

@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int height;
    private int weight;
    private int age;
    private int chest;
    private int waist;
    @Column(name = "leg_inseam")
    private int legInseam;
    @Column(name = "sleeve_inseam")
    private int sleeveInseam;

    @OneToOne(mappedBy = "feature")
    private Client client;

    public Feature() {
    }

    public Feature(int height, int weight, int age, int chest, int waist, int legInseam, int sleeveInseam) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.chest = chest;
        this.waist = waist;
        this.legInseam = legInseam;
        this.sleeveInseam = sleeveInseam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLegInseam() {
        return legInseam;
    }

    public void setLegInseam(int legInseam) {
        this.legInseam = legInseam;
    }

    public int getSleeveInseam() {
        return sleeveInseam;
    }

    public void setSleeveInseam(int sleeveInseam) {
        this.sleeveInseam = sleeveInseam;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
