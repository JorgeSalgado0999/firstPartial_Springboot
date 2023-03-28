package com.exam.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer cartId;

  @Column(nullable = false)
  private int product_ref;

  @Column(nullable = false)
  private int user_ref;

  public Cart() {
  }

  public Cart(int product_ref, int user_ref) {
    this.product_ref = product_ref;
    this.user_ref = user_ref;
  }

  public Integer getUserId() {
    return cartId;
  }

  public void setUserId(Integer cartId) {
    this.cartId = cartId;
  }

  public int getProductRef() {
    return product_ref;
  }

  public void setProductRef(int product_ref) {
    this.product_ref = product_ref;
  }

  public int getUserRef() {
    return user_ref;
  }

  public void setUserRef(int user_ref) {
    this.user_ref = user_ref;
  }
  public String toString() {
    return "Cart [CartId=" + cartId + ", product_ref=" + product_ref + ", user_ref=" + user_ref + "]";
  }
}