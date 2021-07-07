package main;

import java.util.ArrayList;
/**
 * This class implements and holds the farm's stock.
 * It holds a list of the farmer's single purchase items,
 * normal items, crops and animals. This class runs a
 * majority of the logic for actions to do with the
 * crops, animals and items.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class FarmStock {
	
	/**
	 * A list of the farm's crops
	 */
	private static ArrayList<Crops> cropList = new ArrayList<Crops>();
	/**
	 * A list of the farm's animals
	 */
	private static ArrayList<Animals> animalList = new ArrayList<Animals>();
	/**
	 * A list of the farm's normal items
	 */
	private static ArrayList<Items> itemsList = new ArrayList<Items>();
	/**
	 * A list of the farm's single purchase items
	 */
	private static ArrayList<SinglePurchaseItems> singlePurchaseItemsList = new ArrayList<SinglePurchaseItems>();
	/**
	 * The amount each animal's happiness decreases by at the end of each day
	 */
	private static int animalHappinessDecrease = 3;
	
	/**
	 * Runs at the end of each day in the game.
	 * Reduces each animals happiness by the
	 * animal happiness decrease amount and
	 * decreases each animals health by 2.
	 * An animals happiness cannot drop below 0.
	 * If an animals health drops to 0 or less
	 * the animal dies and is removed from the
	 * farm's stock.
	 * If the farm has an animal feeder the animals
	 * all lose 1 less health at the end of each day.
	 */
	
	
	public static void dailyAnimalRunner() {
		
		for (int i = 0; i < animalList.size(); i++) {
			
			Animals animal = animalList.get(i);
			
			Animals animalHolder = new Animals(animal.getName(), animal.getPurchasePrice(), animal.getDailyEarning(), animal.getHealth(), animal.getHappiness());
			
			GameEnviroment.getFarm().setMoney(GameEnviroment.getFarm().getMoney() + (animal.getDailyEarning() * animal.getHappiness()));
			GameEnviroment.setScore(GameEnviroment.getScore() + (animal.getDailyEarning() * animal.getHappiness()));
			
			animalHolder.setHappiness(animalHolder.getHappiness() - animalHappinessDecrease);
			animalHolder.setHealth(animalHolder.getHealth() - 2);
			
			if (animalHolder.getHappiness() <= 0) {
				animalHolder.setHappiness(0);
			}
			
			if (singlePurchaseItemsList.contains(Shop.getAnimalFeeder())) {
				animalHolder.setHealth(animalHolder.getHealth() + 1);
			
			}
				

			if (animalHolder.getHealth() <= 0) {
				animalList.remove(i);
				i -= 1;
			} else {
				animalList.set(i, animalHolder);
				
			}
		}	
	}
	
	/**
	 * Runs when the feed animal action is chosen.
	 * Increases the health of each animal by 3 up
	 * to the maximum health which is the health it
	 * had when first purchased.
	 */
	public static void feedAnimals() {
		
		Animals baseAnimal = new Chicken();
		
		for (int i = 0; i < animalList.size(); i++) {
			
			Animals animal = animalList.get(i);
			
			Animals animalHolder = new Animals(animal.getName(), animal.getPurchasePrice(), animal.getDailyEarning(), animal.getHealth(), animal.getHappiness());
			
			
			animalHolder.setHealth(animalHolder.getHealth() + 3);
			
			

			
			if (animalHolder.getHealth() > baseAnimal.getHealth()) {
				animalHolder.setHealth(baseAnimal.getHealth());
			
			}
			
			animalList.set(i, animalHolder);
				
		}
		
		SoundPlayer.playMusic("Eating.wav");
	}
	
	/**
	 * Runs when the play with animal action is chosen.
	 * Increases each animals happiness by 2.
	 * If the farmer owns animals toys the increase
	 * is by 4 instead.
	 */
	public static void playWithAnimals() {
		
		Animals baseAnimal = new Chicken();
		
		
		
		for (int i = 0; i < animalList.size(); i++) {
			
			Animals animal = animalList.get(i);
			
			Animals animalHolder = new Animals(animal.getName(), animal.getPurchasePrice(), animal.getDailyEarning(), animal.getHealth(), animal.getHappiness());
			
			
			if (singlePurchaseItemsList.contains(Shop.getAnimalToys())) {
				
				animalHolder.setHappiness(animalHolder.getHappiness() + 4);
				
			} else {
				animalHolder.setHappiness(animalHolder.getHappiness() + 2);
			}
		
			
			if (animalHolder.getHappiness() > baseAnimal.getHappiness()) {
				animalHolder.setHappiness(baseAnimal.getHappiness());
			
			}
			
			animalList.set(i, animalHolder);
				
		}
		
		SoundPlayer.playMusicLoop("PlayAnimals.wav");	
	}

	
	/**
	 * Runs at the end of each day in game.
	 * Reduces the days to harvest of each
	 * crop by 1. The days to harvest cannot
	 * drop below 0.
	 */
	public static void dailyCropRunner() {
		
		for (int i = 0; i < cropList.size(); i++) {
			
			Crops crop = cropList.get(i);
			
			Crops cropHolder = new Crops(crop.getName(), crop.getPurchasePrice(), crop.getSellPrice(), crop.getDaysToHarvest());
			

			cropHolder.setDaysToHarvest(cropHolder.getDaysToHarvest() - 1);
			
			if (cropHolder.getDaysToHarvest() <= 0) {
				cropHolder.setDaysToHarvest(0);
				
			}
			
			cropList.set(i, cropHolder);
				
		}
	}
	
	
	/**
	 * Runs when the use water sprinklers action is
	 * chosen. Reduces the days to harvest on all
	 * crops by 1 day. The days to harvest cannot
	 * drop below 0.
	 */
	public static void useWaterSprinklers() {
			
		for (int i = 0; i < cropList.size(); i++) {
			
			Crops crop = cropList.get(i);
			
			Crops cropHolder = new Crops(crop.getName(), crop.getPurchasePrice(), crop.getSellPrice(), crop.getDaysToHarvest());
			
			
			cropHolder.setDaysToHarvest(cropHolder.getDaysToHarvest() - 1);
				
			if (cropHolder.getDaysToHarvest() <= 0) {
				cropHolder.setDaysToHarvest(0);
					
			}
		
				
			cropList.set(i, cropHolder);
			
		}
		SoundPlayer.playMusic("Watering.wav");
	}

	
	/**
	 * Runs when a specific crop type is tended to as an action.
	 * Each crop of this crop type has it's days to harvest
	 * reduced by 1 day. 
	 * 
	 * @param cropNameString the name of the crop to be tended to
	 */
	public static void tendToCrops(String cropNameString) {
		
		for (int i = 0; i < cropList.size(); i++) {
			
			Crops crop = cropList.get(i);
			
			Crops cropHolder = new Crops(crop.getName(), crop.getPurchasePrice(), crop.getSellPrice(), crop.getDaysToHarvest());
			
			if (cropHolder.getName() == cropNameString) {


				cropHolder.setDaysToHarvest(cropHolder.getDaysToHarvest() - 1);
				
				if (cropHolder.getDaysToHarvest() <= 0) {
					cropHolder.setDaysToHarvest(0);
					
				}
			}
	
			cropList.set(i, cropHolder);
		
		}

		SoundPlayer.playMusic("Watering.wav");
	}
	
	
	/**
	 * Runs when the harvest crops action is chosen.
	 * Goes through each crop in the farm's cropList
	 * and if it ready to harvest adds the crop's value
	 * to the total earned and adds a string output for 
	 * that harvest. If the farm has a scarecrow each
	 * crop harvested is worth 50% more. 
	 * The method returns an object with a string output
	 * and an integer of total money earned from the harvest.
	 *
	 * @return returns the output from the crop harvest, txtOutput and earned money
	 */
	public static HarvestOutputHolder harvestCrops() {
		
		if (singlePurchaseItemsList.contains(Shop.getScarecrow())) {
			
			String txtOutput = "Shop Keeper: Your scarecrow has prevented birds from eating your crops.\nEach crop harvested will earn 100% more.\n\n";
			
			int earnedMoney = 0;
			
			for (int i = 0; i < cropList.size(); i++) {
				
				Crops crop = cropList.get(i);
				
				Crops cropHolder = new Crops(crop.getName(), crop.getPurchasePrice(), crop.getSellPrice(), crop.getDaysToHarvest());
				
				if (cropHolder.getDaysToHarvest() <= 0) {
					
					GameEnviroment.getFarm().setMoney(GameEnviroment.getFarm().getMoney() + (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()) * 2);
					GameEnviroment.setScore(GameEnviroment.getScore() + (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()) * 2);
					
					earnedMoney += (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()) * 2;
					
					
					
					txtOutput += String.format("Harvested a %s and earned $%s.\n", cropHolder.getName(), (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()) * 2);
					cropList.remove(i);
					i -= 1;
					
				} else {
				
					cropList.set(i, cropHolder);
				}
				
			}
			
			SoundPlayer.playMusicLoop("Harvest.wav");
	
			HarvestOutputHolder harvestOutput = new HarvestOutputHolder(earnedMoney, txtOutput);
			
			return harvestOutput;
			
		} else {
			
			String txtOutput = "Shop Keeper: You have harvested the following crops.\n";
		
			int earnedMoney = 0;
			
			for (int i = 0; i < cropList.size(); i++) {
				
				Crops crop = cropList.get(i);
				
				Crops cropHolder = new Crops(crop.getName(), crop.getPurchasePrice(), crop.getSellPrice(), crop.getDaysToHarvest());
				
				if (cropHolder.getDaysToHarvest() <= 0) {
					
					GameEnviroment.getFarm().setMoney(GameEnviroment.getFarm().getMoney() + (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()));
					GameEnviroment.setScore(GameEnviroment.getScore() + (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()));
					
					earnedMoney += (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus());
					
					txtOutput += String.format("Harvested a %s and earned $%s.\n", cropHolder.getName(), (crop.getSellPrice() + GameEnviroment.getFarm().getCropValueBonus()));
					cropList.remove(i);
					i -= 1;
					
				} else {
				
					cropList.set(i, cropHolder);
				}
			}
				
			SoundPlayer.playMusicLoop("Harvest.wav");
		
			HarvestOutputHolder harvestOutput = new HarvestOutputHolder(earnedMoney, txtOutput);
			
			return harvestOutput;
		}
		
	}

	
	
	/**
	 * Runs when the farmer uses an item action.
	 * Depending on which item is chosen to be
	 * used a different action will happen.
	 * The item is then removed from the farm's
	 * item list.
	 * 
	 * @param itemName the name of the item to be used
	 */
	public static void useItem(String itemName) {
	
		if (itemName == "Energy Bar") {
			
			SoundPlayer.playMusic("ItemUse.wav");
			GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() + 3);
			itemsList.remove(Shop.getEnergyBar());
			
		} else if (itemName == "Fertiliser") {
			
			SoundPlayer.playMusic("ItemUse.wav");
			
			for (int i = 0; i < cropList.size(); i++) {
				
				Crops crop = cropList.get(i);
				
				Crops cropHolder = new Crops(crop.getName(), crop.getPurchasePrice(), crop.getSellPrice(), crop.getDaysToHarvest());
				
				
				cropHolder.setDaysToHarvest(cropHolder.getDaysToHarvest() - 2);
					
				if (cropHolder.getDaysToHarvest() <= 0) {
					cropHolder.setDaysToHarvest(0);
						
				}
			
				cropList.set(i, cropHolder);
				
			}
			itemsList.remove(Shop.getFertiliser());
			
		} else if (itemName == "Weed Killer") {
			
			SoundPlayer.playMusic("ItemUse.wav");
			
			GameEnviroment.getFarm().setCropLimit(GameEnviroment.getFarm().getCropLimit() + 8);
			
			itemsList.remove(Shop.getWeedKiller());
			
		} else if (itemName == "Animal Treats") {
			
			SoundPlayer.playMusic("ItemUse.wav");
			
			
			for (int i = 0; i < animalList.size(); i++) {
				
				Animals animal = animalList.get(i);
				
				Animals animalHolder = new Animals(animal.getName(), animal.getPurchasePrice(), animal.getDailyEarning(), animal.getHealth(), animal.getHappiness());
				
				
				
				animalHolder.setHappiness(animalHolder.getHappiness() + 5);
				animalHolder.setHealth(animalHolder.getHealth() + 2);
				
				if (animalHolder.getHappiness() > 10) {
					animalHolder.setHappiness(10);
				
				}
				
				if (animalHolder.getHealth() > 10) {
					animalHolder.setHealth(10);
				}
				
				
				
				animalList.set(i, animalHolder);
					
			}
			itemsList.remove(Shop.getAnimalTreats());
			
		} else if (itemName == "Time Machine (DeLorean)") {
			
			SoundPlayer.playMusic("time_travel.wav");
			
			
			GameEnviroment.setDayNumber(GameEnviroment.getDayNumber() - 3);
			GameEnviroment.setDaysToPlay(GameEnviroment.getDaysToPlay() + 3);
			
			if (GameEnviroment.getDayNumber() < 1) {
				GameEnviroment.setDayNumber(1);
				
			}
			
			if (GameEnviroment.getDaysToPlay() > GameEnviroment.getDaysToPlayHolder()) {
				GameEnviroment.setDaysToPlay(GameEnviroment.getDaysToPlayHolder());
			}
			
			singlePurchaseItemsList.remove(Shop.getTimeMachine());
			GameEnviroment.setTimeMachineUsed(true);
			
			
		}

		GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
		
	}
	
	/**
	 * Getter for the farm's list of crops.
	 * 
	 * @return the list of crops the farm has
	 */
	public static ArrayList<Crops> getCropList() {
		return cropList;
	}
	
	/**
	 * Setter for the farm's list of crops.
	 * 
	 * @param cropList the list of crops the farm has
	 */
	public static void setCropList(ArrayList<Crops> cropList) {
		FarmStock.cropList = cropList;
	}
	
	/**
	 * Getter for the farm's list of animals.
	 * 
	 * @return the list of animal's the farm has
	 */
	public static ArrayList<Animals> getAnimalList() {
		return animalList;
	}
	
	/**
	 * Setter for the farm's list of animals.
	 * 
	 * @param animalList the list of animals the farm has
	 */
	public static void setAnimalList(ArrayList<Animals> animalList) {
		FarmStock.animalList = animalList;
	}
	
	/**
	 * Getter for the farmer's list of normal items.
	 * 
	 * @return the list of normal items the farmer has
	 */
	public static ArrayList<Items> getItemsList() {
		return itemsList;
	}
	
	/**
	 * Setter for the farmer's list of normal items.
	 * 
	 * @param itemsList the list of normal items the farmer has
	 */
	public static void setItemsList(ArrayList<Items> itemsList) {
		FarmStock.itemsList = itemsList;
	}
	
	/**
	 * Getter for the farmer's list of single purchase items.
	 * 
	 * @return the list of single purchase items the farmer has
	 */
	public static ArrayList<SinglePurchaseItems> getSinglePurchaseItemsList() {
		return singlePurchaseItemsList;
	}
	
	/**
	 * Setter for the farmer's list of single purchase items.
	 * 
	 * @param singlePurchaseItemsList the list of single purchase items the farmer has
	 */
	public static void setSinglePurchaseItemsList(ArrayList<SinglePurchaseItems> singlePurchaseItemsList) {
		FarmStock.singlePurchaseItemsList = singlePurchaseItemsList;
	}
	
	/**
	 * Getter for the daily animal happiness decrease.
	 * 
	 * @return the daily animal happiness decrease amount
	 */
	public static int getAnimalHappinessDecrease() {
		return animalHappinessDecrease;
	}
	
	/**
	 * Setter for the daily animal happiness decrease.
	 * 
	 * @param animalHappinessDecrease the daily animal happiness decrease amount
	 */
	public static void setAnimalHappinessDecrease(int animalHappinessDecrease) {
		FarmStock.animalHappinessDecrease = animalHappinessDecrease;
	}

	
}


