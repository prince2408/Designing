
public class CPImplementation {

	public static void main(String []args){
		CPVehicle vehicle1 = new CPCar("lamborghini", "GL3500",
				"MH12LH1539" , "4");
		CPVehicle vehicle2 = new CPCar("Tesla", "TM7000",
				"MH12LH1339" , "4");
		CPVehicle vehicle3 = new CPBike("FZ", "Yamaha", "MH12LH1538", "2");
		
		CPParkingLogic obj = new CPParkingLogic();
		obj.park(vehicle1);
		obj.park(vehicle2);
		obj.park(vehicle3);
	}
}
