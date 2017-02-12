
public class CPVehicle {

	String vehicleName;
	String model;
	String registrationNumber;
	
	public CPVehicle(String vehicleName, String model, String registrationNumber){
		this.vehicleName = vehicleName;
		this.model = model;
		this.registrationNumber = registrationNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public void getAllDetails(){
		System.out.println("Model is:"+getModel());
		System.out.println("Vehicle name is:"+getVehicleName());
		System.out.println("Registration number is:"+getRegistrationNumber());
	}
}
