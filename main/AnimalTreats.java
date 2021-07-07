package main;
/**
 * This class implements an AnimalTreats item that extends the class Items
 * This item when used increases animal happiness by 5 and health by 2.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class AnimalTreats extends Items {

	/**
	 * Calls for the constructor of Items class
	 * name, price, item use
	 */
	public AnimalTreats() {
		super("Animal Treats", 450, "Increases all animals happiness by 5 and health by 2");
	}

}
