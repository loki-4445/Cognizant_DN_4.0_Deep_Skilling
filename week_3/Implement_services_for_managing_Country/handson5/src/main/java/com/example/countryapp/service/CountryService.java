package com.example.countryapp.service;

import java.util.List;

import com.example.countryapp.entity.Country;


public interface CountryService {
Country getCountryByCode(String code);
Country addCountry(Country country);
Country updateCountry(Country country);
void deleteCountry(String code);
List<Country> searchCountriesByName(String partialName);

}
