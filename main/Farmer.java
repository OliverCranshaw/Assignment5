package main;
/**
 * This class implements a Farmer which holds the
 * name and age of the farmer. The player chooses
 * these at the start of the game.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Farmer {
	
	/**
	 * The name of the farmer/player
	 */
	private String name;
	/**
	 * The age of the farmer/player
	 */
	private String age;
	
	/**
	 * Sets the farmer's name.
	 * 
	 * @param farmerName the input for farmer name
	 */
	public void setFarmerName(String farmerName) {
		
		this.name = farmerName;
	}
	
	/**
	 * Gets the farmers name for use.
	 * 
	 * @return the farmer's name
	 */
	public String getFarmerName( ) {
		return name;
	}
	
	/**
	 * Sets the farmer's age.
	 * 
	 * @param farmerAge the input for farmer age
	 */
	public void setFarmerAge(String farmerAge) {
		
		this.age = farmerAge;
	}
	
	/**
	 * Gets the farmers age for use.
	 * 
	 * @return the farmer's age
	 */
	public String getFarmerAge() {
		return age;
	}
}	
