package CarRental;

public class Vehicle {
	
	String vehicleType;
	String vehicleName;
	boolean petrolVehicle = false;
	boolean acFeature = false;
	double standardRate;
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public boolean isPetrolVehicle() {
		return petrolVehicle;
	}

	public void setPetrolVehicle(boolean petrolVehicle) {
		this.petrolVehicle = petrolVehicle;
	}

	public boolean isAcFeature() {
		return acFeature;
	}

	public void setAcFeature(boolean acFeature) {
		this.acFeature = acFeature;
	}

	public void setValues(int option, String name, String ac, String petrol){
		if(option ==1){
			vehicleType = "CAR";
        }
        else if(option ==2){
        	vehicleType = "BUS";
        }
        else{
        	vehicleType = "SUV";
        }  
		vehicleName = name;
        if(ac.equals("yes")||ac.equals("YES")||ac.equals("Yes")){
        	acFeature = true;
        }
        if(petrol.equals("yes")||petrol.equals("YES")||petrol.equals("Yes")){
        	petrolVehicle = true;
        }        
	}
	
	public double calStandardRate(){
		if(vehicleType.equals("CAR")){
			if(isPetrolVehicle()&&isAcFeature()){
				standardRate = 9+2;
			}
			else if(!isPetrolVehicle()&&isAcFeature()){
				standardRate = 8+2;
			}
			else{
				standardRate = 8;
			}
		}
		else if(vehicleType.equals("BUS")){
			if(isAcFeature()){
				standardRate = 2+8-(0.02*(2+8));
			}
			else{
				standardRate = 8-(0.02*(2+8));
			}
		}
		else{
			standardRate = 2+8;
		}
		return standardRate;     
	}
	
}
