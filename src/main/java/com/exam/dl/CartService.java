package com.exam.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.domain.Cart;


// Este debería llamarse CartDl o cartDdata

@Service
public class CartService {
  
  @Autowired
  private CartRepository repo;

  public Cart createCart(Cart cart) {
    return repo.save(cart);
  }

  public Cart getCartById(int id) {
    return repo.findById(id).get();
  }

  public Iterable<Cart> getAllCarts() {
    return repo.findAll();
  }

  public Cart updateCart(Cart cart) {
    return repo.save(cart);
  }

  public void deleteCartById(int id) {
    repo.deleteById(id);
  }
  
  public void deleteAllCarts() {
    repo.deleteAll();
  }

}