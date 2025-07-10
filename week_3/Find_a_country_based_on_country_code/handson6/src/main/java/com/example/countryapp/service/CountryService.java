package com.example.countryapp.service;

import java.util.List;

import com.example.countryapp.entity.Country;

import com.example.countryapp.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;

public interface CountryService {

@Transactional
Country findCountryByCode(String countryCode) throws CountryNotFoundException;
Country getCountryByCode(String code);
Country addCountry(Country country);
Country updateCountry(Country country);
void deleteCountry(String code);
List<Country> searchCountriesByName(String partialName);

}
