package main;
/**
 * This class implements an AnimalFeeder item that extends the class
 * SinglePurchaseItems. This item increases animal happiness by 1 at
 * the end of each day if owned by the farmer.
 *
 * @author Oliver Cranshaw, Michael Woodard
 */
public class AnimalFeeder extends SinglePurchaseItems {

	/**
	 * Calls for the constructor of SinglePurchaseItems class
	 * name, price
	 */
	public AnimalFeeder() {
		super("Animal Feeder", 750);
	}

}
