package main;
/**
 * This class implements a HappyAnimalsFarm type which
 * extends the class Farm. This farm encourages the
 * farmer to focus on animals as they are worth relatively
 * more than crops on this farm.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class HappyAnimalsFarm extends Farm {
	
	/**
	 * Calls for the constructor of Farm class
	 * type name, starting money, crop extra value, animal starting happiness, starting crop limit
	 */
	public HappyAnimalsFarm() {
		super("Happy Animals Farm", 20, 0, 15, 5);
	}

}
