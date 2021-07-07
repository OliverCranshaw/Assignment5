package main;
/**
 * This class implements a Sheep which extends the class Animals
 * Sheep earn money at the end of each day, the happier they
 * are the more they earn.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Sheep extends Animals {
	
	/**
	 * Calls for the constructor of Animals class
	 * name, purchase price, daily earning, health.
	 */
	public Sheep() {
		super("Sheep", 35, 3, 10);
	}

}
