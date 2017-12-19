package com.cognizant.main;

import java.util.HashMap;
import java.util.Map;

public class CityDistanceRelation {
    private double totalDistance;
    private double destinationCityDistance;
    private double sourceCityDistance;

    private static final Map<String,Double> cityDistanceRelationMap = new HashMap<String,Double>();

    static {

        cityDistanceRelationMap.put(City.PUNE.getValue(),CityDistance.PUNE.getValue());
        cityDistanceRelationMap.put(City.MUMBAI.getValue(),CityDistance.MUMBAI.getValue());
        cityDistanceRelationMap.put(City.DELHI.getValue(),CityDistance.DELHI.getValue());
        cityDistanceRelationMap.put(City.BANGALORE.getValue(),CityDistance.BANGALORE.getValue());
        cityDistanceRelationMap.put(City.CHENNAI.getValue(),CityDistance.CHENNAI.getValue());
    }

    public static Map<String,Double> getCityDistanceRelationMap(){
        return cityDistanceRelationMap;
    }

    public double calculateTotalDistance(String sourceCity, String destinationCity){
        Map<String,Double> cityDistanceRelationMap = CityDistanceRelation.getCityDistanceRelationMap();

        for (Map.Entry<String,Double> cityDistanceRelation : cityDistanceRelationMap.entrySet()) {
            if (destinationCity.equals(cityDistanceRelation.getKey())) {
                destinationCityDistance = cityDistanceRelation.getValue();
            }
            if (sourceCity.equals(cityDistanceRelation.getKey())) {
                sourceCityDistance = cityDistanceRelation.getValue();
            }
        }
        totalDistance = destinationCityDistance + sourceCityDistance;
        return totalDistance;
    }
}
