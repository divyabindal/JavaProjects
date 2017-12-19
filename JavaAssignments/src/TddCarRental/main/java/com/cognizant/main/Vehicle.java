package com.cognizant.main;

public class Vehicle {

    private String vehicleType;
    private String vehicleName;
    private boolean airConditioning;
    private boolean petrolVehicle;

    public Vehicle(String type, String name, boolean ac, boolean petrol) {
        vehicleType = type;
        vehicleName  = name;
        airConditioning = ac;
        petrolVehicle = petrol;
    }

    public double calculateStandardRate() {
        double standardRate;
        if (vehicleType.equals("CAR")) {
            if (petrolVehicle && airConditioning) {
                standardRate = 9 + 2;
            } else if (!petrolVehicle && airConditioning) {
                standardRate = 8 + 2;
            } else if (petrolVehicle && !airConditioning) {
                standardRate = 9;
            } else {
                standardRate = 8;
            }
        } else if (vehicleType.equals("BUS")) {
            if (airConditioning) {
                standardRate = 2 + 8 - (0.02 * (2 + 8));
            } else {
                standardRate = 8 - (0.02 * 8);
            }
        } else {
            standardRate = 2 + 8;
        }
        return standardRate;
    }

    public double calculateExtraPersonsCharge(int passangers) {
        double extraPersonCharge = 0;
        if (vehicleType.equals("BUS")) {
            if(passangers > 40){
                extraPersonCharge = 1.5 * (passangers -40);
            }
        } else {
            if(passangers > 5){
                extraPersonCharge = 1.5 * (passangers -5);
            }
        }
        return extraPersonCharge;
    }

}