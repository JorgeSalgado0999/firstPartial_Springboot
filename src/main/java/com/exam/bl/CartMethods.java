package com.exam.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.exam.dl.ProductService;
import com.exam.dl.UserService;
import com.exam.domain.Product;
import com.exam.domain.User;

@Component
public class CartMethods {
  @Autowired
  private ProductService productService;

  @Autowired
  private UserService userService;


  public Product createProduct(Product product) {
    System.out.println("Creando Producto: ");
    return productService.createProduct(product);
  }

  public Iterable<Product> getAllProducts() {
    System.out.println("Obteniendo Productos: ");
    return productService.getAllProducts();
  }


  public User createUser(User user) {

    System.out.println("Creando Usuario: ");

    return userService.createUser(user);
  }
}
