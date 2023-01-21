package com.driver;

public class Boat implements WaterVehicle{

    private String vehicleName;
    private int vehicleCapacity;



    @Override
    public String getVehicleName() {
        return this.vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return this.vehicleCapacity;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }
}
