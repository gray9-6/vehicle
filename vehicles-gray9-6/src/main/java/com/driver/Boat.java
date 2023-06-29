package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;


    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Boat(){
        super();
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Set Name

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
