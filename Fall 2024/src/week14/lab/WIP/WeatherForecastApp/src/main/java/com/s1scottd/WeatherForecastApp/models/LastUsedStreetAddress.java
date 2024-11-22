package com.s1scottd.WeatherForecastApp.models;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class LastUsedStreetAddress {
  public static final String KEY = "LastUsedStreetAddressId";

  @Id
  private String key;

  private Long lastUsedStreetAddressId;

  public LastUsedStreetAddress() {
    this.key = KEY;
  }

  public LastUsedStreetAddress(Long lastUsedStreetAddressId) {
    this.key = KEY;
    this.lastUsedStreetAddressId = lastUsedStreetAddressId;
  }

  public String getKey() {
    return key;
  }

  public Long getLastUsedStreetAddressId() {
    return lastUsedStreetAddressId;
  }

  public void setLastUsedStreetAddressId(Long lastUsedStreetAddressId) {
    this.lastUsedStreetAddressId = lastUsedStreetAddressId;
  }

}
