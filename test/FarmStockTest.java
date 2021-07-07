package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Animals;
import main.Crops;
import main.Farm;
import main.FarmStock;

import main.GameEnviroment;

import main.Shop;
import main.SinglePurchaseItems;

class FarmStockTest {
	
	@Test
	public void dailyAnimalStatChangeTest() {
		
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		GameEnviroment.getFarm().setMoney(0);
		
		Animals testAnimal = new Animals("Test animal", 0, 5, 10, 10);
		Animals testAnimal2 = new Animals("Test animal1", 0, 5, 10, 10);
		

		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		FarmStock.setAnimalList(testAnimalList);
		FarmStock.setAnimalHappinessDecrease(3);

		
		FarmStock.dailyAnimalRunner();
		
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(8, animal.getHealth());
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(7, animal.getHappiness());
		
		assertEquals(100, GameEnviroment.getFarm().getMoney());
		

		
	}
	
	@Test
	public void animalDeathTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		Animals testAnimalDie = new Animals("Animal to die", 0, 5, 2, 1);
		Animals testAnimalDie2 = new Animals("Animal to die", 0, 5, 1, 0);
		
		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimalDie);
		testAnimalList.add(testAnimalDie2);
		FarmStock.setAnimalList(testAnimalList);
		
		
		ArrayList<SinglePurchaseItems> singleItemsList = new ArrayList<SinglePurchaseItems>();
		FarmStock.setSinglePurchaseItemsList(singleItemsList);
		
		
		FarmStock.dailyAnimalRunner();

		
		assertEquals(0, FarmStock.getAnimalList().size());
		
		
	}
	
	@Test
	public void animalFeederTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		Animals testAnimal = new Animals("Test animal", 0, 5, 10, 10);
		Animals testAnimal2 = new Animals("Test animal1", 0, 5, 10, 10);

		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		FarmStock.setAnimalList(testAnimalList);
			
		
		ArrayList<SinglePurchaseItems> singleItemsList = new ArrayList<SinglePurchaseItems>();
		singleItemsList.add(Shop.getAnimalFeeder());
		FarmStock.setSinglePurchaseItemsList(singleItemsList);

		
		FarmStock.dailyAnimalRunner();
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(9, animal.getHealth());

		

	}
	
	@Test
	public void feedAnimalsTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		
		Animals testAnimal = new Animals("Test animal", 0, 5, 5, 10);
		
		Animals testAnimal2 = new Animals("Test animal1", 0, 5, 5, 10);
		

		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		
		FarmStock.setAnimalList(testAnimalList);
			

		FarmStock.feedAnimals();
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(8, animal.getHealth());
		
	}
	
	@Test
	public void feedAnimalsAboveMaxTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		Animals testAnimal = new Animals("Test animal", 0, 5, 8, 10);
		Animals testAnimal2 = new Animals("Test animal1", 0, 5, 9, 10);
		
		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		FarmStock.setAnimalList(testAnimalList);
		
		
		FarmStock.feedAnimals();
		
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(10, animal.getHealth());
		
	}
	
	@Test
	public void playWithAnimalsTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		Animals testAnimal = new Animals("Test animal", 0, 5, 5, 0);
		Animals testAnimal2 = new Animals("Test animal1", 0, 5, 5, 0);
		
		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		FarmStock.setAnimalList(testAnimalList);
		
		
		ArrayList<SinglePurchaseItems> singleItemsList = new ArrayList<SinglePurchaseItems>();
		FarmStock.setSinglePurchaseItemsList(singleItemsList);
		
		
		FarmStock.playWithAnimals();
		
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(2, animal.getHappiness());
		
	}
	
	@Test
	public void playWithAnimalsToysTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		Animals testAnimal = new Animals("Test animal", 0, 5, 5, 7);
		Animals testAnimal2 = new Animals("Test animal1", 0, 5, 5, 6);
		
		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		FarmStock.setAnimalList(testAnimalList);
		
		ArrayList<SinglePurchaseItems> singleItemsList = new ArrayList<SinglePurchaseItems>();
		singleItemsList.add(Shop.getAnimalToys());
		FarmStock.setSinglePurchaseItemsList(singleItemsList);

		FarmStock.playWithAnimals();
		
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(10, animal.getHappiness());
		
	}
	
	@Test
	public void dailyCropRunnerTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 3));
		
		Crops testCrop = new Crops("Test Crop", 0, 5, 3);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 3);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		FarmStock.setCropList(testCropList);
		
		FarmStock.dailyCropRunner();
		
		for (Crops crop : FarmStock.getCropList())
			assertEquals(2, crop.getDaysToHarvest());
		
		
		
	}
	
	@Test
	public void dailyCropRunnerReadyToHarvestTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 3));
		
		Crops testCrop = new Crops("Test Crop", 0, 5, 0);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 1);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		FarmStock.setCropList(testCropList);
		
		FarmStock.dailyCropRunner();
		
		for (Crops crop : FarmStock.getCropList())
			assertEquals(0, crop.getDaysToHarvest());
		
		
	}
	
	@Test 
	public void useWaterSprinklersTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 3));
		
		Crops testCrop = new Crops("Test Crop", 0, 5, 1);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 0);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		FarmStock.setCropList(testCropList);
		
		FarmStock.useWaterSprinklers();
		
		for (Crops crop : FarmStock.getCropList())
			assertEquals(0, crop.getDaysToHarvest());
	
	}
	
	@Test
	public void tendToCropsTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 5));
		
		Crops testCrop = new Crops("Test Crop", 0, 5, 5);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 0);
		Crops testCrop3 = new Crops("Test Crop2", 0, 5, 1);
		Crops testCrop4 = new Crops("Test Crop2", 0, 5, 1);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		testCropList.add(testCrop3);
		testCropList.add(testCrop4);
		FarmStock.setCropList(testCropList);
		
		FarmStock.tendToCrops("Test Crop2");
		
		for (Crops crop : FarmStock.getCropList())
			if (crop.getName() == "Test Crop") {
				assertEquals(5, crop.getDaysToHarvest());
			} else if (crop.getName() == "Test Crop2") {
				assertEquals(0, crop.getDaysToHarvest());
			}

		
	}
	
	@Test
	public void energyBarUseTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 3));
		GameEnviroment.setActionsLeft(1);
		
		
		FarmStock.useItem("Energy Bar");
		
		
		assertEquals(3, GameEnviroment.getActionsLeft());
		
	
	}
	
	@Test
	public void fertiliserUseTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 5));
		
		Crops testCrop = new Crops("Test Crop", 0, 5, 1);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 0);
		Crops testCrop3 = new Crops("Test Crop3", 0, 5, 1);
		Crops testCrop4 = new Crops("Test Crop3", 0, 5, 0);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		testCropList.add(testCrop3);
		testCropList.add(testCrop4);
		FarmStock.setCropList(testCropList);
		
		
		FarmStock.useItem("Fertiliser");
		
		for (Crops crop : FarmStock.getCropList()) {
			assertEquals(0, crop.getDaysToHarvest());
		}
		
	}
	
	@Test
	public void weedKillerUseTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 3));
		GameEnviroment.getFarm().setCropLimit(10);

		
		FarmStock.useItem("Weed Killer");
		
		assertEquals(18, GameEnviroment.getFarm().getCropLimit());
	}
	
	@Test
	public void animalTreatsUseTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		Animals testAnimal = new Animals("Test animal", 0, 5, 8, 5);
		Animals testAnimal2 = new Animals("Test animal2", 0, 5, 9, 6);
		Animals testAnimal3 = new Animals("Test animal3", 0, 5, 10, 7);
		
		
		ArrayList<Animals> testAnimalList = new ArrayList<Animals>();
		testAnimalList.add(testAnimal);
		testAnimalList.add(testAnimal2);
		testAnimalList.add(testAnimal3);
		FarmStock.setAnimalList(testAnimalList);
		

		FarmStock.useItem("Animal Treats");
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(10, animal.getHappiness());
		
		for (Animals animal : FarmStock.getAnimalList())
			assertEquals(10, animal.getHealth());

		
	}
	
	@Test
	public void timeMachineUseTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 30, 10, 0));
		GameEnviroment.setDayNumber(3);
		GameEnviroment.setDaysToPlay(5);
		GameEnviroment.setDaysToPlayHolder(6);
		
		FarmStock.useItem("Time Machine (DeLorean)");
		
		assertEquals(1, GameEnviroment.getDayNumber());
		assertEquals(6, GameEnviroment.getDaysToPlay());
		
	}
	
	@Test
	public void harvestCropsTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 0, 10, 5));

		
		Crops testCrop = new Crops("Test Crop", 0, 5, 2);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 0);
		Crops testCrop3 = new Crops("Test Crop3", 0, 5, 1);
		Crops testCrop4 = new Crops("Test Crop3", 0, 5, 0);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		testCropList.add(testCrop3);
		testCropList.add(testCrop4);
		FarmStock.setCropList(testCropList);
		
		ArrayList<SinglePurchaseItems> singleItemsList = new ArrayList<SinglePurchaseItems>();
		FarmStock.setSinglePurchaseItemsList(singleItemsList);
		
		FarmStock.harvestCrops();
		
		assertEquals(2, testCropList.size());
		assertEquals(10, GameEnviroment.getFarm().getMoney());
		
	}
	
	@Test
	public void harvestCropsScrarecrowTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 0, 10, 5));

		
		Crops testCrop = new Crops("Test Crop", 0, 5, 2);
		Crops testCrop2 = new Crops("Test Crop2", 0, 5, 0);
		Crops testCrop3 = new Crops("Test Crop3", 0, 5, 1);
		Crops testCrop4 = new Crops("Test Crop3", 0, 5, 0);
		
		ArrayList<Crops> testCropList = new ArrayList<Crops>();
		testCropList.add(testCrop);
		testCropList.add(testCrop2);
		testCropList.add(testCrop3);
		testCropList.add(testCrop4);
		FarmStock.setCropList(testCropList);
		
		ArrayList<SinglePurchaseItems> singleItemsList = new ArrayList<SinglePurchaseItems>();
		singleItemsList.add(Shop.getScarecrow());
		FarmStock.setSinglePurchaseItemsList(singleItemsList);
		
		FarmStock.harvestCrops();
		
		assertEquals(2, testCropList.size());
		assertEquals(20, GameEnviroment.getFarm().getMoney());
		
		
	}
}
