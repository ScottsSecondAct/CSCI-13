/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
import com.s1scottd.WeatherForecastApp.exception.DuplicateResourceException;
import com.s1scottd.WeatherForecastApp.exception.ResourceNotFoundException;
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