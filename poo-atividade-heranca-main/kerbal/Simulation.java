package kerbal;

public abstract class Simulation {
	enum GameState{Landed, Orbiting}
	
	static public CelestialBody currentCelestialBody;
	static public GameState gameState = GameState.Landed;
}
