package io.fssociety.spring.garageApp.respository;

import io.fssociety.spring.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {

}
