package kerbal;

public abstract class AvailableParts {
	public static CommandModule[] commandModules = new CommandModule[] {
		new CommandModule("Mk1-3 Command Pod", 
		"\n" + " /T\\" + "\n" +
		"\n" + "/ 0 \\" + "\n" +
		"\n" +"\\___/"
		, 6.0, 3),
		new CommandModule("Mk1 Command Pod",
		"\n" + " ___ " + "\n" +
		"\n" + "/ 0 \\" + "\n" +
		"\n" + "^^^^^"
		,2.0, 1)
	};
	public static FuelTank[] fuelTanks = new FuelTank[] {
		new FuelTank("FL-T400 Fuel Tank",
		"\n" + " ___" + "\n" +
		"\n" + "| F |" + "\n" +
		"\n" + "L_T_|"
		, 0.5, 4500),
		new FuelTank("Oscar-B Fuel Tank",
		"\n" + " (^) " + "\n" +
		"\n" + " (_) "
		, 0.1, 1000),
	};
	public static Engine[] engines = new Engine[] {
        new Engine("LV-T30 Liquid Fuel Engine", 
        "\n" + "  ^  " + "\n" +
        "\n" + "/   \\" + "\n",
        1.0, 2150, 0.5),
        new Engine("LV-909 Liquid Fuel Engine",
        "\n" + "|| ||" + "\n" +
        "\n" + "^^ ^^"
        , 0.5, 500, 0.2)
    };
}
