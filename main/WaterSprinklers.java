package main;
/**
 * This class implements the WaterSprinklers item that extends the
 * class SinglePurchaseItems. This item allows all types of crop
 * to be tended to at once if owned by the farmer.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class WaterSprinklers extends SinglePurchaseItems {
	
	/**
	 * Calls for the constructor of SinglePurchaseItems class
	 * name, price
	 */
	public WaterSprinklers() {
		super("Water Sprinklers", 900);
	}
	
}
