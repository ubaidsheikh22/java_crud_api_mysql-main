package com.example.java_crud_api_mysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String productname;
    private String productdescription;
    private long productprice;
    private boolean isavailable;
    private int productquantity;

    public void setId(int id) {
        this.id = id;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public void setProductprice(long productprice) {
        this.productprice = productprice;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }

    public void setProductquantity(int productquantity) {
        this.productquantity = productquantity;
    }

    public int getId() {
        return id;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public long getProductprice() {
        return productprice;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public int getProductquantity() {
        return productquantity;
    }

    public Product() {
    }

    public Product(int id, String productname, String productdescription, long productprice, boolean isavailable, int productquantity) {
        this.id = id;
        this.productname = productname;
        this.productdescription = productdescription;
        this.productprice = productprice;
        this.isavailable = isavailable;
        this.productquantity = productquantity;
    }
}
