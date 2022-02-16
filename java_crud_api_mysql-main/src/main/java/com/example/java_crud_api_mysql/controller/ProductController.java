package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.models.Product;
import com.example.java_crud_api_mysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/getallproducts")
    public List<Product> getallproducts()
    {
        return productService.getallproduct();
    }

    @GetMapping(value = "/findproduct")
    public Product Findproduct(@PathVariable(value = "id") int id)
    {
        return productService.findproduct(id);
    }

  @PostMapping(value = "/addproduct")
    public String addproduct(@RequestBody Product product)
  {
      return productService.addproduct(product);
  }
  @PutMapping(value = "/updateproduct")
    public void updateproduuct(@RequestBody Product product)
  {
      productService.UpdateProdcut(product);
  }
  @DeleteMapping(value = "/DeleteProduct/{id}")
    public void Delete(@PathVariable(value = "id") int id)
  {
      productService.deleteproduct(id);
  }
}
