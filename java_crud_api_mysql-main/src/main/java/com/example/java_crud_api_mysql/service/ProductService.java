package com.example.java_crud_api_mysql.service;

import com.example.java_crud_api_mysql.models.Product;
import com.example.java_crud_api_mysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getallproduct()
    {
        return  productRepository.findAll();
    }
    public String addproduct(Product product) {
        try {
            productRepository.save(product);
            return product.getProductname() + " added successfully";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }

    public Product findproduct(int id) {
        try {
            return productRepository.findById(id).orElseThrow();
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    public String deleteproduct(int id)
    {
        try
        {
            productRepository.deleteById(id);
            return "Product has been deleted";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }

    }
    public String UpdateProdcut(Product product)
    {
        try{
        Product updatedproduct=productRepository.getById(product.getId());
        updatedproduct.setProductname(product.getProductname());
        updatedproduct.setProductdescription(product.getProductdescription());
        updatedproduct.setProductprice(product.getProductprice());
        updatedproduct.setProductquantity(product.getProductquantity());
        updatedproduct.setIsavailable(true);
        return updatedproduct.getProductname()+" has been updated";
    }
        catch (Exception e)
        {
         return e.getMessage().toString();
        }
    }



}
