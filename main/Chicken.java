package main;
/**
 * This class implements a Chicken which extends the class Animals
 * Chickens earn money at the end of each day, the happier they
 * are the more they earn.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Chicken extends Animals {
	
	/**
	 * Calls for the constructor of Animals class
	 * name, purchase price, daily earning, health
	 */
	public Chicken() {
		super("Chicken", 8, 1, 10);
	}

}
