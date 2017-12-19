package com.cognizant.main;

public enum CityDistance {

    PUNE(0),MUMBAI(200),BANGALORE(1000),DELHI(2050),CHENNAI(1234);

    private double cityDistance;

    private CityDistance(double cityDistance){
        this.cityDistance = cityDistance;
    }

    public double getValue(){
        return this.cityDistance;
    }
}
