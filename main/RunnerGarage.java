package qa.com.main;

import qa.com.main.Vehicle;
import qa.com.main.Garage;

public class RunnerGarage {
	
	public static void main(String[] args) {
		
		Garage newGarage = new Garage();
		
		Car Fiat500 = new Car("car", 3, 12, 5);
		Van Transit1 = new Van("van", 10, 25);
		Bike Ducatti1 = new Bike("bike", 6, 3);
		System.out.println(Fiat500.fixVehicle());
		//System.out.println(newGarage.addVehicle(Fiat500));
		//System.out.println(newGarage.addVehicle(Transit1));
		//System.out.println(newGarage.addVehicle(Ducatti1));
		
		
	}
}
