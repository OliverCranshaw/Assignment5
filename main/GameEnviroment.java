package main;

import java.util.Random;

/**
 * This class holds the farm and the code for opening and closing windows.
 * It also holds the farmer, day number, actions left and the boolean
 * for whether the time machine has been used as it can only be used once.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class GameEnviroment {
	
	/**
	 * The farm
	 */
	private static Farm farm;
	/**
	 * The farmer
	 */
	private static Farmer farmer = new Farmer();
	/**
	 * The number of days left of the game
	 */
	private static int daysToPlay;
	/**
	 * The day number
	 */
	private static int dayNumber = 1;
	/**
	 * The number of actions left for the day
	 */
	private static int actionsLeft = 2;
	/**
	 * A holder so the chosen number of days to play
	 * can be referred to later to prevent time machine
	 * from going back too far.
	 */
	private static int daysToPlayHolder;
	/**
	 * The boolean of whether the single use time machine
	 * has been used yet
	 */
	private static boolean timeMachineUsed = false;
	/**
	 * The players score, to be displayed at end of game
	 */
	private static int score = 0;
	
	/**
	 * Getter for the farm object.
	 * 
	 * @return the farm object
	 */
	public static Farm getFarm() {
		return farm;
	}
	
	/**
	 * Setter for the farm object.
	 * 
	 * @param farm the farm object (a farm type)
	 */
	public static void setFarm(Farm farm) {
		GameEnviroment.farm = farm;
	}
	
	/**
	 * Getter for the number of days left in the game.
	 * 
	 * @return the number of days left
	 */
	public static int getDaysToPlay() {
		return daysToPlay;
	}
	
	/**
	 * Setter for the number of days left in the game.
	 * 
	 * @param daysToPlay the number of days left
	 */
	public static void setDaysToPlay(int daysToPlay) {
		GameEnviroment.daysToPlay = daysToPlay;
	}
	
	/**
	 * Getter for the farmer object.
	 * 
	 * @return the farmer object
	 */
	public static Farmer getFarmer() {
		return farmer;
	}
	
	/**
	 * Setter for the farmer object.
	 * 
	 * @param farmer the farmer object
	 */
	public static void setFarmer(Farmer farmer) {
		GameEnviroment.farmer = farmer;
	}
	
	/**
	 * Getter for the day number in game.
	 * 
	 * @return the day number
	 */
	public static int getDayNumber() {
		return dayNumber;
	}
	
	/**
	 * Setter for the day number in game.
	 * 
	 * @param dayNumber the day number
	 */
	public static void setDayNumber(int dayNumber) {
		GameEnviroment.dayNumber = dayNumber;
	}
	
	/**
	 * Getter for the number of actions left for the day.
	 * 
	 * @return the number of actions left
	 */
	public static int getActionsLeft() {
		return actionsLeft;
	}
	
	/**
	 * Setter for the number of actions left for the day.
	 * 
	 * @param actionsLeft the number of actions left
	 */
	public static void setActionsLeft(int actionsLeft) {
		GameEnviroment.actionsLeft = actionsLeft;
	}
	
	/**
	 * Getter for the number of total days chosen to play.
	 * 
	 * @return the number of total days chosen to play
	 */
	public static int getDaysToPlayHolder() {
		return daysToPlayHolder;
	}
	
	/**
	 * Setter for the number of total days chosen to play.
	 * 
	 * @param daysToPlayHolder the number of total days chosen to play
	 */
	public static void setDaysToPlayHolder(int daysToPlayHolder) {
		GameEnviroment.daysToPlayHolder = daysToPlayHolder;
	}
	
	/**
	 * Getter for boolean as to whether the single use time machine has been used yet.
	 * 
	 * @return true if time machine has been used, otherwise false
	 */
	public static boolean isTimeMachineUsed() {
		return timeMachineUsed;
	}
	
	/**
	 * Setter for boolean as to whether the single use time machine has been used yet.
	 * 
	 * @param timeMachineUsed the boolean as to whether time machine has been used
	 */
	public static void setTimeMachineUsed(boolean timeMachineUsed) {
		GameEnviroment.timeMachineUsed = timeMachineUsed;
	}
	
	/**
	 * Getter for the player's score.
	 * 
	 * @return the player's score
	 */
	public static int getScore() {
		return score;
	}
	
	/**
	 * Setter for the player's score.
	 * 
	 * @param score the player's score
	 */
	public static void setScore(int score) {
		GameEnviroment.score = score;
	}
	
	/**
	 * Is called for when the tend to crops action is chosen.
	 * This calls for needed methods to change the crops.
	 * 
	 * @param cropName the name of the crop to be tended to
	 */
	public static void tendToCropsRunner(String cropName) {
		
		FarmStock.tendToCrops(cropName);
		
	}
	
	/**
	 * Is called for when the harvest crops action is chosen.
	 * This calls for needed methods to change the crops.
	 * 
	 * @return the output of type HarvestOutputHolder which contains the output string and total earned money from the harvest
	 */
	public static HarvestOutputHolder harvestCropsRunner() {
		
		return FarmStock.harvestCrops();
	}
	
	/**
	 * Is called for when the feed animals action is chosen.
	 * This calls for needed methods to change the animals.
	 */
	public static void feedAnimalsRunner() {
		
		FarmStock.feedAnimals();
	}
	
	/**
	 * Is called for when the play with animals action is chosen.
	 * This calls for needed methods to change the animals.
	 */
	public static void playWithAnimalsRunner() {
		
		FarmStock.playWithAnimals();
	}
	
	/**
	 * Is called for when an item is chosen to be used.
	 * This calls for needed methods to use the item
	 * and update farm details.
	 * 
	 * @param itemName the name of the item to be used
	 */
	public static void useAnItemRunner(String itemName) {
		
		FarmStock.useItem(itemName);
	}
	
	/**
	 * Is called for when the water sprinklers are called
	 * to be used.
	 */
	public static void useWaterSprinklersRunner() {
		FarmStock.useWaterSprinklers();
		
	}
	
	/**
	 * Is called for when the tend to farm land action is used.
	 */
	public static void tendToFarmLandRunner() {
		farm.tendToFarmLand();
	}
	
	/**
	 * Decides whether one of the three random events occurs at random.
	 * Also makes the changes for each random event.
	 * 
	 * @return the text output to be displayed on the main screen
	 */
	public static String randomEventsRunner() {
		
		Random random = new Random(); 
		int randomNumber = random.nextInt(13);
		
		String mainScreenOutput = "";
		
		if (randomNumber == 0) {
			
			for (int i = 0; i < FarmStock.getCropList().size() - 1; i++) {
				
				Random randomNumber1 = new Random();
				int cropIndexRemoval = randomNumber1.nextInt(2);
				
				if (cropIndexRemoval == 0) {
					FarmStock.getCropList().remove(i);
					
				} else {
					FarmStock.getCropList().remove(i + 1);
		
				}
			}
			
			mainScreenOutput = (String.format("Shop Keeper: Good morning %s, welcome to day %s.\n\n"
					+ "Have a good day on the farm and make lots of money!\n\n"
					+ "Unfortunately a drought has occured. This has caused half\n"
					+ "of your crops to die of thirst overnight! Make sure you\n"
					+ "work extra hard on the farm today to make up for the loss.", GameEnviroment.getFarmer().getFarmerName(), GameEnviroment.getDayNumber()));
		
		} else if (randomNumber == 1) {
			
			Random random1 = new Random();
			int randomNumAnimalsLost = random1.nextInt(FarmStock.getAnimalList().size() + 1);
			
			
			for (int i = 0; i < randomNumAnimalsLost; i++) {
				
				int indexAnimalLost = random.nextInt(FarmStock.getAnimalList().size());
				FarmStock.getAnimalList().remove(indexAnimalLost);
			}
			
			for (int i = 0; i < FarmStock.getAnimalList().size(); i++) {
				
				Animals animal = FarmStock.getAnimalList().get(i);
				
				Animals animalHolder = new Animals(animal.getName(), animal.getPurchasePrice(), animal.getDailyEarning(), animal.getHealth(), animal.getHappiness());
				
				animalHolder.setHappiness(animalHolder.getHappiness() - 4);
				
				if (animalHolder.getHappiness() <= 0) {
					animalHolder.setHappiness(0);
					
				}
				
				FarmStock.getAnimalList().set(i, animalHolder);
					
			}
				
			
			
			mainScreenOutput = (String.format("Shop Keeper: Good morning %s, welcome to day %s.\n\n"
					+ "Have a good day on the farm and make lots of money!\n\n"
					+ "Unfortunately overnight %s of your animals escaped\n"
					+ "through a broken fence. I have fixed this fence for you but\n"
					+ "the rest of your animals are very unhappy about losing their\n"
					+ "friends.", GameEnviroment.getFarmer().getFarmerName(), GameEnviroment.getDayNumber(), randomNumAnimalsLost));
			
			
			
		} else if (randomNumber == 2) {
			
			int moneyMade = 40 + 40 * (FarmStock.getCropList().size() + FarmStock.getAnimalList().size());
			
			GameEnviroment.getFarm().setMoney(GameEnviroment.getFarm().getMoney() + moneyMade);
			
			
			mainScreenOutput = (String.format("Shop Keeper: Good morning %s, welcome to day %s.\n\n"
					+ "Have a good day on the farm and make lots of money!\n\n"
					+ "This morning we got the results back for the annual county\n"
					+ "fair. You won the top award! Congratulations, you made %s\n"
					+ "in winnings.", GameEnviroment.getFarmer().getFarmerName(), GameEnviroment.getDayNumber(), moneyMade));
			
		} else {
			
			mainScreenOutput = (String.format("Shop Keeper: Good morning %s, welcome to day %s.\n\n"
					+ "Have a good day on the farm and make lots of money!", GameEnviroment.getFarmer().getFarmerName(), GameEnviroment.getDayNumber()));
		}
		
		return mainScreenOutput;
	
	}

	/**
	 * Launches the main screen window.
	 */
	public void launchMainScreen() {
		
		@SuppressWarnings("unused")
		MainScreen mainWindow = new MainScreen(this);
	}
	
	/**
	 * Closes the main screen window.
	 * 
	 * @param mainWindow the main screen window
	 */
	public void closeMainScreen(MainScreen mainWindow) {
		
		mainWindow.closeWindow();
	}
	
	/**
	 * Launches the setup screen window.
	 */
	public void launchSetupScreen() {
		@SuppressWarnings("unused")
		SetupScreen setupWindow = new SetupScreen(this);
	}
	
	/**
	 * Closes the setup screen window.
	 * 
	 * @param setupWindow the setup screen window
	 */
	public void closeSetupScreen(SetupScreen setupWindow) {
		
		setupWindow.closeWindow();
		launchMainScreen();
	}
	
	/**
	 * Launches the shop screen window.
	 */
	public void launchShopScreen() {
		@SuppressWarnings("unused")
		ShopScreen shopWindow = new ShopScreen(this);
	}
	
	/**
	 * Closes the shop screen window.
	 * 
	 * @param shopWindow the shop screen window
	 */
	public void closeShopScreen(ShopScreen shopWindow) {
		
		shopWindow.closeWindow();
		launchMainScreen();
	}
	
	/**
	 * Launches the tend to crops screen window.
	 */
	public void launchTendToCropsScreen() {
		@SuppressWarnings("unused")
		TendToCropsScreen tendToCropsWindow = new TendToCropsScreen(this);
	}
	
	/**
	 * Closes the tend to crops screen window.
	 * 
	 * @param tendToCropsWindow the tend to crops screen window
	 */
	public void closeTendToCropsScreen(TendToCropsScreen tendToCropsWindow) {
		
		tendToCropsWindow.closeWindow();
		launchMainScreen();
	}
	
	/**
	 * Launches the view status screen window.
	 */
	public void launchViewStatusScreen() {
		@SuppressWarnings("unused")
		ViewStatusScreen viewStatusWindow = new ViewStatusScreen(this);
	}
	
	/**
	 * Closes the view status screen window.
	 * 
	 * @param viewStatusWindow the view status screen window
	 */
	public void closeViewStatusScreen(ViewStatusScreen viewStatusWindow) {
		
		viewStatusWindow.closeWindow();
		launchMainScreen();
	}
	
	/**
	 * Launches the end game screen window.
	 */
	public void launchEndGameScreen() {
		@SuppressWarnings("unused")
		EndGameScreen endGameWindow = new EndGameScreen(this);
	}
	
	/**
	 * Closes the end game screen window.
	 * 
	 * @param endGameWindow the end game screen window
	 */
	public void closeEndGameScreen(EndGameScreen endGameWindow) {
		
		endGameWindow.closeWindow();
	}
	
	/**
	 * Launches the item screen window.
	 */
	public void launchUseItemScreen() {
		@SuppressWarnings("unused")
		UseItemScreen useItemWindow = new UseItemScreen(this);
	}
	
	/**
	 * Closes the item screen window.
	 * 
	 * @param useItemWindow the use item screen window
	 */
	public void closeUseItemScreen(UseItemScreen useItemWindow) {
		
		useItemWindow.closeWindow();
		launchMainScreen();
	}
	

	
	/**
	 * Starts the music then calls for the launch
	 * of the setup screen window to begin the game.
	 * @param args GUI arguments
	 */
	public static void main(String[] args) {

		MusicPlayer.playMusic("sound1.wav");
		GameEnviroment manager = new GameEnviroment();
		manager.launchSetupScreen();

		
	}

}
