package main;
/**
 * This class implements a NormalFarm type which
 * extends the class Farm. This farm has relatively
 * even valuing between crops and animals so the
 * player must focus on farming both crops and
 * animals to do well.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class NormalFarm extends Farm {
	
	/**
	 * Calls for the constructor of Farm class
	 * type name, starting money, crop extra value, animal starting happiness, starting crop limit
	 */
	public NormalFarm() {
		super("Normal Farm", 25, 10, 12, 10);
	}	

}
