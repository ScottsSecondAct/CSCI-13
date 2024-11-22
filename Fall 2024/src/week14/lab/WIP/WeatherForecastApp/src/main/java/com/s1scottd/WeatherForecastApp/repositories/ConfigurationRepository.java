package com.s1scottd.WeatherForecastApp.repositories;

import com.s1scottd.WeatherForecastApp.models.LastUsedStreetAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<LastUsedStreetAddress, String> {
}
