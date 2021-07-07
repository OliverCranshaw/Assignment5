package main;
/**
 * This class implements a single purchase item with it's name,
 * price and use. These items can only be purchased from the shop
 * once and have a range of uses.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class SinglePurchaseItems {
	
	/**
	 * The item's price
	 */
	private int price;
	/**
	 * The item's name
	 */
	private String name;
	
	/**
	 * The constructor for a specific item.
	 * 
	 * @param itemName the name of the item to be created
	 * @param purchPrice the purchase price of the item to be created
	 */
	public SinglePurchaseItems(String itemName, int purchPrice) {
		
		price = purchPrice;
		name = itemName;

	}
	
	/**
	 * Getter for the price of a single purchase item.
	 * 
	 * @return the price of the single purchase item
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Setter for the price of a single purchase item.
	 * 
	 * @param price the price of a single purchase item
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * Getter for the name of the single purchase item.
	 * 
	 * @return the name of the single purchase item
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the name of the single purchase item.
	 * 
	 * @param name the name of the single purchase item
	 */
	public void setName(String name) {
		this.name = name;
	}

}
