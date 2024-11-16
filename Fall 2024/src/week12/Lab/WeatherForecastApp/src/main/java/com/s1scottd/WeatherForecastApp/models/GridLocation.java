package com.s1scottd.WeatherForecastApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GridLocation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  String gridId;
  int gridX;
  int gridY;

  public GridLocation() {
  }

  public GridLocation(String gridId, int gridX, int gridY) {
    this.gridId = gridId;
    this.gridX = gridX;
    this.gridY = gridY;
  }

  public String getGridId() {
    return gridId;
  }

  public void setGridId(String gridId) {
    this.gridId = gridId;
  }

  public int getGridX() {
    return gridX;
  }

  public void setGirdX(int gridX) {
    this.gridX = gridX;
  }

  public int getGridY() {
    return gridY;
  }

  public void setGridY(int gridY) {
    this.gridY = gridY;
  }
}
