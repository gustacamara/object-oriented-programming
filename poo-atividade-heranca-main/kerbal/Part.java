package kerbal;

public class Part {
	private String name;
	private String graphics;
	private double weight;
	
	public Part(String name, String graphics, double weight) {
		this.name = name;
		this.weight = weight;
		this.graphics = graphics;
	}

	//Methods
	public String getName() {
		return name;
	}

	
	public double getWeight() {
		return weight;
	}
	
	public String getGraphics() {
		return graphics;
	}
}
