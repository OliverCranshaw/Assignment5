package main;
/**
 * This class is used to store multiple varibales that
 * can be passed back to the main screen window when
 * crops are harvest. It hold a string output for the
 * main screen text bubble and the total money earned
 * from the harvest action.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class HarvestOutputHolder {
	
	/**
	 * The string to be displayed on the main screen.
	 * Describes what crops have been harvested.
	 */
	private String txtOutput = "";
	/**
	 * The total money earned from the harvest action.
	 */
	private int returnedMoney;
	
	/**
	 * The constructor for making this class.
	 * 
	 * @param money the total money earned for the harvest
	 * @param stringOutput the text output from the harvest method
	 */
	public HarvestOutputHolder(int money, String stringOutput) {
		
		setTxtOutput(stringOutput);
		setReturnedMoney(money);
	}
	
	/**
	 * Getter for the text output from the harvest action.
	 * 
	 * @return the text output from the harvest action
	 */
	public String getTxtOutput() {
		return txtOutput;
	}
	
	/**
	 * Setter for the text output from the harvest action.
	 * 
	 * @param txtOutput the text output from the harvest action
	 */
	public void setTxtOutput(String txtOutput) {
		this.txtOutput = txtOutput;
	}
	
	/**
	 * Getter for the total earned money from the harvest action.
	 * 
	 * @return the total earned money from harvesting
	 */
	public int getReturnedMoney() {
		return returnedMoney;
	}
	
	/**
	 * Setter for the total earned money from the harvest action.
	 * 
	 * @param returnedMoney the total earned money from harvesting
	 */
	public void setReturnedMoney(int returnedMoney) {
		this.returnedMoney = returnedMoney;
	}
}
