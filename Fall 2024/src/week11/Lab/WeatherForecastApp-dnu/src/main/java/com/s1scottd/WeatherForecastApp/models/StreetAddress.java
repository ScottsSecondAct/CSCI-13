package com.s1scottd.WeatherForecastApp.models;
public class StreetAddress {
  // Fields
  private Long id;
  private String number; // Street number
  private String street;
  private String city;
  private String state;
  private String zipCode;
  private String country;

  // Default constructor
  public StreetAddress() {
  }

  // Parameterized constructor
  public StreetAddress(Long id, String number, String street, String city, String state, String zipCode, String country) {
    this.id = id;
    this.number = number;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
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

  // toString method
  @Override
  public String toString() {
    return number + " " + street + ", " + city + ", " + state + " " + zipCode + ", " + country;
  }
}
