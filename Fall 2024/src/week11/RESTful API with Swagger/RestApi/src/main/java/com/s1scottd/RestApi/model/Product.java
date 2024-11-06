package com.s1scottd.RestApi.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Product {

  @Schema(name = "Product ID", example = "1", required = true)
  private int id;
  @Schema(name = "Product name", example = "Product 1", required = false)
  private String name;
  @Schema(name = "Product description", example = "This is product 1", required = false)
  private String description;
  @Schema(name = "Product price", example = "100.00", type = "number", format = "double", required = true)
  private double price;

  // Default constructor
  public Product() {
  }

  // Parameterized constructor
  public Product(int id, String name, String description, double price) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  // Getters and setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Override toString for easier debugging
  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        '}';
  }
}
