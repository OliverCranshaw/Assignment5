package main;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
/**
 * This class is the shop screen. It shows all purchasable things.
 * The crops, items and animals can be seen along with all
 * their information. This is where the player will buy
 * things for his farm.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class ShopScreen {
	
	/**
	 * The frame of the shop screen
	 */
	private JFrame frmShopScreen;
	/**
	 * The manager for opening and closing windows
	 */
	private GameEnviroment manager;
	
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of windows
	 */
	public ShopScreen(GameEnviroment incomingManager) {
		manager = incomingManager;
		initialize();
		frmShopScreen.setVisible(true);
	}
	
	/**
	 * Closes the window.
	 */
	public void closeWindow() {
		
		frmShopScreen.dispose();
	}
	
	/**
	 * Closes the window and launches the main screen.
	 */
	public void finishedWindow() {
		
		manager.closeShopScreen(this);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	/**
	 * Checks if an input string, (the desired amount of something
	 * to purchase) is an integer.
	 * 
	 * @param inputString the input string for purchase amount to be checked
	 * @return the boolean as to whether the string was an integer
	 */
	public static boolean isInt(String inputString) {
		
	      boolean isValidInteger = false;
	      
	      try {
	         Integer.parseInt(inputString);

	 
	         isValidInteger = true;
	      } catch (NumberFormatException ex) {
	     
	      }
	 
	      return isValidInteger;
	   }
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShopScreen = new JFrame();
		frmShopScreen.setTitle("County Store");
		frmShopScreen.getContentPane().setBackground(new Color(135, 206, 250));
		frmShopScreen.setBackground(Color.RED);
		frmShopScreen.setBounds(100, 100, 1350, 790);
		frmShopScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShopScreen.getContentPane().setLayout(null);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(108, 520, 2, 15);
		frmShopScreen.getContentPane().add(separator_5);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(108, 521, 55, 2);
		frmShopScreen.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(108, 534, 40, 2);
		frmShopScreen.getContentPane().add(separator_4);
		
		JLabel lblMoneyPicture = new JLabel("");
		lblMoneyPicture.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/MoneyResized.png")));
		lblMoneyPicture.setBounds(999, 45, 75, 57);
		frmShopScreen.getContentPane().add(lblMoneyPicture);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(108, 521, 40, 15);
		frmShopScreen.getContentPane().add(textPane);
		
		JLabel lblStoreFront = new JLabel("");
		lblStoreFront.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/StoreFrontResized.png")));
		lblStoreFront.setBounds(595, 0, 159, 158);
		frmShopScreen.getContentPane().add(lblStoreFront);
		
		JRadioButton rdbtnTimeMachine = new JRadioButton("");
		rdbtnTimeMachine.setBackground(new Color(205, 133, 63));
		rdbtnTimeMachine.setBounds(847, 318, 20, 20);
		frmShopScreen.getContentPane().add(rdbtnTimeMachine);

		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getTimeMachine()) || GameEnviroment.isTimeMachineUsed()) {
			rdbtnTimeMachine.setEnabled(false);	
		}
		
		JRadioButton rdbtnScarecrow = new JRadioButton("");
		rdbtnScarecrow.setBackground(new Color(205, 133, 63));
		rdbtnScarecrow.setBounds(847, 388, 20, 20);
		frmShopScreen.getContentPane().add(rdbtnScarecrow);

		
		JRadioButton rdbtnStables = new JRadioButton("");
		rdbtnStables.setBackground(new Color(205, 133, 63));
		rdbtnStables.setBounds(847, 423, 20, 20);
		frmShopScreen.getContentPane().add(rdbtnStables);

		
		JRadioButton rdbtnAnimalFeeder = new JRadioButton("");
		rdbtnAnimalFeeder.setBackground(new Color(205, 133, 63));
		rdbtnAnimalFeeder.setBounds(847, 458, 20, 20);
		frmShopScreen.getContentPane().add(rdbtnAnimalFeeder);

		
		JRadioButton rdbtnWaterSprinklers = new JRadioButton("");
		rdbtnWaterSprinklers.setBackground(new Color(205, 133, 63));
		rdbtnWaterSprinklers.setBounds(847, 353, 20, 20);
		frmShopScreen.getContentPane().add(rdbtnWaterSprinklers);

		
		JRadioButton rdbtnAnimalToys = new JRadioButton("");
		rdbtnAnimalToys.setBackground(new Color(205, 133, 63));
		rdbtnAnimalToys.setBounds(847, 493, 20, 20);
		frmShopScreen.getContentPane().add(rdbtnAnimalToys);

		
		JLabel moneyLabel = new JLabel(String.format("Money: $%s", GameEnviroment.getFarm().getMoney()));
		moneyLabel.setForeground(Color.CYAN);
		moneyLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		moneyLabel.setBounds(1069, 53, 168, 49);
		frmShopScreen.getContentPane().add(moneyLabel);
		
		JButton btnBackToFarmMenu = new JButton("Back To Farm Menu");
		btnBackToFarmMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finishedWindow();

			}
		});
		btnBackToFarmMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBackToFarmMenu.setBounds(1042, 630, 184, 49);
		frmShopScreen.getContentPane().add(btnBackToFarmMenu);
		
		JLabel lblPotatoInfo = new JLabel("Potato");
		lblPotatoInfo.setForeground(Color.CYAN);
		lblPotatoInfo.setToolTipText(String.format("Price: $%s, Harvest earning: $%s, Days till fully grown: %s", Shop.getPotato().getPurchasePrice(), Shop.getPotato().getSellPrice() + GameEnviroment.getFarm().getCropValueBonus(), Shop.getPotato().getDaysToHarvest()));
		lblPotatoInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/PotatoResized.png")));
		lblPotatoInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPotatoInfo.setBounds(10, 178, 371, 30);
		frmShopScreen.getContentPane().add(lblPotatoInfo);
		
		JTextPane PotatoInput = new JTextPane();
		PotatoInput.setText("0");
		PotatoInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PotatoInput.setBounds(391, 178, 35, 30);
		frmShopScreen.getContentPane().add(PotatoInput);
		
		JTextPane EnergyBarInput = new JTextPane();
		EnergyBarInput.setText("0");
		EnergyBarInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		EnergyBarInput.setBounds(838, 178, 35, 30);
		frmShopScreen.getContentPane().add(EnergyBarInput);
		
		JLabel lblEnergyBarInfo = new JLabel("Energy Bar");
		lblEnergyBarInfo.setForeground(Color.CYAN);
		lblEnergyBarInfo.setToolTipText(String.format("Price: $%s, Use: Can be eaten to increase your number of actions left by 2", Shop.getEnergyBar().getPrice()));
		lblEnergyBarInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/EnergyBarResized.png")));
		lblEnergyBarInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnergyBarInfo.setBounds(458, 178, 360, 30);
		frmShopScreen.getContentPane().add(lblEnergyBarInfo);
		
		JTextPane ChickenInput = new JTextPane();
		ChickenInput.setText("0");
		ChickenInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ChickenInput.setBounds(1289, 178, 35, 30);
		frmShopScreen.getContentPane().add(ChickenInput);
		
		JLabel lblChickenInfo = new JLabel("Chicken");
		lblChickenInfo.setForeground(Color.CYAN);
		lblChickenInfo.setToolTipText(String.format("Price: $%s, Daily earning: $%s, Starting happiness: %s", Shop.getChicken().getPurchasePrice(), Shop.getChicken().getDailyEarning(), Shop.getChicken().getHappiness()));
		lblChickenInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/ChickenResized.png")));
		lblChickenInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChickenInfo.setBounds(900, 178, 360, 30);
		frmShopScreen.getContentPane().add(lblChickenInfo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(147, 521, 743, 229);
		frmShopScreen.getContentPane().add(scrollPane);
		
		JTextArea ShopKeeperSpeech = new JTextArea();
		ShopKeeperSpeech.setEditable(false);
		scrollPane.setViewportView(ShopKeeperSpeech);
		ShopKeeperSpeech.setFont(new Font("Monospaced", Font.PLAIN, 16));
		ShopKeeperSpeech.setText("Shop Keeper: Welcome to my shop. Input how much of each item you would \r\nlike then click purchase. Some items can only be purchased once, these \r\nhave radio buttons. Hover your mouse over an item to see more information \r\nabout it. ");
		
		JLabel lblRiceInfo = new JLabel("Rice");
		lblRiceInfo.setForeground(Color.CYAN);
		lblRiceInfo.setToolTipText(String.format("Price: $%s, Harvest earning: $%s, Days till fully grown: %s", Shop.getRice().getPurchasePrice(), Shop.getRice().getSellPrice() + GameEnviroment.getFarm().getCropValueBonus(), Shop.getRice().getDaysToHarvest()));
		lblRiceInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/RiceResized.png")));
		lblRiceInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRiceInfo.setBounds(10, 213, 371, 30);
		frmShopScreen.getContentPane().add(lblRiceInfo);
		
		JTextPane RiceInput = new JTextPane();
		RiceInput.setText("0");
		RiceInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		RiceInput.setBounds(391, 213, 35, 30);
		frmShopScreen.getContentPane().add(RiceInput);
		
		JLabel lblFertiliserInfo = new JLabel("Fertiliser");
		lblFertiliserInfo.setForeground(Color.CYAN);
		lblFertiliserInfo.setToolTipText(String.format("Price: $%s, Use: Can be used to decrease the days left to harvest on all your crops by 2", Shop.getFertiliser().getPrice()));
		lblFertiliserInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/FertiliserResized.png")));
		lblFertiliserInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFertiliserInfo.setBounds(458, 213, 360, 30);
		frmShopScreen.getContentPane().add(lblFertiliserInfo);
		
		JTextPane FertiliserInput = new JTextPane();
		FertiliserInput.setText("0");
		FertiliserInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FertiliserInput.setBounds(838, 213, 35, 30);
		frmShopScreen.getContentPane().add(FertiliserInput);
		
		JLabel lblPigInfo = new JLabel("Pig");
		lblPigInfo.setForeground(Color.CYAN);
		lblPigInfo.setToolTipText(String.format("Price: $%s, Daily earning: $%s, Starting happiness: %s", Shop.getPig().getPurchasePrice(), Shop.getPig().getDailyEarning(), Shop.getPig().getHappiness()));
		lblPigInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/PigResized.png")));
		lblPigInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPigInfo.setBounds(900, 213, 360, 30);
		frmShopScreen.getContentPane().add(lblPigInfo);
		
		JTextPane PigInput = new JTextPane();
		PigInput.setText("0");
		PigInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PigInput.setBounds(1289, 213, 35, 30);
		frmShopScreen.getContentPane().add(PigInput);
		
		JLabel lblWheatInfo = new JLabel("Wheat");
		lblWheatInfo.setForeground(Color.CYAN);
		lblWheatInfo.setToolTipText(String.format("Price: $%s, Harvest earning: $%s, Days till fully grown: %s", Shop.getWheat().getPurchasePrice(), Shop.getWheat().getSellPrice() + GameEnviroment.getFarm().getCropValueBonus(), Shop.getWheat().getDaysToHarvest()));
		lblWheatInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/WheatResized.png")));
		lblWheatInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWheatInfo.setBounds(10, 248, 371, 30);
		frmShopScreen.getContentPane().add(lblWheatInfo);
		
		JTextPane WheatInput = new JTextPane();
		WheatInput.setText("0");
		WheatInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		WheatInput.setBounds(391, 248, 35, 30);
		frmShopScreen.getContentPane().add(WheatInput);
		
		JLabel lblWeedKillerInfo = new JLabel("Weed Killer");
		lblWeedKillerInfo.setForeground(Color.CYAN);
		lblWeedKillerInfo.setToolTipText(String.format("Price: $%s, Use: Can be used to increase your crop limit by 8", Shop.getWeedKiller().getPrice()));
		lblWeedKillerInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/WeedKillerResized.png")));
		lblWeedKillerInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWeedKillerInfo.setBounds(458, 248, 360, 30);
		frmShopScreen.getContentPane().add(lblWeedKillerInfo);
		
		JTextPane WeedKillerInput = new JTextPane();
		WeedKillerInput.setText("0");
		WeedKillerInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		WeedKillerInput.setBounds(838, 248, 35, 30);
		frmShopScreen.getContentPane().add(WeedKillerInput);
		
		JLabel lblSheepInfo = new JLabel("Sheep");
		lblSheepInfo.setForeground(Color.CYAN);
		lblSheepInfo.setToolTipText(String.format("Price: $%s, Daily earning: $%s, Starting happiness: %s", Shop.getSheep().getPurchasePrice(), Shop.getSheep().getDailyEarning(), Shop.getSheep().getHappiness()));
		lblSheepInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/SheepResized.png")));
		lblSheepInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSheepInfo.setBounds(900, 248, 360, 30);
		frmShopScreen.getContentPane().add(lblSheepInfo);
		
		JTextPane SheepInput = new JTextPane();
		SheepInput.setText("0");
		SheepInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SheepInput.setBounds(1289, 248, 35, 30);
		frmShopScreen.getContentPane().add(SheepInput);
		
		JLabel lblCornInfo = new JLabel("Corn");
		lblCornInfo.setForeground(Color.CYAN);
		lblCornInfo.setToolTipText(String.format("Price: $%s, Harvest earning: $%s, Days till fully grown: %s", Shop.getCorn().getPurchasePrice(), Shop.getCorn().getSellPrice() + GameEnviroment.getFarm().getCropValueBonus(), Shop.getCorn().getDaysToHarvest()));
		lblCornInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/CornResized.png")));
		lblCornInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCornInfo.setBounds(10, 283, 371, 30);
		frmShopScreen.getContentPane().add(lblCornInfo);
		
		JLabel lblSugarcaneInfo = new JLabel("Sugarcane");
		lblSugarcaneInfo.setForeground(Color.CYAN);
		lblSugarcaneInfo.setToolTipText(String.format("Price: $%s, Harvest earning: $%s, Days till fully grown: %s", Shop.getSugarcane().getPurchasePrice(), Shop.getSugarcane().getSellPrice() + GameEnviroment.getFarm().getCropValueBonus(), Shop.getSugarcane().getDaysToHarvest()));
		lblSugarcaneInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/SugarcaneResized.png")));
		lblSugarcaneInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSugarcaneInfo.setBounds(10, 318, 371, 30);
		frmShopScreen.getContentPane().add(lblSugarcaneInfo);
		
		JLabel lblBerryInfo = new JLabel("Berry");
		lblBerryInfo.setForeground(Color.CYAN);
		lblBerryInfo.setToolTipText(String.format("Price: $%s, Harvest earning: $%s, Days till fully grown: %s", Shop.getBerry().getPurchasePrice(), Shop.getBerry().getSellPrice() + GameEnviroment.getFarm().getCropValueBonus(), Shop.getBerry().getDaysToHarvest()));
		lblBerryInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/BerryResized.png")));
		lblBerryInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBerryInfo.setBounds(10, 353, 371, 30);
		frmShopScreen.getContentPane().add(lblBerryInfo);

		
		JTextPane BerryInput = new JTextPane();
		BerryInput.setText("0");
		BerryInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BerryInput.setBounds(391, 353, 35, 30);
		frmShopScreen.getContentPane().add(BerryInput);
		
		JTextPane SugarcaneInput = new JTextPane();
		SugarcaneInput.setText("0");
		SugarcaneInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SugarcaneInput.setBounds(391, 318, 35, 30);
		frmShopScreen.getContentPane().add(SugarcaneInput);
		
		JTextPane CornInput = new JTextPane();
		CornInput.setText("0");
		CornInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CornInput.setBounds(391, 283, 35, 30);
		frmShopScreen.getContentPane().add(CornInput);
		
		JLabel lblAnimalTreatsInfo = new JLabel("Animal Treats");
		lblAnimalTreatsInfo.setForeground(Color.CYAN);
		lblAnimalTreatsInfo.setToolTipText(String.format("Price: $%s, Use: Can be used to feed your animals, increasing their health and happiness", Shop.getAnimalTreats().getPrice()));
		lblAnimalTreatsInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/AnimalTreatsResized.png")));
		lblAnimalTreatsInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnimalTreatsInfo.setBounds(458, 283, 360, 30);
		frmShopScreen.getContentPane().add(lblAnimalTreatsInfo);
		
		JLabel lblTimeMachineInfo = new JLabel("Time Machine");
		lblTimeMachineInfo.setToolTipText(String.format("Price: $%s, Use: Can be used to travel back in time by 2 days", Shop.getTimeMachine().getPrice()));
		lblTimeMachineInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/TimeMachineResized.png")));
		lblTimeMachineInfo.setForeground(Color.CYAN);
		lblTimeMachineInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTimeMachineInfo.setBounds(458, 318, 360, 30);
		frmShopScreen.getContentPane().add(lblTimeMachineInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getTimeMachine()) || GameEnviroment.isTimeMachineUsed()) {
			lblTimeMachineInfo.setEnabled(false);
		}
		
		JTextPane AnimalTreatsInput = new JTextPane();
		AnimalTreatsInput.setText("0");
		AnimalTreatsInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		AnimalTreatsInput.setBounds(838, 283, 35, 30);
		frmShopScreen.getContentPane().add(AnimalTreatsInput);
		
		JLabel lblHorseInfo = new JLabel("Horse");
		lblHorseInfo.setForeground(Color.CYAN);
		lblHorseInfo.setToolTipText(String.format("Price: $%s, Daily earning: $%s, Starting happiness: %s", Shop.getHorse().getPurchasePrice(), Shop.getHorse().getDailyEarning(), Shop.getHorse().getHappiness()));
		lblHorseInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/HorseResized.png")));
		lblHorseInfo.setEnabled(false);
		lblHorseInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHorseInfo.setBounds(900, 318, 360, 30);
		frmShopScreen.getContentPane().add(lblHorseInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getStables())) {
			lblHorseInfo.setEnabled(true);
		}
		
		JLabel lblCowInfo = new JLabel("Cow");
		lblCowInfo.setForeground(Color.CYAN);
		lblCowInfo.setToolTipText(String.format("Price: $%s, Daily earning: $%s, Starting happiness: %s", Shop.getCow().getPurchasePrice(), Shop.getCow().getDailyEarning(), Shop.getCow().getHappiness()));
		lblCowInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/CowResized.png")));
		lblCowInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCowInfo.setBounds(900, 283, 360, 30);
		frmShopScreen.getContentPane().add(lblCowInfo);
		
		JTextPane CowInput = new JTextPane();
		CowInput.setText("0");
		CowInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CowInput.setBounds(1289, 283, 35, 30);
		frmShopScreen.getContentPane().add(CowInput);
		
		JTextPane HorseInput = new JTextPane();
		HorseInput.setText("0");
		HorseInput.setEnabled(false);
		HorseInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HorseInput.setBounds(1289, 318, 35, 30);
		frmShopScreen.getContentPane().add(HorseInput);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getStables())) {
			HorseInput.setEnabled(true);
		}
		
		JLabel lblWaterSprinklersInfo = new JLabel("Water Sprinklers");
		lblWaterSprinklersInfo.setToolTipText(String.format("Price: $%s, Use: Can be used to tend to all types of crops at once", Shop.getWaterSprinklers().getPrice()));
		lblWaterSprinklersInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/WaterSprinklersResized.png")));
		lblWaterSprinklersInfo.setForeground(Color.CYAN);
		lblWaterSprinklersInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWaterSprinklersInfo.setBounds(458, 353, 360, 30);
		frmShopScreen.getContentPane().add(lblWaterSprinklersInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getWaterSprinklers())) {
			lblWaterSprinklersInfo.setEnabled(false);
		}
		
		JLabel lblScarecrowInfo = new JLabel("Scarecrow");
		lblScarecrowInfo.setToolTipText(String.format("Price: $%s, Use: Prevents birds from damaging your crops, increasing harvest value by 100%%", Shop.getScarecrow().getPrice()));
		lblScarecrowInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/ScarecrowResized.png")));
		lblScarecrowInfo.setForeground(Color.CYAN);
		lblScarecrowInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblScarecrowInfo.setBounds(458, 388, 360, 30);
		frmShopScreen.getContentPane().add(lblScarecrowInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getScarecrow())) {
			lblScarecrowInfo.setEnabled(false);
		}
		
		JLabel lblStablesInfo = new JLabel("Stables");
		lblStablesInfo.setToolTipText(String.format("Price: $%s, Use: Unlocks the ability to buy and look after horses", Shop.getStables().getPrice()));
		lblStablesInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/StablesResized.png")));
		lblStablesInfo.setForeground(Color.CYAN);
		lblStablesInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStablesInfo.setBounds(458, 423, 360, 30);
		frmShopScreen.getContentPane().add(lblStablesInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getStables())) {
			lblStablesInfo.setEnabled(false);
		}
		
		JLabel lblAnimalFeederInfo = new JLabel("Animal Feeder");
		lblAnimalFeederInfo.setToolTipText(String.format("Price: $%s, Use: Automatically feeds animals each day, reducing their health loss per day by 1", Shop.getAnimalFeeder().getPrice()));
		lblAnimalFeederInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/AnimalFeederResized.png")));
		lblAnimalFeederInfo.setForeground(Color.CYAN);
		lblAnimalFeederInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnimalFeederInfo.setBounds(458, 458, 360, 30);
		frmShopScreen.getContentPane().add(lblAnimalFeederInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getAnimalFeeder())) {
			lblAnimalFeederInfo.setEnabled(false);
		}
		
		JLabel lblAnimalToysInfo = new JLabel("Animal Toys");
		lblAnimalToysInfo.setToolTipText(String.format("Price: $%s, Use: Increases the happiness gained by animals when played with to 4", Shop.getAnimalToys().getPrice()));
		lblAnimalToysInfo.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/AnimalToysResized.png")));
		lblAnimalToysInfo.setForeground(Color.CYAN);
		lblAnimalToysInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnimalToysInfo.setBounds(458, 493, 360, 30);
		frmShopScreen.getContentPane().add(lblAnimalToysInfo);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getAnimalToys())) {
			lblAnimalToysInfo.setEnabled(false);
		}
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getScarecrow())) {
			rdbtnScarecrow.setEnabled(false);
		}
		
		JLabel lblNewLabel = new JLabel("Crops:");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 144, 100, 23);
		frmShopScreen.getContentPane().add(lblNewLabel);
		
		JLabel lblAnimals = new JLabel("Items:");
		lblAnimals.setForeground(Color.CYAN);
		lblAnimals.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAnimals.setBounds(458, 144, 100, 23);
		frmShopScreen.getContentPane().add(lblAnimals);
		
		JLabel label_14 = new JLabel("Animals:");
		label_14.setForeground(Color.CYAN);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_14.setBounds(900, 144, 100, 23);
		frmShopScreen.getContentPane().add(label_14);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 171, 1334, 2);
		frmShopScreen.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(443, 144, 2, 392);
		frmShopScreen.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(888, 144, 2, 392);
		frmShopScreen.getContentPane().add(separator_2);
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getWaterSprinklers())) {
			rdbtnWaterSprinklers.setEnabled(false);
		}
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getStables())) {
			rdbtnStables.setEnabled(false);
		}
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getAnimalFeeder())) {
			rdbtnAnimalFeeder.setEnabled(false);
		}
		
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getAnimalToys())) {
			rdbtnAnimalToys.setEnabled(false);
		}
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int potatoInt = 0;
				int riceInt = 0;
				int wheatInt = 0;
				int cornInt = 0;
				int sugarcaneInt = 0;
				int berryInt = 0;
				
				int energyBarInt = 0;
				int fertiliserInt = 0;
				int weedKillerInt = 0;
				int animalTreatsInt = 0;
				
				int chickenInt = 0;
				int pigInt = 0;
				int sheepInt = 0;
				int cowInt = 0;
				int horseInt = 0;
				
				int timeMachineInt = 0;
				int waterSprinklersInt = 0;
				int scarecrowInt = 0;
				int stablesInt = 0;
				int animalFeederInt = 0;
				int animalToysInt = 0;
				
				String potatoInputString = PotatoInput.getText();
				String riceInputString = (RiceInput.getText());
				String wheatInputString = (WheatInput.getText());
				String cornInputString = (CornInput.getText());
				String sugarcaneInputString = (SugarcaneInput.getText());
				String berryInputString = (BerryInput.getText());
				
				String energyBarInputString = EnergyBarInput.getText();
				String fertiliserInputString = FertiliserInput.getText();
				String weedKillerInputString = WeedKillerInput.getText();
				String animalTreatsInputString = AnimalTreatsInput.getText();

				
				String chickenInputString= ChickenInput.getText();
				String pigInputString= PigInput.getText();
				String sheepInputString= SheepInput.getText();
				String cowInputString= CowInput.getText();
				String horseInputString= HorseInput.getText();
				
				
				boolean possiblePurchase = true;
				String errorMessage = "";
				
				
				if (isInt(potatoInputString)) {
					potatoInt = Integer.parseInt(potatoInputString);

					if (potatoInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for potato amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for potato amount\n";	
				}
				
				if (isInt(riceInputString)) {
					riceInt = Integer.parseInt(riceInputString);
					if (riceInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for rice amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for rice amount\n";	
				}
				
				if (isInt(wheatInputString)) {
					wheatInt = Integer.parseInt(wheatInputString);
					if (wheatInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for wheat amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for wheat amount\n";	
				}
				
				if (isInt(cornInputString)) {
					cornInt = Integer.parseInt(cornInputString);
					if (cornInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for corn amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for corn amount\n";	
				}
				
				if (isInt(sugarcaneInputString)) {
					sugarcaneInt = Integer.parseInt(sugarcaneInputString);
					if (sugarcaneInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for sugarcane amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for sugarcane amount\n";	
				}
				
				if (isInt(berryInputString)) {
					berryInt = Integer.parseInt(berryInputString);
					if (berryInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for berry amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for berry amount\n";	
				}
				
				if (isInt(energyBarInputString)) {
					energyBarInt = Integer.parseInt(energyBarInputString);
					if (energyBarInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for energyBar amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for energyBar amount\n";	
				}
				
				if (isInt(fertiliserInputString)) {
					fertiliserInt = Integer.parseInt(fertiliserInputString);
					if (fertiliserInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for fertiliser amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for fertiliser amount\n";	
				}
				
				if (isInt(weedKillerInputString)) {
					weedKillerInt = Integer.parseInt(weedKillerInputString);
					if (weedKillerInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for weed killer amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for weed killer amount\n";	
				}
				
				if (isInt(animalTreatsInputString)) {
					animalTreatsInt = Integer.parseInt(animalTreatsInputString);
					if (animalTreatsInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for animal treats amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for animal treats amount\n";	
				}
				
				if (isInt(chickenInputString)) {
					chickenInt = Integer.parseInt(chickenInputString);
					if (chickenInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for chicken amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for chicken amount\n";	
				}
				
				if (isInt(pigInputString)) {
					pigInt = Integer.parseInt(pigInputString);
					if (pigInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for pig amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for pig amount\n";	
				}
				
				if (isInt(sheepInputString)) {
					sheepInt = Integer.parseInt(sheepInputString);
					if (sheepInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for sheep amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for sheep amount\n";	
				}
				
				if (isInt(cowInputString)) {
					cowInt = Integer.parseInt(cowInputString);
					if (cowInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for cow amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for cow amount\n";	
				}
				
				if (isInt(horseInputString)) {
					horseInt = Integer.parseInt(horseInputString);
					if (horseInt < 0) {
						possiblePurchase = false;
						errorMessage += "You have not input a positive integer for horse amount\n";	
					}
				} else {
					possiblePurchase = false;
					errorMessage += "You have not input an integer for horse amount\n";	
				}
				
				if (rdbtnTimeMachine.isSelected()) {
					timeMachineInt = 1;
				} 
				
				
				if (rdbtnWaterSprinklers.isSelected()) {
					waterSprinklersInt = 1;
				}
				
				if (rdbtnScarecrow.isSelected()) {
					scarecrowInt = 1;
				}
				
				if (rdbtnStables.isSelected()) {
					stablesInt = 1;
				}
				
				if (rdbtnAnimalFeeder.isSelected()) {
					animalFeederInt = 1;
				}
				
				if (rdbtnAnimalToys.isSelected()) {
					animalToysInt = 1;
				}
				

				
				if (possiblePurchase) {
					
					int totalCropPurchase = potatoInt + riceInt + wheatInt + cornInt + sugarcaneInt + berryInt;
					
					if (totalCropPurchase + FarmStock.getCropList().size() <= GameEnviroment.getFarm().getCropLimit()) {
					
						int totalCost = 0;
						
						totalCost += potatoInt * Shop.getPotato().getPurchasePrice();
						totalCost += riceInt * Shop.getRice().getPurchasePrice();
						totalCost += wheatInt * Shop.getWheat().getPurchasePrice();
						totalCost += cornInt * Shop.getCorn().getPurchasePrice();
						totalCost += sugarcaneInt * Shop.getSugarcane().getPurchasePrice();
						totalCost += berryInt * Shop.getBerry().getPurchasePrice();
						
						totalCost += energyBarInt * Shop.getEnergyBar().getPrice();
						totalCost += fertiliserInt * Shop.getFertiliser().getPrice();
						totalCost += weedKillerInt * Shop.getWeedKiller().getPrice();
						totalCost += animalTreatsInt * Shop.getAnimalTreats().getPrice();
						
						totalCost += timeMachineInt * Shop.getTimeMachine().getPrice();
						totalCost += waterSprinklersInt * Shop.getWaterSprinklers().getPrice();
						totalCost += scarecrowInt * Shop.getScarecrow().getPrice();
						totalCost += stablesInt * Shop.getStables().getPrice();
						totalCost += animalFeederInt * Shop.getAnimalFeeder().getPrice();
						totalCost += animalToysInt * Shop.getAnimalToys().getPrice();
						
						totalCost += chickenInt * Shop.getChicken().getPurchasePrice();
						totalCost += pigInt * Shop.getPig().getPurchasePrice();
						totalCost += sheepInt * Shop.getSheep().getPurchasePrice();
						totalCost += cowInt * Shop.getCow().getPurchasePrice();
						totalCost += horseInt * Shop.getHorse().getPurchasePrice();
						
						if (totalCost == 0) {
							ShopKeeperSpeech.setText("Shop Keeper: You have chosen no items to buy, please try again.");
						} else if (GameEnviroment.getFarm().getMoney() >= totalCost) {
								
							String shopKeeperOutput = "";
							
							GameEnviroment.getFarm().setMoney(GameEnviroment.getFarm().getMoney() - totalCost);
							moneyLabel.setText(String.format("Money: $%s", GameEnviroment.getFarm().getMoney()));
							
							if (potatoInt > 0) {
								
								PotatoInput.setText("0");
								
								shopKeeperOutput += String.format("%s potatoes.\n", potatoInt);
								for (int i = 0; i < potatoInt; i++) {
									FarmStock.getCropList().add(Shop.getPotato());
								}
							}
							
							
							if (riceInt > 0) {
								
								RiceInput.setText("0");
								
								shopKeeperOutput += String.format("%s rice.\n", riceInt);
								for (int i = 0; i < riceInt; i++) {
									FarmStock.getCropList().add(Shop.getRice());
								}
							}
							
							if (wheatInt > 0) {
								
								WheatInput.setText("0");
								
								shopKeeperOutput += String.format("%s wheat.\n", wheatInt);
								for (int i = 0; i < wheatInt; i++) {
									FarmStock.getCropList().add(Shop.getWheat());
								}
							}	
							
							
							if (cornInt > 0) {
								
								CornInput.setText("0");
								
								shopKeeperOutput += String.format("%s corn.\n", cornInt);
								for (int i = 0; i < cornInt; i++) {
									FarmStock.getCropList().add(Shop.getCorn());
								}
							}
							
							if (sugarcaneInt > 0) {
								
								SugarcaneInput.setText("0");
								
								shopKeeperOutput += String.format("%s sugarcane.\n", sugarcaneInt);
								for (int i = 0; i < sugarcaneInt; i++) {
									FarmStock.getCropList().add(Shop.getSugarcane());
								}
							}
							
							if (berryInt > 0) {
								
								BerryInput.setText("0");
								
								shopKeeperOutput += String.format("%s berrys.\n", berryInt);
								for (int i = 0; i < berryInt; i++) {
									FarmStock.getCropList().add(Shop.getBerry());
								}
							}
							
							
							if (energyBarInt > 0) {
								
								EnergyBarInput.setText("0");
								
								shopKeeperOutput += String.format("%s energy bars.\n", energyBarInt);
								for (int i = 0; i < energyBarInt; i++) {
									FarmStock.getItemsList().add(Shop.getEnergyBar());
								}
							}
							
							if (fertiliserInt > 0) {
								
								FertiliserInput.setText("0");
								
								shopKeeperOutput += String.format("%s fertiliser.\n", fertiliserInt);
								for (int i = 0; i < fertiliserInt; i++) {
									FarmStock.getItemsList().add(Shop.getFertiliser());
								}
							}
							
							if (weedKillerInt > 0) {
								
								WeedKillerInput.setText("0");
								
								shopKeeperOutput += String.format("%s weed killer.\n", weedKillerInt);
								for (int i = 0; i < weedKillerInt; i++) {
									FarmStock.getItemsList().add(Shop.getWeedKiller());
								}
							}
							
							if (animalTreatsInt > 0) {
								
								AnimalTreatsInput.setText("0");
								
								shopKeeperOutput += String.format("%s animal treats.\n", animalTreatsInt);
								for (int i = 0; i < animalTreatsInt; i++) {
									FarmStock.getItemsList().add(Shop.getAnimalTreats());
								}
							}
							
							
							if (timeMachineInt > 0) {
								
								rdbtnTimeMachine.setEnabled(false);
								lblTimeMachineInfo.setEnabled(false);
								rdbtnTimeMachine.setSelected(false);
								
								shopKeeperOutput += "A time machine.\n";
								for (int i = 0; i < timeMachineInt; i++) {
									FarmStock.getSinglePurchaseItemsList().add(Shop.getTimeMachine());
								}
								
							}
							
							if (waterSprinklersInt > 0) {
								
								rdbtnWaterSprinklers.setEnabled(false);
								lblWaterSprinklersInfo.setEnabled(false);
								rdbtnWaterSprinklers.setSelected(false);
								
								shopKeeperOutput += "A water sprinkler.\n";
								for (int i = 0; i < waterSprinklersInt; i++) {
									FarmStock.getSinglePurchaseItemsList().add(Shop.getWaterSprinklers());
								}
							}
							
							if (scarecrowInt > 0) {
								
								rdbtnScarecrow.setEnabled(false);
								lblScarecrowInfo.setEnabled(false);
								rdbtnScarecrow.setSelected(false);
								
								shopKeeperOutput += "A scarecrow.\n";
								for (int i = 0; i < scarecrowInt; i++) {
									FarmStock.getSinglePurchaseItemsList().add(Shop.getScarecrow());
								}
								
							}
							
							if (stablesInt > 0) {
								
								rdbtnStables.setEnabled(false);
								lblStablesInfo.setEnabled(false);
								rdbtnStables.setSelected(false);
								
								HorseInput.setEnabled(true);
								lblHorseInfo.setEnabled(true);
								
								shopKeeperOutput += "Stables.\n";
								for (int i = 0; i < stablesInt; i++) {
									FarmStock.getSinglePurchaseItemsList().add(Shop.getStables());
								}
							}
							
							if (animalFeederInt > 0) {
								
								rdbtnAnimalFeeder.setEnabled(false);
								lblAnimalFeederInfo.setEnabled(false);
								rdbtnAnimalFeeder.setSelected(false);
								
								shopKeeperOutput += "Animal feeders.\n";
								for (int i = 0; i < animalFeederInt; i++) {
									FarmStock.getSinglePurchaseItemsList().add(Shop.getAnimalFeeder());
								}
							}
							
							if (animalToysInt > 0) {
								
								rdbtnAnimalToys.setEnabled(false);
								lblAnimalToysInfo.setEnabled(false);
								rdbtnAnimalToys.setSelected(false);
								
								shopKeeperOutput += "Animal toys.\n";
								for (int i = 0; i < animalToysInt; i++) {
									FarmStock.getSinglePurchaseItemsList().add(Shop.getAnimalToys());
								}
							}
							
							if (chickenInt > 0) {
								
								ChickenInput.setText("0");
								
								shopKeeperOutput += String.format("%s chickens.\n", chickenInt);
								for (int i = 0; i < chickenInt; i++) {
									FarmStock.getAnimalList().add(Shop.getChicken());
								}
							}
							
							if (pigInt > 0) {
								
								PigInput.setText("0");
								
								shopKeeperOutput += String.format("%s pigs.\n", pigInt);
								for (int i = 0; i < pigInt; i++) {
									FarmStock.getAnimalList().add(Shop.getPig());
								}
							}
							
							if (sheepInt > 0) {
								
								SheepInput.setText("0");
								
								shopKeeperOutput += String.format("%s sheep.\n", sheepInt);
								for (int i = 0; i < sheepInt; i++) {
									FarmStock.getAnimalList().add(Shop.getSheep());
								}
							}
							
							if (cowInt > 0) {
								
								CowInput.setText("0");
								
								shopKeeperOutput += String.format("%s cows.\n", cowInt);
								for (int i = 0; i < cowInt; i++) {
									FarmStock.getAnimalList().add(Shop.getCow());
								}
							}
							
							if (horseInt > 0) {
								
								HorseInput.setText("0");
								
								shopKeeperOutput += String.format("%s horses.\n", horseInt);
								for (int i = 0; i < horseInt; i++) {
									FarmStock.getAnimalList().add(Shop.getHorse());
								}
							}
							
							
							SoundPlayer.playMusic("Paying.wav");
							ShopKeeperSpeech.setText("Shop Keeper: You have successfully bought:\n" + shopKeeperOutput);
							
						
						} else {
							ShopKeeperSpeech.setText(String.format("Shop Keeper: Sorry but you do not have enough money.\nYour total cost is $%s and you only have $%s.", totalCost, GameEnviroment.getFarm().getMoney()));
						}
					
					} else {
						ShopKeeperSpeech.setText(String.format("Shop Keeper: Sorry but you do not have enough crop space.\nYour crop limit is %s so only have space for %s more crops.", GameEnviroment.getFarm().getCropLimit(), GameEnviroment.getFarm().getCropLimit() - FarmStock.getCropList().size()));
					}
					
				} else {
					ShopKeeperSpeech.setText("Shop Keeper: Sorry but there are some errors with your purchase:\n" + errorMessage);
				}
				
				
				

				
			}
		});
		btnPurchase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPurchase.setBounds(1042, 558, 184, 49);
		frmShopScreen.getContentPane().add(btnPurchase);
		
		JLabel lblCountyStore = new JLabel("");
		lblCountyStore.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/Cool Text - County Store -357174430146396.png")));
		lblCountyStore.setBounds(10, 9, 441, 158);
		frmShopScreen.getContentPane().add(lblCountyStore);
		
		JLabel lblShopKeeperPicture = new JLabel("");
		lblShopKeeperPicture.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/BobResized.png")));
		lblShopKeeperPicture.setBounds(0, 429, 126, 321);
		frmShopScreen.getContentPane().add(lblShopKeeperPicture);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ShopScreen.class.getResource("/images/StoreBackgroundResized.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1334, 750);
		frmShopScreen.getContentPane().add(lblNewLabel_1);
	}
}
