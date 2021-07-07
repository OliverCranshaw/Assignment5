package main;
/**
 * This class implements a ValuableCropsFarm type which
 * extends the class Farm. This farm encourages the
 * farmer to focus on their crops as the crops are worth
 * significantly more than animals.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class ValuableCropsFarm extends Farm {
	
	/**
	 * Calls for the constructor of Farm class
	 * type name, starting money, crop extra value, animal starting happiness, starting crop limit
	 */
	public ValuableCropsFarm() {
		super("Valuable Crops Farm", 20, 30, 10, 15);
	}
	
}
