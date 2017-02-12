
public class CPCar extends CPVehicle {
	String noOfWheels;

	
	
	public String getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(String noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public CPCar(String vehicleName, String model, String registrationNumber,String noOfWheels) {
		super(vehicleName, model, registrationNumber);
		this.noOfWheels = noOfWheels;
		// TODO Auto-generated constructor stub
	}
	
	public void printCarDetails(){
		super.getAllDetails();
		System.out.println("No of wheels:"+getNoOfWheels());
	}

}
