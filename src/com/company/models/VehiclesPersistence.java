package com.company.models;

import java.util.HashMap;
import java.util.Map;

public class VehiclesPersistence {
    private final Map<Integer, Vehicles> cars = new HashMap<Integer, Vehicles>();

    public void createVehicle(int id, Vehicles vehicle) { this.cars.put(id, vehicle); }

    public Map<Integer, Vehicles> getCars() {
        return this.cars;
    }
}
