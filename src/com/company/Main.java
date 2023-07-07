package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VehiclesPersistence vehiclesPersistence = new VehiclesPersistence();
        VehiclesIds idsVehiclesInf = VehiclesIds.getInstance();

        // Autos.
        Vehicles veh_1 = new Vehicles("Gol", "Trend 1.6 Pack3", 2010, true, 25000, "auto");
        Vehicles veh_2 = new Vehicles("Vento", "2.5 Deluxe", 2008, true, 45000, "auto");
        Vehicles veh_3 = new Vehicles("Chevrolet", "Corsa 1.3", 2005, false, 12000, "auto");
        Vehicles veh_4 = new Vehicles("Renault", "Megane 2.0 Coupe", 2003, true, 13000, "auto");
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), veh_1);
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), veh_2);
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), veh_3);
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), veh_4);

        // Motos
        Vehicles veh_5 = new Vehicles("Honda", "Wawe 110", 2002, false, 6000, "moto");
        Vehicles veh_6 = new Vehicles("Zanella", "110 TTE", 2008, false, 7500, "moto");
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), veh_5);
        vehiclesPersistence.createVehicle(idsVehiclesInf.nextId(), veh_6);

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
            if (car.getValue().getTypeVehicle().equals("auto")) {
                System.out.println(car.getKey() + " - " + car.getValue().getBrand() + " - " + car.getValue().getDescription() + "-" +
                                                            (car.getValue().getPrice() * 1.20) + " - 20% de impuesto");
            } else {
                System.out.println(car.getKey() + " - " + car.getValue().getBrand() + " - " + car.getValue().getDescription() + "-" +
                                                            (car.getValue().getPrice() * 1.10) + " - 10% de impuesto");
            }
        }
    }

    public static void showVehicle(int id, Map<Integer, Vehicles> cars) {
        for (Map.Entry<Integer, Vehicles> car: cars.entrySet()) {
            if (car.getKey() == id) {
                System.out.println(car.getValue().getBrand() + "-" + car.getValue().getDescription() + "-" +
                                                        (car.getValue().getPrice() * 1.20) + " - 20% de impuesto");
            }
        }
    }
}