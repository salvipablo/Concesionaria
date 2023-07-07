package com.company;

public class Vehicles {
    private int id;
    private String brand;
    private String description;
    private int model;
    private boolean airConditioning;
    private int price;
    private String typeVehicle;

    public Vehicles(int id, String brand, String description, int model, boolean airConditioning, int price,
                                                                                                String typeVehicle) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.model = model;
        this.airConditioning = airConditioning;
        this.price = price;
        this.typeVehicle = typeVehicle;
    }

    public int getId() { return id; }
    public String getBrand() {
        return brand;
    }
    public String getDescription() {
        return description;
    }
    public int getModel() {
        return model;
    }
    public boolean isAirConditioning() {
        return airConditioning;
    }
    public int getPrice() {
        return price;
    }
    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setId(int id) { this.id = id; }
    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }
}