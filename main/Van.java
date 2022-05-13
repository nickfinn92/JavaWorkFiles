package qa.com.main;

public class Van extends Vehicle {
	
	public float loadSpace; 

	public Van(String vehicleType, int jobsNeeded, int vehicleAge) {
		super(vehicleType, jobsNeeded, vehicleAge);

	}
	
	

	public float getLoadSpace() {
		return loadSpace;
	}



	public void setLoadSpace(float loadSpace) {
		this.loadSpace = loadSpace;
	}



	@Override
	public float fixVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}

}
