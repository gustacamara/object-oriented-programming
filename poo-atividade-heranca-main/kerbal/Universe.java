package kerbal;

public class Universe {
	private PlanetarySystem[] system;

	public Universe() {
		initialiseSystem();
	}

	//Methods
	void initialiseSystem() {
		system = new PlanetarySystem[8];

		//Initialise the first system
		system[0] = new PlanetarySystem("Kerbol", 1392000, 0, CelestialBody.BodyComposition.Plasma, 0, false);
		system[1] = new PlanetarySystem("Moho", 250, 5, CelestialBody.BodyComposition.Rocky, 400, false);
		system[2] = new PlanetarySystem("Eve", 700, 17, CelestialBody.BodyComposition.Rocky, 983, false);
		system[2].addCelestialBody("Gilly", 13, 1, CelestialBody.BodyComposition.Rocky, 49, false);
		system[3] = new PlanetarySystem("Kerbin", 600, 10, CelestialBody.BodyComposition.Rocky, 1159, true);
		system[3].addCelestialBody("Mun", 200, 2, CelestialBody.BodyComposition.Rocky, 23, false);
		system[3].addCelestialBody("Minmus", 60, 1, CelestialBody.BodyComposition.Rocky, 39, false);
		system[4] = new PlanetarySystem("Duna", 320, 3, CelestialBody.BodyComposition.Rocky, 1469, false);
		system[4].addCelestialBody("Ike", 130, 1, CelestialBody.BodyComposition.Rocky, 13, false);
		system[5] = new PlanetarySystem("Dres", 138, 2, CelestialBody.BodyComposition.Rocky, 1792, false);
		system[6] = new PlanetarySystem("Jool", 699, 0, CelestialBody.BodyComposition.Gaseous, 2125, false);
		system[6].addCelestialBody("Laythe", 500, 8, CelestialBody.BodyComposition.Rocky, 150, false);
		system[6].addCelestialBody("Vall", 300, 2, CelestialBody.BodyComposition.Rocky, 190, false);
		system[6].addCelestialBody("Tylo", 600, 8, CelestialBody.BodyComposition.Rocky, 235, false);
		system[6].addCelestialBody("Bop", 65, 1, CelestialBody.BodyComposition.Rocky, 289, false);
		system[6].addCelestialBody("Pol", 44, 1, CelestialBody.BodyComposition.Rocky, 311, false);
		system[7] = new PlanetarySystem("Eeloo", 210, 2, CelestialBody.BodyComposition.Rocky, 2987, false);
	}

	public int getDistanceFrom(CelestialBody body1, CelestialBody body2) {
		return Math.abs(body1.getDistanceFromParent() - body2.getDistanceFromParent());
	}
	
	public int getDistanceFrom(int body1, CelestialBody body2) {
		return Math.abs(body1 - body2.getDistanceFromParent());
	}

	public CelestialBody getCelestialBody(String name) {
		for(int i = 0; i < system.length; i++) {
			for(int j = 0; j < system[i].getCelestialBodies().length; j++) {
				if(system[i].getBody(j).getName().equals(name)) {
					return system[i].getBody(j);
				}
			}
		}
		return null;
	}

	public CelestialBody getCelestialBody(int systemIndex, int bodyIndex) {
		return system[systemIndex].getBody(bodyIndex);
	}

	public PlanetarySystem getSystem(String name) {
		for(int i = 0; i < system.length; i++) {
			if(system[i].getBody(name) != null) {
				return system[i];
			}
		}
		return null;
	}

	public PlanetarySystem getSystem(int index) {
		return system[index];
	}
	



	public void printSystemTable(PlanetarySystem system) {
		CelestialBody[] celestialBodies = system.getCelestialBodies();
		int originDistance = celestialBodies[0] == Simulation.currentCelestialBody? 0 : Simulation.currentCelestialBody.getDistanceFromParent();
		for (int i = 0; i < celestialBodies.length; i++) {
			int finalDistance = system.getDistanceBetweenCelestialBodies(Simulation.currentCelestialBody, celestialBodies[i]);
			System.out.printf("%d. | name: %s | travel distance: %d | diameter: %d | surface gravity: %d\n", i, 
			celestialBodies[i].getName(), 
			finalDistance,
			celestialBodies[i].getDiameter(), 
			celestialBodies[i].getSurfaceGravity());
			
			//System.out.println(Simulation.currentCelestialBody.getDistanceFromParent()  + " - " + celestialBodies[i].getDistanceFromParent());
		}
	}
}
