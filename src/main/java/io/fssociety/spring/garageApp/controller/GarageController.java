package io.fssociety.spring.garageApp.controller;

import io.fssociety.spring.garageApp.model.Car;
import io.fssociety.spring.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public List<Car> getCar(){
        return garageService.getCars();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cars/{id}")
    public Car getCar(@PathVariable long id){
        return garageService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cars/{id}")
    public void deleteCar(@PathVariable long id){
        garageService.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(@RequestBody Car car){
        garageService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/cars/{id}")
    public void updateCare(@RequestBody Car car, @PathVariable long id){
        garageService.updateCar(car, id);
    }
}

