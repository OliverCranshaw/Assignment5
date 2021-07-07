package main;
/**
 * This class implements a Horse which extends the class Animals
 * Horses earn money at the end of each day, the happier they
 * are the more they earn.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Horse extends Animals {
	
	/**
	 * Calls for the constructor of Animals class
	 * name, purchase price, daily earning, health
	 */
	public Horse() {
		super("Horse", 80, 6, 10);
	}

}
