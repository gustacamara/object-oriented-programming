package kerbal;

public class PlanetarySystem {
	private CelestialBody[] celestialBodies; //0 - is parent

	public PlanetarySystem(String name, int diameter, int surfaceGravity, CelestialBody.BodyComposition composition, int distanceFromParent, boolean hasFlag) {
		celestialBodies = new CelestialBody[1];
		celestialBodies[0] = new CelestialBody(name, diameter, surfaceGravity, composition, distanceFromParent, hasFlag);
	}

	public void addCelestialBody(String name, int diameter, int surfaceGravity, CelestialBody.BodyComposition composition, int distanceFromParent, boolean hasFlag) {
		CelestialBody[] temp = new CelestialBody[celestialBodies.length + 1];
		for (int i = 0; i < celestialBodies.length; i++) {
			temp[i] = celestialBodies[i];
		}
		temp[celestialBodies.length] = new CelestialBody(name, diameter, surfaceGravity, composition, distanceFromParent, hasFlag);
		celestialBodies = temp;
	}
	
	public CelestialBody[] getCelestialBodies() {
		return celestialBodies;
	}

	public CelestialBody getBody(String name) {
		for (int i = 0; i < celestialBodies.length; i++) {
			if (celestialBodies[i].getName().equals(name)) {
				return celestialBodies[i];
			}
		}
		return null;
	}
	
	public CelestialBody getBody(int index) {
		return celestialBodies[index];
	}
	
	public int getDistanceBetweenCelestialBodies(CelestialBody body1, CelestialBody body2) {
		if(body1 == body2) {
			return 0;
		}
		int originDistance = celestialBodies[0] == Simulation.currentCelestialBody? 0 : Simulation.currentCelestialBody.getDistanceFromParent();
		return Math.abs(originDistance - body2.getDistanceFromParent());
	}
}

