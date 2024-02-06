package io.fssociety.spring.garageApp.service;

import io.fssociety.spring.garageApp.model.Car;
import io.fssociety.spring.garageApp.respository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;

    public List<Car>  getCars(){
        List<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });

        return cars;
    }

    public Car getCar(long id){
        return garageRepository.findById(id).orElse(null);
    }
    public void deleteCar(long id) {
        garageRepository.deleteById(id);
    }

    public void addCar(Car c) {
        garageRepository.save(c);
    }

    public void updateCar(Car car, long id) {
        garageRepository.save(car);
    }
}
