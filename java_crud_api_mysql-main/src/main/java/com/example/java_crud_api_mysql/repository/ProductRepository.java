package com.example.java_crud_api_mysql.repository;

import com.example.java_crud_api_mysql.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer>{
}
