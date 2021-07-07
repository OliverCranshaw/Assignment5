package main;
/**
 * This class implements a RichFarm type which
 * extends the class Farm. This farm starts with
 * much more money than the other farm types but
 * earns less money from animals and crops. This
 * reduces the slow start to the game significantly
 * but makes it harder to earn large amounts in the
 * later days.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class RichFarm extends Farm {
	
	/**
	 * Calls for the constructor of Farm class
	 * type name, starting money, crop extra value, animal starting happiness, starting crop limit
	 */
	public RichFarm() {
		super("Rich Farm", 40, 20, 10, 8);
	}
	
}
