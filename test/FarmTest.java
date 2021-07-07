package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Farm;
import main.FarmStock;
import main.GameEnviroment;

class FarmTest {

	@Test
	public void farmInitializeTest() {
		
		GameEnviroment.setFarm(new Farm("Type Test", 0, 0, 0, 0));
		GameEnviroment.getFarm().setFarmName("Testing farm");
		
		assertEquals("Type Test", GameEnviroment.getFarm().getFarmType());
		assertEquals(0, GameEnviroment.getFarm().getMoney());
		assertEquals(0, GameEnviroment.getFarm().getCropValueBonus());
		assertEquals(0, GameEnviroment.getFarm().getAnimalHappiness());
		assertEquals(0, GameEnviroment.getFarm().getCropLimit());
		assertEquals("Testing farm", GameEnviroment.getFarm().getFarmName());
		
		
		GameEnviroment.getFarm().setFarmType("Testing type 2");
		GameEnviroment.getFarm().setMoney(50);
		GameEnviroment.getFarm().setCropValueBonus(10);
		GameEnviroment.getFarm().setAnimalHappiness(5);
		GameEnviroment.getFarm().setCropLimit(15);
		
		assertEquals("Testing type 2", GameEnviroment.getFarm().getFarmType());
		assertEquals(50, GameEnviroment.getFarm().getMoney());
		assertEquals(10, GameEnviroment.getFarm().getCropValueBonus());
		assertEquals(5, GameEnviroment.getFarm().getAnimalHappiness());
		assertEquals(15, GameEnviroment.getFarm().getCropLimit());
			
	}
	
	@Test
	public void tendToFarmLandTest() {
		
		GameEnviroment.setFarm(new Farm("Type Test", 0, 0, 0, 0));
		FarmStock.setAnimalHappinessDecrease(3);
		
		GameEnviroment.getFarm().tendToFarmLand();
		
		assertEquals(2, FarmStock.getAnimalHappinessDecrease());
		assertEquals(3, GameEnviroment.getFarm().getCropLimit());
		
		GameEnviroment.getFarm().tendToFarmLand();
		
		assertEquals(1, FarmStock.getAnimalHappinessDecrease());
		assertEquals(6, GameEnviroment.getFarm().getCropLimit());
		
		GameEnviroment.getFarm().tendToFarmLand();
		
		assertEquals(1, FarmStock.getAnimalHappinessDecrease());
		assertEquals(9, GameEnviroment.getFarm().getCropLimit());
		
		
		
		
		
	}

}
