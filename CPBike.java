
public class CPBike extends CPVehicle {

	String noOfWheels;
	
	public String getNoOfWheels() {
		return noOfWheels;
	}



	public void setNoOfWheels(String noOfWheels) {
		this.noOfWheels = noOfWheels;
	}



	public CPBike(String vehicleName, String model, String registrationNumber, String noOfWheels) {
		super(vehicleName, model, registrationNumber);
		this.noOfWheels = noOfWheels;
	}
	
	public void getBikeDetails(){
		super.getAllDetails();
		System.out.println("No of wheels:"+getNoOfWheels());
	}

}
