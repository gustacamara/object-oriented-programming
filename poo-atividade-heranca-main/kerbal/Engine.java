package kerbal;

public class Engine extends Part {
	private double thrust;
	private double usage; //Per km

	//Constructor
	public Engine(String name, String graphics, double weight, double thrust, double usage){
		super(name, graphics, weight);
		this.thrust = thrust;
		this.usage = usage;
	}

	//Methods
	public double getThrust(){
		return thrust;
	}

	public double getUsage(){
		return usage;
	}
}
