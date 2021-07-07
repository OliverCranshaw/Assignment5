package main;
/**
 * This class implements a Farm which holds some of
 * the key stats for the game. The farm can have
 * 4 different types which changes these starting stats.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Farm {
	
	/**
	 * The farm's type
	 */
	private String farmType;
	/**
	 * The farm's name
	 */
	private String farmName;
	/**
	 * The money the player has
	 */
	private int money;
	/**
	 * The farm's crop value bonus
	 * This is how much extra each
	 * crop makes when harvested.
	 */
	private int cropValueBonus;
	/**
	 * The starting happiness of
	 * each animal on the farm
	 */
	private int animalHappiness;
	/**
	 * The starting crop limit of the farm
	 */
	private int cropLimit;

	/**
	 * This is the constructor for setting the attributes of a new farm.
	 * 
	 * @param type the type of the farm to be created
	 * @param startMoney the start money of the farm to be created
	 * @param cropBonus the crop bonus of the farm to be created
	 * @param happinessBonus the happiness bonus of the farm to be created
	 * @param numCropsAllowed the crop limit of the farm to be created
	 */
	public Farm(String type, int startMoney, int cropBonus, int happinessBonus, int numCropsAllowed) {
		
		farmType = type;
		money = startMoney;
		cropValueBonus = cropBonus;
		animalHappiness = happinessBonus;
		cropLimit = numCropsAllowed;
		
	}
		
	/**
	 * This increases the crop limit of the farm by 3 and reduces the
	 * daily happiness decrease of animals by 1 but can't reduce it to
	 * less than 1. This is called for by the tend to crops action on
	 * the farm.
	 */
	public void tendToFarmLand() {
		
		cropLimit += 3;
		FarmStock.setAnimalHappinessDecrease(FarmStock.getAnimalHappinessDecrease() - 1);
		
		if (FarmStock.getAnimalHappinessDecrease() < 1) {
			FarmStock.setAnimalHappinessDecrease(1);
		}
	}
	
	/**
	 * Getter for the farm type.
	 * 
	 * @return the farm's type
	 */
	public String getFarmType() {
		return farmType;
	}
	
	/**
	 * Setter for the farm type.
	 * 
	 * @param farmType the farm's type
	 */
	public void setFarmType(String farmType) {
		this.farmType = farmType;
	}
	
	/**
	 * Getter for the farm name.
	 * 
	 * @return the farm's name
	 */
	public String getFarmName() {
		return farmName;
	}
	
	/**
	 * Setter for the farm name.
	 * 
	 * @param farmName the farm's name
	 */
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	
	/**
	 * Getter for the player's money.
	 * 
	 * @return the player's money amount
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * Setter for the player's money.
	 * 
	 * @param money the player's money amount
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * Getter for the crop value bonus.
	 * 
	 * @return the extra value each crop has when harvested
	 */
	public int getCropValueBonus() {
		return cropValueBonus;
	}
	
	/**
	 * Setter for the crop value bonus.
	 * 
	 * @param cropValueBonus the extra value each crop has when harvested
	 */
	public void setCropValueBonus(int cropValueBonus) {
		this.cropValueBonus = cropValueBonus;
	}
	
	/**
	 * Getter for the animal's happiness.
	 * 
	 * @return the animal's happiness
	 */
	public int getAnimalHappiness() {
		return animalHappiness;
	}
	
	/**
	 * Setter for the animal's happiness.
	 * 
	 * @param animalHappiness the animal's happiness
	 */
	public void setAnimalHappiness(int animalHappiness) {
		this.animalHappiness = animalHappiness;
	}
	
	/**
	 * Getter for the farm's crop limit.
	 * 
	 * @return the farm's crop limit
	 */
	public int getCropLimit() {
		return cropLimit;
	}
	
	/**
	 * Setter for the farm's crop limit.
	 * 
	 * @param cropLimit the farm's crop limit
	 */
	public void setCropLimit(int cropLimit) {
		this.cropLimit = cropLimit;
	}

}
