package com.s1scottd.WeatherForecastApp.services;

import java.util.Optional;

import com.s1scottd.WeatherForecastApp.models.LastUsedStreetAddress;
import com.s1scottd.WeatherForecastApp.repositories.StreetAddressRepository;
import com.s1scottd.WeatherForecastApp.repositories.ConfigurationRepository;
import com.s1scottd.WeatherForecastApp.services.IConfigurationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService implements IConfigurationService {

    @Autowired
    private ConfigurationRepository configurationRepository;

    @Override
    public void saveLastUsedStreetAddressId(Long id) {
        Optional<LastUsedStreetAddress>  optionalLastUsedStreetAddress = configurationRepository.findById(LastUsedStreetAddress.KEY);

        LastUsedStreetAddress lastUsedStreetAddress;
        if (optionalLastUsedStreetAddress.isPresent()) {
            lastUsedStreetAddress = optionalLastUsedStreetAddress.get();
            lastUsedStreetAddress.setLastUsedStreetAddressId(id);
        } else {
            lastUsedStreetAddress = new LastUsedStreetAddress();
            lastUsedStreetAddress.setLastUsedStreetAddressId(id);
        }

        configurationRepository.save(lastUsedStreetAddress);
    }

    @Override
    public Optional<Long> getLastUsedStreetAddressId() {
        return configurationRepository.findById(LastUsedStreetAddress.KEY)
                .map(LastUsedStreetAddress::getLastUsedStreetAddressId);
    }
}

