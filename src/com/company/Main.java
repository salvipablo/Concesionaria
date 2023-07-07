package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicles> cars = new ArrayList<>();

    public static void main(String[] args) {
        int id = 0;

        id++;
        Vehicles veh_1 = new Vehicles(id, "Gol", "Trend 1.6 Pack3", 2010, true, 25000, "auto");
        id++;
        Vehicles veh_2 = new Vehicles(id, "Vento", "2.5 Deluxe", 2008, true, 45000, "auto");
        id++;
        Vehicles veh_3 = new Vehicles(id, "Chevrolet", "Corsa 1.3", 2005, false, 12000, "auto");
        id++;
        Vehicles veh_4 = new Vehicles(id, "Renault", "Megane 2.0 Coupe", 2003, true, 13000, "auto");

        id++;
        Vehicles veh_5 = new Vehicles(id, "Honda", "Wawe 110", 2002, false, 6000, "moto");
        id++;
        Vehicles veh_6 = new Vehicles(id, "Zanella", "110 TTE", 2008, false, 7500, "moto");

        cars.add(veh_1);
        cars.add(veh_2);
        cars.add(veh_3);
        cars.add(veh_4);
        cars.add(veh_5);
        cars.add(veh_6);

        listarTodosPrecioImpuesto();

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        showVehicle(1);
        showVehicle(3);
        showVehicle(5);
    }

    public static void listarTodosPrecioImpuesto() {
        for (Vehicles car: cars) {
            if (car.getTypeVehicle().equals("auto")) {
                System.out.println(car.getBrand() + "-" + car.getDescription() + "-" + (car.getPrice() * 1.20) +
                                                                                                " - 20% de impuesto");
            } else {
                System.out.println(car.getBrand() + "-" + car.getDescription() + "-" + (car.getPrice() * 1.10) +
                                                                                                " - 10% de impuesto");
            }

        }
    }

    public static void showVehicle(int id) {
        for (Vehicles vehicle: cars) {
            if (vehicle.getId() == id) {
                System.out.println(vehicle.getBrand() + "-" + vehicle.getDescription() + "-" +
                                                                (vehicle.getPrice() * 1.20) + " - 20% de impuesto");
            }
        }
    }
}