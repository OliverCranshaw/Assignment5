package main;
/**
 * This class implements an animal that earns money at the end
 * of each day. Animals can be fed or played with to increase
 * their stats.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Animals {
	
	/**
	 * The name of the animal.
	 */
	private String name;
	/**
	 * The purchase price of the animal.
	 */
	private int purchasePrice;
	/**
	 * The amount earned each day by the animal.
	 */
	private int dailyEarning;
	/**
	 * The health stat of the animal.
	 */
	private int health;
	/**
	 * The happiness stat of the animal.
	 */
	private int happiness;
	
	
	/**
	 * This is the constructor for setting the attributes of a new Animal.
	 * 
	 * @param nameStr the name of the animal to be created
	 * @param price the price of the animal to be created
	 * @param earning the daily earning of the animal to be created
	 * @param healthStat the health of the animal to be created
	 */
	public Animals(String nameStr, int price, int earning, int healthStat) {
		
		name = nameStr;
		purchasePrice = price;
		dailyEarning = earning;
		health = healthStat;
		happiness = GameEnviroment.getFarm().getAnimalHappiness();
	}
	
	/**
	 * This is the constructor for setting the attributes of a new Animal with a
	 * specific happiness amount rather than the original value.
	 * Used for updating animals in class FarmStock.
	 * 
	 * @param nameStr the name of the animal to be created
	 * @param price the price of the animal to be created
	 * @param earning the daily earning of the animal to be created
	 * @param healthStat the health of the animal to be created
	 * @param happinessholder a holder for the happiness of an animal
	 */
	public Animals(String nameStr, int price, int earning, int healthStat, int happinessholder) {
		
		name = nameStr;
		purchasePrice = price;
		dailyEarning = earning;
		health = healthStat;
		happiness = happinessholder;
	}
	
	/**
	 * Getter for animal name.
	 * 
	 * @return the animal's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for animal name.
	 * 
	 * @param name the animal's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for animal purchase price.
	 * 
	 * @return the animal's purchase price
	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}
	
	/**
	 * Setter for animal purchase price.
	 * 
	 * @param purchasePrice the animal's purchase price
	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	/**
	 * Getter for animal daily earning.
	 * 
	 * @return the animal's daily earning
	 */
	public int getDailyEarning() {
		return dailyEarning;
	}
	
	/**
	 * Setter for the animal daily earning.
	 * 
	 * @param dailyEarning the animal's daily earning
	 */
	public void setDailyEarning(int dailyEarning) {
		this.dailyEarning = dailyEarning;
	}
	
	/**
	 * Getter for animal health.
	 * 
	 * @return the animal's health
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * Setter for animal health.
	 * 
	 * @param health the animal's health
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * Getter for animal happiness.
	 * 
	 * @return the animal's happiness
	 */
	public int getHappiness() {
		return happiness;
	}
	
	/**
	 * Setter for animal happiness.
	 * 
	 * @param happiness the animal's happiness
	 */
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
	
}
