package com.s1scottd.WeatherForecastApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StreetAddress {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Fields
  private String number;
  private String street;
  private String city;
  private String state;
  private String zipCode;

  @OneToOne
  private GridLocation gridLocation;

  // Default constructor
  public StreetAddress() {
  }

  // Parameterized constructor
  public StreetAddress(String number, String street, String city, String state, String zipCode) {
    this.number = number;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
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

  public GridLocation getGridLocation() {
    return gridLocation;
  }

  public void setGridLocation(GridLocation gridLocation) {
    this.gridLocation = gridLocation;
  }

  // For Example, 5200+Sierra+College+Blvd%2C+Rocklin%2C+CA+95677
  public String formatAddress() {
    String address = number + "+" + street + "%2C" + "+" + city + "%2C" + "+" + state + "+" + zipCode;
    return address.replaceAll("\\s+", "+");
  }

  // toString method
  @Override
  public String toString() {
    return number + " " + street + ", " + city + ", " + state + " " + zipCode;
  }
}
