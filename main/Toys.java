package main;
/**
 * This class implements the Toys item that extends the class
 * SinglePurchaseItems. This item increases the happiness
 * gained by animals to 4 if owned by the farmer
 * when the animals are played with.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Toys extends SinglePurchaseItems {
	
	/**
	 * Calls for the constructor of SinglePurchaseItems class
	 * name, price
	 */
	public Toys() {
		super("Animal Toys", 250);
	}

}
