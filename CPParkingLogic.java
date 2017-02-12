import java.util.ArrayList;

import jdk.management.resource.internal.TotalResourceContext;


public class CPParkingLogic {

	public final int maxSlots = 2;
	
	ArrayList<CPVehicle> totalSlots;
	
	
	
	public ArrayList<CPVehicle> getTotalSlots() {
		return totalSlots;
	}

	public CPParkingLogic(){
		totalSlots = new ArrayList<CPVehicle>(maxSlots);
	}
	
	public void park(CPVehicle vehicle){
		if(totalSlots.size()<maxSlots){
			totalSlots.add(vehicle);
			System.out.println("Parking  ");
			vehicle.getAllDetails();
		}
		else{
			System.out.println("Parking is Full and could not park!!");
			vehicle.getAllDetails();
		}
	}
	
	public int getAvailableSlots(){
		return maxSlots-getTotalSlots().size();
	}
	
	public void unpark(CPVehicle vehicle){
		totalSlots.remove(vehicle);
	}
	
	public void getParkedVehicleDetails(){
		for(CPVehicle vehicle : totalSlots){
			vehicle.getAllDetails();
			System.out.println();
	}
}
}