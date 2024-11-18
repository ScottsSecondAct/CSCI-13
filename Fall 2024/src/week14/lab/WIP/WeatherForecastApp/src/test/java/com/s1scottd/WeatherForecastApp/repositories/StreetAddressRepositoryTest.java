package com.s1scottd.WeatherForecastApp.repositiories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

import com.s1scottd.WeatherForecastApp.models.StreetAddress;

@DataJpaTest
public class StreetAddressRepositoryTest {

    @Autowired
    private StreetAddressRepository repository;

    @Test
    public void testSaveAndRetrieveStreetAddress() {
        StreetAddress address = new StreetAddress();
        address.setNumber("123");
        address.setStreet("Main St");
        address.setCity("Anytown");
        address.setState("CA");
        address.setZipCode("12345");
        address.setCountry("USA");

        repository.save(address);

        StreetAddress retrievedAddress = repository.findById(address.getId()).orElse(null);
        assertThat(retrievedAddress).isNotNull();
        assertThat(retrievedAddress.getNumber()).isEqualTo("123");
        assertThat(retrievedAddress.getStreet()).isEqualTo("Main St");
    }
}

