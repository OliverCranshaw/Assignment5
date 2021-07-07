package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Animals;
import main.Farm;
import main.GameEnviroment;

class AnimalsTest {

	@Test
	public void animalHappinessConstructTest() {
		
		GameEnviroment.setFarm(new Farm("Test Farm", 0, 0, 10, 0));
		
		Animals baseHappinessAnimal = new Animals("Base animal", 0, 0, 0);
		Animals specificHappinessAnimal = new Animals("Specific Happiness Animal", 0, 0, 0, 8);
		
		assertEquals(10, baseHappinessAnimal.getHappiness());
		assertEquals(8, specificHappinessAnimal.getHappiness());
		
	}

}
