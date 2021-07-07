package main;
/**
 * This class implements Sugarcane which extends the class Crops
 * Sugarcane can be harvested when ready to earn money.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Sugarcane extends Crops {

	/**
	 * Calls for the constructor of Crops class
	 * name, price, sellprice, days to harvest
	 */
	public Sugarcane() {
		super("Sugarcane", 25, 60, 1);
	}

}
