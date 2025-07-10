package com.example.countryapp.service;

import com.example.countryapp.entity.Country;
import com.example.countryapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.countryapp.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;


@Service
public class CountryServiceImpl implements CountryService {
 private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

	@Override
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
	    return countryRepository.findById(countryCode)
	            .orElseThrow(() -> new CountryNotFoundException("Country not found with code: " + countryCode));
	}

    // 1. Find a country by country code
    @Override
    public Country getCountryByCode(String code) {
        return countryRepository.findById(code)
                .orElseThrow(() -> new RuntimeException("Country not found with code: " + code));
    }

    // 2. Add a new country
    @Override
    public Country addCountry(Country country) {
        if (countryRepository.existsById(country.getCoCode())) {
            throw new RuntimeException("Country with code already exists: " + country.getCoCode());
        }
        return countryRepository.save(country);
    }

    // 3. Update existing country
    @Override
    public Country updateCountry(Country country) {
        if (!countryRepository.existsById(country.getCoCode())) {
            throw new RuntimeException("Cannot update. Country not found with code: " + country.getCoCode());
        }
        return countryRepository.save(country); // save() does both insert and update
    }

    // 4. Delete a country by code
    @Override
    public void deleteCountry(String code) {
        if (!countryRepository.existsById(code)) {
            throw new RuntimeException("Cannot delete. Country not found with code: " + code);
        }
        countryRepository.deleteById(code);
    }

    // 5. Search countries by partial name (case-insensitive)
    @Override
    public List<Country> searchCountriesByName(String partialName) {
        return countryRepository.findByCoNameContainingIgnoreCase(partialName);
    }
}
