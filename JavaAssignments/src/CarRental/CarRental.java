package CarRental;

import java.util.Scanner;

public class CarRental {
	Vehicle vehicle = new Vehicle();
	City city = new City();
	
	public int tripExpenseCalculation(double rate, double distance){
		int expense = (int) (rate * distance);		
		return expense;
	}
			
	public static void main(String[] args) {
		
		CarRental car = new CarRental();
		String name = "", source = "", destination = "", ac = "", petrol = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Vehicle Type : \t1)CAR \t2)BUS \t3)SUV"); 
        int option = sc.nextInt();
        if(option == 1 || option == 2){
        	System.out.println("Do you want AC(yes/no)?"); 
            ac = sc.next();
        }
        if(option == 1){
        	System.out.println("Do you want petrol(yes/no)?"); 
            petrol = sc.next();
        }
        sc.nextLine();
        System.out.println("Enter Vehicle Name"); 
        name = sc.nextLine(); 
        System.out.println("Enter Source City"); 
        source = sc.next(); 
        System.out.println("Enter Destination City"); 
        destination = sc.next(); 
        sc.close();
        car.vehicle.setValues(option, name, ac, petrol);
        car.city.setValues(source, destination);
        System.out.print("Trip : "+car.vehicle.getVehicleType()+", "+car.vehicle.getVehicleName());
        if(car.vehicle.isAcFeature()&&car.vehicle.isPetrolVehicle()){
        	System.out.print(", AC, Petrol");
        }
        if(!car.vehicle.isAcFeature()&&car.vehicle.isPetrolVehicle()){
        	System.out.print(", Non-AC, Petrol");
        }
        if(car.vehicle.isAcFeature()&&!car.vehicle.isPetrolVehicle()){
        	System.out.print(", AC, Diesel");
        }
        if(!car.vehicle.isAcFeature()&&!car.vehicle.isPetrolVehicle()){
        	System.out.print(", Non-AC, Diesel");
        }
        System.out.println(", "+car.city.getSourceCity()+"-"+car.city.getDestCity());
        System.out.println("Total Expense : "+car.tripExpenseCalculation(car.vehicle.calStandardRate(),car.city.calTotalDistance()));
	}
	
}
