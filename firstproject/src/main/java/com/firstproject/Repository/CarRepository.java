package com.firstproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.entity.Car;

public interface CarRepository  extends JpaRepository<Car, Integer>{

}
