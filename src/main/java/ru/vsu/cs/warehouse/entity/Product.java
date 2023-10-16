package ru.vsu.cs.warehouse.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "count")
    private int count;

    @Column(name = "product_name")
    private String name;

    @Column(name = "date_of_production")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfProduction;

    @Column(name = "storage_life")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date storageLife;


    public Product() {
    }

    public Product(int count, String name, Date dateOfProduction, Date storageLife) {
        this.count = count;
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.storageLife = storageLife;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public Date getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(Date storageLife) {
        this.storageLife = storageLife;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", storageLife=" + storageLife +
                '}';
    }
}
