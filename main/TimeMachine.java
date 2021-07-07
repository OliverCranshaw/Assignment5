package main;
/**
 * This class implements a TimeMachine item that extends the class
 * SinglePurchaseItems. This item takes the farmer back in time by
 * 2 days when used.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class TimeMachine extends SinglePurchaseItems {
	
	/**
	 * Calls for the constructor of SinglePurchaseItems class
	 * name, price
	 */
	public TimeMachine() {
		super("Time Machine (DeLorean)", 1000);
	}

}
