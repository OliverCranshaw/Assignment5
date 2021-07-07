package main;
/**
 * This class implements Rice which extends the class Crops
 * Rice can be harvested when ready to earn money.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Rice extends Crops {

	/**
	 * Calls for the constructor of Crops class
	 * name, price, sellprice, days to harvest
	 */
	public Rice() {
		super("Rice", 8, 40, 2);
	}
	
}
