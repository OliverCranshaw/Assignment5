package main;
/**
 * This class implements a Corn which extends the class Crops
 * Corn can be harvested when ready to earn money.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Corn extends Crops {
	
	/**
	 * Calls for the constructor of Crops class
	 * name, price, sellprice, days to harvest
	 */
	public Corn() {
		super("Corn", 18, 120, 3);
	}	

}
