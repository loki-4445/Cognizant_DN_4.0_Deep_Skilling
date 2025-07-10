package com.example.countryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.countryapp.entity.Country;

public interface CountryRepository extends JpaRepository<Country,String>{

	List<Country> findByCoNameContainingIgnoreCase(String partialName);

}
