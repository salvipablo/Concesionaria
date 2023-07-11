package com.company.models;

import java.util.ArrayList;

public class VehiclesIds {
    private static VehiclesIds vehiclesIds;
    private final ArrayList<Integer> ids = new ArrayList<>();

    private VehiclesIds() {}

    public static VehiclesIds getInstance() {
        if (vehiclesIds == null) vehiclesIds = new VehiclesIds();
        return vehiclesIds;
    }

    public int nextId() {
        ids.add(this.ids.size() + 1);
        return this.ids.size();
    }
}
