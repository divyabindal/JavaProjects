package CarRental;

import java.util.Arrays;

public class City {
	
	String sourceCity;
	String destCity;
	double totalDist;
	
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	
	public void setValues(String source, String destination){
		sourceCity = source;
		destCity = destination;
	}
	
	public double calTotalDistance(){
		String[] cities = {"Pune","Mumbai","Bangalore","Delhi","Chennai"};
		double[] distances = {0,200,1000,2050,1234.5};
		if(sourceCity.equals("Pune")){
			int dCityIndex = Arrays.asList(cities).indexOf(destCity);
			totalDist = distances[dCityIndex];
		}
		else if(destCity.equals("Pune")){
			int sCityIndex = Arrays.asList(cities).indexOf(sourceCity);
			totalDist = distances[sCityIndex];
		}
		else if(!sourceCity.equals("Pune") && !destCity.equals("Pune")){
			int sCityIndex = Arrays.asList(cities).indexOf(sourceCity);
			int dCityIndex = Arrays.asList(cities).indexOf(destCity);
			double dist1 = distances[sCityIndex],dist2 = distances[dCityIndex];	 
			totalDist = dist1 + dist2;
		}
		return totalDist;     
	}
	
}
