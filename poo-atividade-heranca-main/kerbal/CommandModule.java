package kerbal;

public class CommandModule extends Part{
	private int maxCrewSize;
	private Kerbal[] crew;
	
	public CommandModule(String name, String graphics, double weight, int maxCrewSize) {
		super(name, graphics, weight);
		this.maxCrewSize = maxCrewSize;
		this.crew = new Kerbal[maxCrewSize];
	}
}
