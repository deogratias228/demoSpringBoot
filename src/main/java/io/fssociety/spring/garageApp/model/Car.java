package io.fssociety.spring.garageApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    public enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        BLACK,
        SILVER,
        WHITE,
        GRAY,
        ORANGE
    }

    @Id
    private long id;
    private String model;
    private String brand;
    private int car_year;
    private Color color;

    public Car() {

    }
    public Car(long id, String model, String brand, int year, Color color) {
        super();
        this.model = model;
        this.id = id;
        this.brand = brand;
        this.car_year = year;
        this.color = color;
    }
    public Car(Car car) {
        super();
        this.model = car.model;
        this.id = car.id;
        this.brand = car.brand;
        this.car_year = car.car_year;
        this.color = car.color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCar_year() {
        return car_year;
    }

    public void setCar_year(int car_year) {
        this.car_year = car_year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
