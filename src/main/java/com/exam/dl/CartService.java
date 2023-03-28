package com.exam.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.domain.Cart;

@Service
public class CartService {
  
  @Autowired
  private CartRepository repo;

  public Cart createCart(Cart cart) {
    return repo.save(cart);
  }
}