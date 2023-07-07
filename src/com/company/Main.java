package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicles> cars = new ArrayList<>();

    public static void main(String[] args) {
        Vehicles veh_1 = new Vehicles("Gol", "Trend 1.6 Pack3", 2010, true, 25000, "auto");
        Vehicles veh_2 = new Vehicles("Vento", "2.5 Deluxe", 2008, true, 45000, "auto");
        Vehicles veh_3 = new Vehicles("Chevrolet", "Corsa 1.3", 2005, false, 12000, "auto");
        Vehicles veh_4 = new Vehicles("Renault", "Megane 2.0 Coupe", 2003, true, 13000, "auto");

        Vehicles veh_5 = new Vehicles("Honda", "Wawe 110", 2002, false, 6000, "moto");
        Vehicles veh_6 = new Vehicles("Zanella", "110 TTE", 2008, false, 7500, "moto");

        cars.add(veh_1);
        cars.add(veh_2);
        cars.add(veh_3);
        cars.add(veh_4);
        cars.add(veh_5);
        cars.add(veh_6);

        listarTodosPrecioImpuesto();
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
}

class Vehicles {
    private String brand;
    private String description;
    private int model;
    private boolean airConditioning;
    private int price;
    private String typeVehicle;

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

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

    public Vehicles(String brand, String description, int model, boolean airConditioning, int price,
                                                                                                String typeVehicle) {
        this.brand = brand;
        this.description = description;
        this.model = model;
        this.airConditioning = airConditioning;
        this.price = price;
        this.typeVehicle = typeVehicle;
    }
}