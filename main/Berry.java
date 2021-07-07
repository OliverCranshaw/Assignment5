package main;
/**
 * This class implements a Berry which extends the class Crops
 * Berrys can be harvested when ready to earn money.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Berry extends Crops {
	
	/**
	 * Calls for the constructor of Crops class
	 * name, price, sellprice, days to harvest
	 */
	public Berry() {
		super("Berry", 40, 160, 2); 
	}

}
