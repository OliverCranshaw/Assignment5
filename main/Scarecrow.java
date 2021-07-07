package main;

/**
 * This class implements a Scarecrow item that extends the class
 * SinglePurchaseItems. This item increases the value of crops
 * when harvested if owned by the farmer.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Scarecrow extends SinglePurchaseItems {
	
	/**
	 * Calls for the constructor of SinglePurchaseItems class
	 * name, price
	 */
	public Scarecrow() {
		super("Scarecrow", 400);
	}
	

}
