package main;
/**
 * This class implements a general item with it's name,
 * price and use. These items can be bought multiple times
 * by the player and each have a different effect.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class Items {
	
	/**
	 * The item's name
	 */
	private String name;
	/**
	 * The price of the item
	 */
	private int price;
	/**
	 * The use of the item (No longer used
	 * but nice to still have for future reference)
	 */
	private String use;
	
	/**
	 * The constructor for a specific item.
	 * 
	 * @param itemName the name of the item to be created
	 * @param purchPrice the purchase price of the item to be created
	 * @param usage the usage of the item to be created
	 */
	public Items(String itemName, int purchPrice, String usage) {
		
		name = itemName;
		price = purchPrice;
		use = usage;
		
	}
	
	/**
	 * Getter for the name of a normal item.
	 * 
	 * @return the name of the normal item
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the name of the normal item.
	 * 
	 * @param name the name of the normal item
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for the price of the normal item.
	 * 
	 * @return the price of the normal item
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Setter for the price of the normal item.
	 * 
	 * @param price the price of the normal item
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * Getter for the use of the normal item as a string.
	 * 
	 * @return the string of the item use
	 */
	public String getUse() {
		return use;
	}
	
	/**
	 * Setter for the use of the normal item as a string.
	 * 
	 * @param use the string of the item use
	 */
	public void setUse(String use) {
		this.use = use;
	}
	
	
}
