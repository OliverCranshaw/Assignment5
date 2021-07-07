package main;
/**
 * This class implements the Stables item that extends the class
 * SinglePurchaseItems. This item allows horses to be purchased
 * from the shop if owned by the farmer.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Stables extends SinglePurchaseItems {
	
	/**
	 * Calls for the constructor of SinglePurchaseItems class
	 * name, price
	 */
	public Stables() {
		super("Stables", 450);
	}

}
