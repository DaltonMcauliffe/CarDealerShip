package CarDealerShip;

public class HybridCar extends Vehicle implements Combustible, Chargeable {
	public HybridCar(String make, String model, int seats, double miles, double price, String color,
			String seatMaterial, String driveTrain, int doors) {
		super(make, model, seats, miles, price, color, seatMaterial, driveTrain, doors);
		// TODO Auto-generated constructor stub
	}

	public boolean pluggedIn;

	

}
