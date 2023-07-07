package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        Car car_1 = new Car("Gol", "Trend 1.6 Pack3", 2010, true, 25000);
        Car car_2 = new Car("Vento", "2.5 Deluxe", 2008, true, 45000);
        Car car_3 = new Car("Chevrolet", "Corsa 1.3", 2005, false, 12000);
        Car car_4 = new Car("Renault", "Megane 2.0 Coupe", 2003, true, 13000);

        cars.add(car_1);
        cars.add(car_2);
        cars.add(car_3);
        cars.add(car_4);

        listarTodosPrecioImpuesto();
    }

    public static void listarTodosPrecioImpuesto() {
        for (Car car: cars) {
            System.out.println(car.getBrand() + "-" + car.getDescription() + "-" + (car.getPrice() * 1.15));
        }
    }
}

class Car {
    private String brand;
    private String description;
    private int model;
    private boolean airConditioning;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Car(String brand, String description, int model, boolean airConditioning, int price) {
        this.brand = brand;
        this.description = description;
        this.model = model;
        this.airConditioning = airConditioning;
        this.price = price;
    }
}