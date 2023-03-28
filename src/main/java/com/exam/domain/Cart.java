package com.exam.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carts")
public class Cart {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;

  @Column (nullable= false)
  private int productRef;

  @Column (nullable= false)
  private int userRef;
}
