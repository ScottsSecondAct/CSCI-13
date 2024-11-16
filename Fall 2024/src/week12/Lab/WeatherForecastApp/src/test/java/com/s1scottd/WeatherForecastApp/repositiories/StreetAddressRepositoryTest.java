package com.s1scottd.WeatherForecastApp.repositiories;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;

import com.s1scottd.WeatherForecastApp.models.GridLocation;
import com.s1scottd.WeatherForecastApp.models.StreetAddress;

@SpringBootTest

public class StreetAddressRepositoryTest {

  @Autowired
  private StreetAddressRepository repository;

  @DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
  @Test
  public void testCreateAndRetrieveStreetAddress() {
    GridLocation gridLocation = new GridLocation("G123", 10, 20);
    StreetAddress address = new StreetAddress("123", "Main St", "Anytown", "CA", "12345");
    address.setGridLocation(gridLocation);
    repository.save(address);

    Optional<StreetAddress> retrieved = repository.findById(address.getId());
    assertTrue(retrieved.isPresent());
    assertEquals("123", retrieved.get().getNumber());
    assertEquals("Main St", retrieved.get().getStreet());
    assertNotNull(retrieved.get().getGridLocation());
    assertEquals("G123", retrieved.get().getGridLocation().getGridId());
  }

  @Test
  public void testUpdateStreetAddress() {
    GridLocation gridLocation = new GridLocation("G123", 10, 20);
    StreetAddress address = new StreetAddress("123", "Main St", "Anytown", "CA", "12345");
    address.setGridLocation(gridLocation);
    repository.save(address);

    address.setStreet("Updated St");
    repository.save(address);

    Optional<StreetAddress> updated = repository.findById(address.getId());
    assertTrue(updated.isPresent());
    assertEquals("Updated St", updated.get().getStreet());
  }

  @Test
  public void testDeleteStreetAddress() {
    GridLocation gridLocation = new GridLocation("G123", 10, 20);
    StreetAddress address = new StreetAddress("123", "Main St", "Anytown", "CA", "12345");
    address.setGridLocation(gridLocation);
    repository.save(address);

    repository.deleteById(address.getId());

    Optional<StreetAddress> deleted = repository.findById(address.getId());
    assertFalse(deleted.isPresent());
  }

  @Test
  public void testFindByNumberAndStreetAndCityAndStateAndZipCode() {
    GridLocation gridLocation = new GridLocation("G123", 10, 20);
    StreetAddress address = new StreetAddress("123", "Main St", "Anytown", "CA", "12345");
    address.setGridLocation(gridLocation);
    repository.save(address);

    StreetAddress found = repository.findByNumberAndStreetAndCityAndStateAndZipCode(
        "123", "Main St", "Anytown", "CA", "12345");

    assertNotNull(found);
    assertEquals("123", found.getNumber());
    assertEquals("Main St", found.getStreet());
  }

  @Test
  public void testFindByNumberAndStreetAndCityAndStateAndZipCodeNotFound() {
    StreetAddress found = repository.findByNumberAndStreetAndCityAndStateAndZipCode(
        "999", "Unknown St", "Nowhere", "ZZ", "99999");

    assertNull(found);
  }

  @Test
  public void testFindByNumberAndStreetAndCityAndStateAndZipCodeWithNulls() {
    StreetAddress found = repository.findByNumberAndStreetAndCityAndStateAndZipCode(
        null, null, null, null, null);

    assertNull(found);
  }
}
