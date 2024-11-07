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
 
package com.s1scottd.WeatherForecastApp.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;

public class StreetAddressParser {
  	private ObjectMapper objectMapper;

	public StreetAddressParser() {
		objectMapper = new ObjectMapper();
	}

	public StreetAddress ToStreetAddressObject(String jsonString) {

		try {
			// Convert JSON string to Java Object
			return objectMapper.readValue(jsonString, StreetAddress.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

  public StreetAddress ToStreetAddressObject(StreetAddressDto streetAddressDto) {
    StreetAddress streetAddress = new StreetAddress();
    streetAddress.setNumber(streetAddressDto.getNumber());
    streetAddress.setStreet(streetAddressDto.getStreet());
    streetAddress.setCity(streetAddressDto.getCity());
    streetAddress.setState(streetAddressDto.getState());
    streetAddress.setZipCode(streetAddressDto.getZipCode());
    streetAddress.setCountry(streetAddressDto.getCountry());
    return streetAddress;
  }
}
