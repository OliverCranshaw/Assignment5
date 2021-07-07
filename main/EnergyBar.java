package main;
/**
 * This class implements an EnergyBar item that extends the class Items
 * This item when used increases the farmers actions left for the day by 2.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class EnergyBar extends Items {

	/**
	 * Calls for the constructor of Items class
	 * name, price, item use
	 */
	public EnergyBar() {
		super("Energy Bar", 500, "Gives you an extra 2 actions");
	}

}
