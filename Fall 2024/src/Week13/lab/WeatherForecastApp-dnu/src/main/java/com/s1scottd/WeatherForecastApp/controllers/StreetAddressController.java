package com.s1scottd.WeatherForecastApp.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

import com.s1scottd.WeatherForecastApp.dtos.StreetAddressCreateRequest;
import com.s1scottd.WeatherForecastApp.dtos.StreetAddressResponse;
import com.s1scottd.WeatherForecastApp.exceptions.DuplicateResourceException;
import com.s1scottd.WeatherForecastApp.exceptions.ResourceNotFoundException;
import com.s1scottd.WeatherForecastApp.services.IStreetAddressService;

@RestController
@RequestMapping("/api/street-address")
public class StreetAddressController {

  @Autowired
  private IStreetAddressService streetAddressService;

  @GetMapping("/")
  public ResponseEntity<List<StreetAddressResponse>> getAllStreetAddresses() {
    return ResponseEntity.ok(streetAddressService.getStreetAddresses());
  }

  @GetMapping("/{id}")
  public ResponseEntity<StreetAddressResponse> getStreetAddressById(@PathVariable Long id) {
    StreetAddressResponse streetAddressResponse = streetAddressService.getStreetAddressResponseById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Street Address not found for id: " + id));

    return ResponseEntity.ok(streetAddressResponse);
  }

  @PostMapping("/")
  public ResponseEntity<StreetAddressResponse> setStreetAddress(
      @Valid @RequestBody StreetAddressCreateRequest streetAddressCreateRequest) {

    if (streetAddressService.streetAddressExists(streetAddressCreateRequest)) {
      throw new DuplicateResourceException("User already exists");
    }

    StreetAddressResponse streetAddressResponse = streetAddressService.saveStreetAddress(streetAddressCreateRequest);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(streetAddressResponse.getId())
        .toUri();

    return ResponseEntity.created(location).body(streetAddressResponse);
  }
}
