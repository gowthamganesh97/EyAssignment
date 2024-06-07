package com.sapient.asde.service;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.sapient.asde.model.Car;

public class CarServiceImpl implements CarService 
{
 
    public double sumOfPrices(List<Car> carList) {
        return carList.stream().mapToDouble(Car::getPrice).sum();
    }
    
    public List<String> getCarNames(List<Car> carList) {
        return carList.stream().map(Car::getCarName).collect(Collectors.toList());
    }

    public Set<String> getCarMakers(List<Car> carList) {
        return carList.stream().map(Car::getCareMake).collect(Collectors.toSet());
    }

    public double getHighPricedCar(List<Car> carList) {
        return carList.stream().mapToDouble(Car::getPrice).max().orElseThrow(() -> new RuntimeException("Car list is empty"));
    }

    public Car getCarWithLowPricedCar(List<Car> carList) {
        return carList.stream().min(Comparator.comparingDouble(Car::getPrice)).orElseThrow(() -> new RuntimeException("Car list is empty"));
    }
}

