package com.example.countryapp.controller;

import com.example.countryapp.entity.Country;
import com.example.countryapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    // 1. Get country by code
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }

    // 2. Add new country
    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    // 3. Update country
    @PutMapping
    public Country updateCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);
    }

    // 4. Delete country
    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
    }

    // 5. Search by partial name
    @GetMapping("/search")
    public List<Country> searchCountries(@RequestParam String name) {
        return countryService.searchCountriesByName(name);
    }
}
