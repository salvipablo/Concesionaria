package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VehiclesPersistence vehiclesPersistence = new VehiclesPersistence();
        VehiclesIds idsVehiclesInf = VehiclesIds.getInstance();

        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(),
                                                        new Car("Gol", "Trend 1.6 Pack3", 2010, true, 25000, "auto"));
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(),
                                                            new Car("Vento", "2.5 Deluxe", 2008, true, 45000, "auto"));
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(),
                                                        new Car("Chevrolet", "Corsa 1.3", 2005, false, 12000, "auto"));
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(),
                                                    new Car("Renault", "Megane 2.0 Coupe", 2003, true, 13000, "auto"));
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(),
                                                    new Motorcycle("Honda", "Wawe 110", 2002, false, 6000, "moto"));
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(),
                                                    new Motorcycle("Zanella", "110 TTE", 2008, false, 7500, "moto"));

        // TODO: Hacer que la aplicacion este mas ordenada con una clase Controller y la ejecucion salga de main

        listarTodosPrecioImpuesto(vehiclesPersistence.getCars());

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        showVehicle(1, vehiclesPersistence.getCars());
        showVehicle(3, vehiclesPersistence.getCars());
        showVehicle(5, vehiclesPersistence.getCars());
    }

    public static void listarTodosPrecioImpuesto(Map<Integer, Vehicles> cars) {
        for (Map.Entry<Integer, Vehicles> car: cars.entrySet()) {
                System.out.println(car.getKey() + " - " + car.getValue().getBrand() + " - " + car.getValue().getDescription() + "-" +
                                                            (car.getValue().getPriceWithTax()));
        }
    }

    public static void showVehicle(int id, Map<Integer, Vehicles> cars) {
        for (Map.Entry<Integer, Vehicles> car: cars.entrySet()) {
            if (car.getKey() == id) {
                System.out.println(car.getValue().getBrand() + "-" + car.getValue().getDescription() + "-" +
                                                        (car.getValue().getPriceWithTax()));
            }
        }
    }
}