package kerbal;

public class CelestialBody {
	private String name;
	private int diameter; //in km
	private int surfaceGravity;
	private BodyComposition composition;
	private int distanceFromParent; //in km
	private boolean hasFlag;

	enum BodyComposition{Rocky, Gaseous, Plasma};

	public CelestialBody(String name, int diameter, int surfaceGravity, BodyComposition composition, int distanceFromParent, boolean hasFlag) {
		this.name = name;
		this.setDiameter(diameter);
		this.setSurfaceGravity(surfaceGravity);
		this.setComposition(composition);
		this.distanceFromParent = distanceFromParent;
		this.setHasFlag(hasFlag);
	}
	
	//Methods
	public String getName() {
		return name;
	}

	public int getDistanceFromParent() {
		return distanceFromParent;
	}

	public int getSurfaceGravity() {
		return surfaceGravity;
	}

	public void setSurfaceGravity(int surfaceGravity) {
		this.surfaceGravity = surfaceGravity;
	}

	public BodyComposition getComposition() {
		return composition;
	}

	public void setComposition(BodyComposition composition) {
		this.composition = composition;
	}

	public boolean isHasFlag() {
		return hasFlag;
	}

	public void setHasFlag(boolean hasFlag) {
		this.hasFlag = hasFlag;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
}
