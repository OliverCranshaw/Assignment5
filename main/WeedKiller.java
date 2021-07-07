package main;
/**
 * This class implements a WeedKiller item that extends the class Items
 * This item when used increases the farms crop limit by 5.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class WeedKiller extends Items {

	/**
	 * Calls for the constructor of Items class
	 * name, price, item use
	 */
	public WeedKiller() {
		super("Weed Killer", 350, "Kills weeds");
	}

}
