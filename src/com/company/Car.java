package com.company;

public class Car extends Vehicles {
    public Car(String brand, String description, int model, boolean airConditioning, int price, String typeVehicle) {
        super(brand, description, model, airConditioning, price, typeVehicle);
    }

    @Override
    public double getPriceWithTax() {
        return this.getPrice() * 1.20;
    }
}
