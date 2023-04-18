package com.digitalbooking.Back.services.impl;

import com.digitalbooking.Back.model.City;
import com.digitalbooking.Back.repository.CityRepository;
import com.digitalbooking.Back.services.serviceInterface.CategoryService;
import com.digitalbooking.Back.services.serviceInterface.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Optional<City> searchCityById(Integer id) {
        return cityRepository.findById(id);
    }

    @Override
    public List<City> listCities() {
        return cityRepository.findAll();
    }

    @Override
    public City updateCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(Integer id) {
        cityRepository.deleteById(id);
    }
}
