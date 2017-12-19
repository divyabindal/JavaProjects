package com.cognizant.main;

public class CarRental {

    private double expense;

    public double calculateTotalTripExpense(String type, String name, boolean ac, boolean petrol,String sourceCity, String destinationCity, int passangers){
        CityDistanceRelation cityDistance = new CityDistanceRelation();
        Vehicle vehicle = new Vehicle(type, name, ac, petrol);
        expense = (vehicle.calculateStandardRate()+vehicle.calculateExtraPersonsCharge(passangers))*(cityDistance.calculateTotalDistance(sourceCity,destinationCity));
        return expense;
    }

    public double calculateTotalTripExpense(String type, String name, boolean ac, boolean petrol,String sourceCity, String destinationCity){
        CityDistanceRelation cityDistance = new CityDistanceRelation();
        Vehicle vehicle = new Vehicle(type, name, ac, petrol);
        expense = vehicle.calculateStandardRate()*(cityDistance.calculateTotalDistance(sourceCity,destinationCity));
        return expense;
    }

}
