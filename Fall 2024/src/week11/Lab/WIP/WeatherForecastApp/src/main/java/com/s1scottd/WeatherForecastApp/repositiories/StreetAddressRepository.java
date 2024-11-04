package com.s1scottd.WeatherForecastApp.repositiories;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetAddressRepository extends JpaRepository<StreetAddress, Long> {
}
