package test;

import org.junit.jupiter.api.Test;

import main.GameEnviroment;

class GameEnviromentTest {

	@Test
	public void ScreensLaunchCloseTest() {
		
		GameEnviroment manager = new GameEnviroment();
		
		manager.launchSetupScreen();

		manager.launchMainScreen();
		
		manager.launchTendToCropsScreen();
		
		manager.launchShopScreen();
		
		manager.launchViewStatusScreen();
		
		manager.launchUseItemScreen();
		
		manager.launchEndGameScreen();
		
	}
	
}
