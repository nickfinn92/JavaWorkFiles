package qa.com.main;

public abstract class Vehicle {
	
	private String VehicleType;
	private int JobsNeeded;
	private int VehicleAge;
	public Vehicle(String vehicleType, int jobsNeeded, int vehicleAge) {
		super();
		VehicleType = vehicleType;
		JobsNeeded = jobsNeeded;
		VehicleAge = vehicleAge;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public int getJobsNeeded() {
		return JobsNeeded;
	}
	public void setJobsNeeded(int jobsNeeded) {
		JobsNeeded = jobsNeeded;
	}
	public int getVehicleAge() {
		return VehicleAge;
	}
	public void setVehicleAge(int vehicleAge) {
		VehicleAge = vehicleAge;
	}
	
	
	public float fixVehicle() {float fixVehicle = (80f);
		if (VehicleType == "van") {
			fixVehicle +=50f;}
		if (JobsNeeded >1){
			fixVehicle +=50f;}
		if (VehicleAge >= 10) {
			fixVehicle +=20f;}
		if (VehicleAge >= 20) {
			fixVehicle +=30f;}
		return fixVehicle();
		
		}
	}


