package main;
/**
 * This class implements an animal that earns money at the end
 * of each day. Animals can be fed or played with to increase
 * their stats.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Crops {
	
	/**
	 * The name of the crop
	 */
	private String name;
	/**
	 * The purchase price of the crop
	 */
	private int purchasePrice;
	/**
	 * The sell price of the crop
	 */
	private int sellPrice;
	/**
	 * the number of days the crop to finish growing
	 */
	private int daysToHarvest;

	/**
	 * This is the constructor for setting the attributes of a new Crop.
	 * 
	 * @param cropName the name of the crop to be created
	 * @param purch the purchase price of the crop to be created
	 * @param sell the sell price of the crop to be created
	 * @param days the number of days the crop takes to harvest
	 */
	public Crops(String cropName, int purch, int sell, int days) {
		
		name = cropName;
		purchasePrice = purch;
		sellPrice = sell;
		daysToHarvest = days;
	}
	
	/**
	 * Getter for crop name.
	 * 
	 * @return the crop's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for crop name.
	 * 
	 * @param name the crop's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for crop purchase price.
	 * 
	 * @return the crop's purchase price
	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}
	
	/**
	 * Setter for crop purchase price.
	 * 
	 * @param purchasePrice the crop's purchase price
	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	/**
	 * Getter for crop sell price.
	 * 
	 * @return the crop's sell price
	 */
	public int getSellPrice() {
		return sellPrice;
	}
	
	/**
	 * Setter for crop sell price.
	 * 
	 * @param sellPrice the crop's sell price
	 */
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	
	/**
	 * Getter for crop days to harvest.
	 * 
	 * @return the crop's days to harvest
	 */
	public int getDaysToHarvest() {
		return daysToHarvest;
	}
	
	/**
	 * Setter for crop days to harvest.
	 * 
	 * @param daysToHarvest the crop's days to harvest
	 */
	public void setDaysToHarvest(int daysToHarvest) {
		this.daysToHarvest = daysToHarvest;
	}
	
	
}

