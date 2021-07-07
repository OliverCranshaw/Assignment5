package main;
/**
 * This class implements a Fertiliser item that extends the class Items
 * This item when used reduces the days left to harvest for all crops by
 * 2 days. 
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Fertiliser extends Items {

	/**
	 * Calls for the constructor of Items class
	 * name, price, item use
	 */
	public Fertiliser() {
		super("Fertiliser", 750, "Fertilises grass");
	}

}
