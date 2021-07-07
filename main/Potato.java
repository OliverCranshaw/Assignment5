package main;
/**
 * This class implements a Potato which extends the class Crops
 * Potatoes can be harvested when ready to earn money.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Potato extends Crops {
	
	/**
	 * Calls for the constructor of Crops class
	 * name, price, sellprice, days to harvest
	 */
	public Potato() {
		super("Potato", 4, 10, 1);
	}

}
