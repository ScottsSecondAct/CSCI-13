package com.s1scottd.WeatherForecastApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StreetAddress {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Fields
  private String number; // Street number
  private String street;
  private String city;
  private String state;
  private String zipCode;
  private String country;

  private String gridId;
  private int gridX;
  private int gridY;

  // Default constructor
  public StreetAddress() {
  }

  // Parameterized constructor
  public StreetAddress(String number, String street, String city, String state, String zipCode, String country) {
    this.number = number;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
    this.gridId = null;
    this.gridX = -1;
    this.gridY = -1;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getGridId() {
    return gridId;
  }

  public void setGridId(String gridId) {
    this.gridId = gridId;
  }

    public int getGridX() {
    return gridX;
  }

  public void setGridX(int gridX) {
    this.gridX = gridX;
  }

    public int getGridY() {
    return gridY;
  }

  public void setGridY(int gridY) {
    this.gridY = gridY;
  }

  //For Exammple, 5200+Sierra+College+Blvd%2C+Rocklin%2C+CA+95677
  public String formatAddress() {
    String formattedStreet = street.replaceAll("\\s+", "+");
    return number + "+" + formattedStreet + "%2C" + "+" + city + "%2C" + "+" + state + "+" + zipCode;
  }

  // toString method
  @Override
  public String toString() {
    return number + " " + street + ", " + city + ", " + state + " " + zipCode + ", " + country + "," + gridId + ", " + gridX + ", " + gridY;
  }
}
