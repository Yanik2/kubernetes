package com.example.javaapplication.repository;

import com.example.javaapplication.model.Car;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByBrand(String brand);
}
