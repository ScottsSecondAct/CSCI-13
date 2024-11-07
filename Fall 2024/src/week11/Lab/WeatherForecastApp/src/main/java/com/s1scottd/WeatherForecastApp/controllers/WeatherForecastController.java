package com.s1scottd.WeatherForecastApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;

@RestController
@RequestMapping("/api")
public class WeatherForecastController {

  private List<StreetAddress> streetAddresses = new ArrayList<StreetAddress>();

  @GetMapping("/streetAddress/")
  public List<StreetAddress> getStreetAddresses() {
    return streetAddresses;
  }

  @GetMapping("/streetAddress/{id}")
  public ResponseEntity<StreetAddress> getStreetAddressById(@PathVariable Long id) {
    StreetAddress streetAddress = findStreetAddressById(id);
    if (streetAddress != null) {
      return ResponseEntity.ok(streetAddress);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping("/streetAddress/")
  public ResponseEntity<StreetAddress> createStreetAddress(@RequestBody StreetAddress streetAddress) {
    streetAddresses.add((StreetAddress) streetAddresses);
    return ResponseEntity.status(HttpStatus.CREATED).body(streetAddress);
  }

  @PutMapping("/streetAddress/{id}")
  public ResponseEntity<StreetAddress> updateStreetAddress(@PathVariable Long id,
      @RequestBody StreetAddress streetAddress) {
    StreetAddress address = findStreetAddressById(id);
    if (address != null) {
      address.setNumber(streetAddress.getNumber());
      address.setStreet(streetAddress.getStreet());
      address.setCity(streetAddress.getCity());
      address.setState(streetAddress.getState());
      address.setZipCode(streetAddress.getZipCode());
      address.setCountry(streetAddress.getCountry());
      return ResponseEntity.ok(address);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/streetAddress/{id}")
  public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
    StreetAddress streetAddress = findStreetAddressById(id);
    if (streetAddress != null) {
      streetAddresses.remove(streetAddress);
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  private StreetAddress findStreetAddressById(Long id) {
    return streetAddresses.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
  }
}
