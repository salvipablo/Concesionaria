package com.company.controller;

import com.company.models.Vehicles;
import com.company.models.VehiclesIds;
import com.company.models.VehiclesPersistence;

import java.util.Map;

public class VehicleController {
    VehiclesPersistence vehiclesPersistence = new VehiclesPersistence();
    VehiclesIds idsVehiclesInf = VehiclesIds.getInstance();

    public void createNewVehicle(Vehicles vehicle) {
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), vehicle);
    }

    public void newVehicle(String brand, String description, int model, boolean airConditioning, int price,
                                                                                                        String type) {
        this.createNewVehicle(new Car(brand, description, model, airConditioning, price, type));
    }

    public void listAllVehicles() { listarTodosPrecioImpuesto(vehiclesPersistence.getCars()); }

    public void iSeeVehicle(int id) {
        showVehicle(id, vehiclesPersistence.getCars());
    }

    public void listarTodosPrecioImpuesto(Map<Integer, Vehicles> cars) {
        for (Map.Entry<Integer, Vehicles> car : cars.entrySet()) {
            System.out.println(car.getKey() + " - " + car.getValue().getBrand() + " - " + car.getValue().getDescription() + "-" +
                    (car.getValue().getPriceWithTax()));
        }
    }

    public void showVehicle(int id, Map<Integer, Vehicles> cars) {
        for (Map.Entry<Integer, Vehicles> car : cars.entrySet()) {
            if (car.getKey() == id) {
                System.out.println(car.getValue().getBrand() + "-" + car.getValue().getDescription() + "-" +
                        (car.getValue().getPriceWithTax()));
            }
        }
    }
}
