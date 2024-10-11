package kerbal;

public class FuelTank extends Part{
	private double fuelCapacity; //in liters
	private double currentFuel;

	public FuelTank(String name, String graphics, double weight, double fuelCapacity) {
		super(name, graphics, weight);
		this.fuelCapacity = fuelCapacity;
	}

	//Methods

	public double getFuelCapacity() {
		return fuelCapacity;
	}
}
