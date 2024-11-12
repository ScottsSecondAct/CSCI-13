package com.s1scottd.WeatherForecastApp.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StreetAddressTests {

  @Test
  public void testSettersAndGetters() {
    StreetAddress address = new StreetAddress();

    address.setNumber("123");
    assertEquals("123", address.getNumber());

    address.setStreet("Main St");
    assertEquals("Main St", address.getStreet());

    address.setCity("Anytown");
    assertEquals("Anytown", address.getCity());

    address.setState("CA");
    assertEquals("CA", address.getState());

    address.setZipCode("12345");
    assertEquals("12345", address.getZipCode());

    address.setCountry("USA");
    assertEquals("USA", address.getCountry());
  }

  @Test
  public void testFormatAddress() {
    //5200+Sierra+College+Blvd%2C+Rocklin%2C+CA+95677
    StreetAddress address = new StreetAddress("4600", "Silver Hill Rd", "Washington", "DC", "20233", "USA");
    String expected = "4600+Silver+Hill+Rd%2C+Washington%2C+DC+20233";
    assertEquals(expected, address.formatAddress());
  }

  @Test
  public void testFormatAddressWithSpaces() {
    StreetAddress address = new StreetAddress("123", "Main Street", "Anytown", "CA", "12345", "USA");
    String expected = "123+Main+Street%2C+Anytown%2C+CA+12345";
    assertEquals(expected, address.formatAddress());
  }

  @Test
  public void testFormatAddressWithMultipleSpaces() {
    StreetAddress address = new StreetAddress("789", "Elm   Street", "Othertown", "TX", "67890", "USA");
    String expected = "789+Elm+Street%2C+Othertown%2C+TX+67890";
    assertEquals(expected, address.formatAddress());
  }
}
