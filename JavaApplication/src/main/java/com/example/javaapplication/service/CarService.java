package com.example.javaapplication.service;

import com.example.javaapplication.model.Car;
import com.example.javaapplication.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getByBrand(String brand) {
        return carRepository.findByBrand(brand).orElseThrow();
    }

    public Car createCar(String brand, String model) {
        final var car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        return carRepository.save(car);
    }
}
