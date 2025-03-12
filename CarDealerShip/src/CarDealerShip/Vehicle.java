package CarDealerShip;

public class Vehicle {
	private  String make;
	private  String model;
	private int seats;
	private double price;
	private double miles;
	private String color;
	private String seatMaterial;
	private String driveTrain;
	private int doors;
	

	public Vehicle(String make, String model, int seats, double miles, double price, String color, String seatMaterial, String driveTrain, int doors) {
		this.make = make;
		this.model = model;
		this.seats = seats;
		this.miles = miles;
		this.price = price;
		this.color = color;
		this.seatMaterial = seatMaterial;
		this.driveTrain = driveTrain;
		this.doors = doors;
		
	}


	public  String getMake() {
		return make;
	}


	public  void setMake(String make) {
		this.make = make;
	}


	public  String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getMiles() {
		return miles;
	}


	public void setMiles(double miles) {
		this.miles = miles;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSeatMaterial() {
		return seatMaterial;
	}


	public void setSeatMaterial(String seatMaterial) {
		this.seatMaterial = seatMaterial;
	}


	public String getDriveTrain() {
		return driveTrain;
	}


	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}


	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}
	

}
