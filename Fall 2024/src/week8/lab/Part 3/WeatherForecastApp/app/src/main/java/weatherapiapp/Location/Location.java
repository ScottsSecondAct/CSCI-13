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
 
package weatherapiapp.Location;

import java.util.Optional;

public class Location {

  private Result result;

  public Location() {
  }

  // Getters and Setters for Location
  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  // Helper method to get the Longitude at the specified index
  public double getLongitude(int index) {
    if (result != null && result.getAddressMatches() != null
        && index >= 0 && index < result.getAddressMatches().size()) {
      return result.getAddressMatches().get(index).getCoordinates().getX();
    } else {
      throw new IndexOutOfBoundsException("Invalid index or no address matches available.");
    }
  }

  // Helper method to get the Latitude at the specified index
  public double getLatitude(int index) {
    if (result != null && result.getAddressMatches() != null
        && index >= 0 && index < result.getAddressMatches().size()) {
      return result.getAddressMatches().get(index).getCoordinates().getY();
    } else {
      throw new IndexOutOfBoundsException("Invalid index or no address matches available.");
    }
  }

  public static Optional<Location> getLocation(String addressString) {
    LocationApiClient locationApiClient = new LocationApiClient();
    Optional<String> locationString = locationApiClient.getLocation(addressString);

    if (locationString.isPresent()) {
      LocationParser locationParser = new LocationParser();
      return Optional.of(locationParser.ToLocationObject(locationString.get()));
    } else {
      return Optional.empty();
    }
  }
}