package com.example.javaapplication.controller;

import com.example.javaapplication.model.Car;
import com.example.javaapplication.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class JavaController {
    private final CarService carService;

    public JavaController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<String> getJava() {
        return ResponseEntity.ok("Hello from Java");
    }

    @GetMapping("/{brand}")
    public ResponseEntity<Car> getByBrand(@PathVariable String brand) {
        return ResponseEntity.ok(carService.getByBrand(brand));
    }

    @PostMapping
    public ResponseEntity<Car> createCar(
        @RequestParam String brand,
        @RequestParam String model
    ) {
        return new ResponseEntity<>(carService.createCar(brand, model), HttpStatus.CREATED);
    }
}
