package com.exam.dl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.domain.Product;

@Service
public class ProductService {
  
  @Autowired
  private ProductRepository repo;

  public Product createProduct(Product product) {
    return repo.save(product);
  }

  public List<Product> getAllProducts() {
    return repo.findAll();
  }
}
