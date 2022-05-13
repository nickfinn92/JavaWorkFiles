package qa.com.main;
import java.util.ArrayList;



public class Garage {
	
	public static ArrayList <Vehicle> VehicleInGarage = new ArrayList<>();
	

	public String addVehicle(Vehicle Vehicle) {
		VehicleInGarage.add(Vehicle);
		return Vehicle + "now in garage";
	}
	
	public String removeVehicle(Vehicle x) {
		VehicleInGarage.remove(x);
		return x + "removed from garage";
	}
	
	public String getVehicle(int index) {
		VehicleInGarage.get(index);
		return index + "got:";
	}
	
	public String clearGarage() {
		VehicleInGarage.clear();
		return "Garage emptied";
	}


	
	
	
	
	
	
}


