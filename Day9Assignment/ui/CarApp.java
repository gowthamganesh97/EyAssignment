package com.sapient.asde.ui;

import com.sapient.asde.model.Car;
import com.sapient.asde.service.CarService;
import com.sapient.asde.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarApp {

    public static void main(String[] args) {
        Car cars[] = {
                new Car("Maruti", "Swift Dezire", 810000.00),
                new Car("Hyundai", "Verna", 1100000.00),
                new Car("Toyota", "Innova", 2450000.00),
                new Car("Audi", "Q3", 4500000.00)
        };

        List<Car> carList = new ArrayList<>(Arrays.asList(cars));

        CarService carService = new CarServiceImpl();

        try {
            System.out.println("Sum of prices: " + carService.sumOfPrices(carList));
            System.out.println("Car names: " + carService.getCarNames(carList));
            System.out.println("Car makers: " + carService.getCarMakers(carList));
            System.out.println("Highest priced car: " + carService.getHighPricedCar(carList));
            System.out.println("Car with lowest price: " + carService.getCarWithLowPricedCar(carList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}