package main;
/**
 * This class implements Wheat which extends the class Crops
 * Wheat can be harvested when ready to earn money.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Wheat extends Crops {

	/**
	 * Calls for the constructor of Crops class
	 * name, price, sell price, days to harvest
	 */
	public Wheat() {
		super("Wheat", 15, 60, 2);
	}
	
}
