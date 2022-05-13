package qa.com.main;

public class Car extends Vehicle {

	private int numOfDoors; 
	
	public Car(String vehicleType, int jobsNeeded, int vehicleAge, int numOfDoors) {
		super(vehicleType, jobsNeeded, vehicleAge);
		this.numOfDoors = numOfDoors;
		
	}
	

	public int getNumOfDoors() {
		return numOfDoors;
	}


	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}


	@Override
	public float fixVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
