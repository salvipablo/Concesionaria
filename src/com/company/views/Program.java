package com.company.views;

import com.company.controller.VehicleController;

public class Program {
    public void main() {
        VehicleController vehicleController = new VehicleController();

        System.out.println("****  BIENVENIDO AL SISTEMA DE CONCESIONARIA PJS  ****");

        // Simulacion de operacion del usuario que maneja el sistema
        // Usuario manda vehiculos para dar de alta
        vehicleController.newVehicle("Gol", "Trend 1.6 Pack3", 2010, true, 25000, "auto");
        vehicleController.newVehicle("Vento", "2.5 Deluxe", 2008, true, 45000, "auto");
        vehicleController.newVehicle("Chevrolet", "Corsa 1.3", 2005, false, 12000, "auto");
        vehicleController.newVehicle("Renault", "Megane 2.0 Coupe", 2003, true, 13000, "auto");
        vehicleController.newVehicle("Honda", "Wawe 110", 2002, false, 6000, "moto");
        vehicleController.newVehicle("Zanella", "110 TTE", 2008, false, 7500, "moto");

        // Usuario pide ver todos los vehiculos.
        vehicleController.listAllVehicles();

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        // Usuario quiere ver un vehiculo en particular.
        vehicleController.iSeeVehicle(1);
        vehicleController.iSeeVehicle(3);
        vehicleController.iSeeVehicle(5);
    }
}
