package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Color;
/**
 * This class is the main screen of the game.
 * It displays the buttons with the farmer's
 * possible actions and the information
 * of day number, actions left, money and score.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class MainScreen {

	/**
	 * The frame of the main screen
	 */
	private JFrame mainScreen;
	/**
	 * The manager of opening and closing screens
	 */
	private GameEnviroment manager;
	
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of windows
	 */
	public MainScreen(GameEnviroment incomingManager) {
		
		manager = incomingManager;
		initialize();
		mainScreen.setVisible(true);
	}
	
	/**
	 * Closes the main screen window.
	 */
	public void closeWindow() {
		
		mainScreen.dispose();
		
	}
	
	/**
	 * Closes the main screen window using the manager.
	 */
	public void finishedWindow() {
		
		manager.closeMainScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainScreen = new JFrame();
		mainScreen.getContentPane().setBackground(new Color(245, 222, 179));
		mainScreen.setTitle("Farm Menu");
		mainScreen.setBounds(100, 100, 1350, 790);
		mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainScreen.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(String.format("%s", GameEnviroment.getFarm().getFarmName()));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(500, 20, 258, 14);
		mainScreen.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(108, 551, 2, 15);
		mainScreen.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(108, 552, 55, 2);
		mainScreen.getContentPane().add(separator_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(108, 565, 40, 2);
		mainScreen.getContentPane().add(separator);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(108, 552, 40, 15);
		mainScreen.getContentPane().add(textPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(147, 551, 745, 200);
		mainScreen.getContentPane().add(scrollPane);
		
		JTextArea txtMainScreen = new JTextArea();
		scrollPane.setViewportView(txtMainScreen);
		
		if (GameEnviroment.getDayNumber() == 1) {
			txtMainScreen.setText("Shop Keeper: Welcome to your farm. I am Bob the local county store shop\n"
								+ "keeper. Your balance and number of actions left for the day can be seen\n"
								+ "in the top right corner. Viewing your crop and animal status, as well as\n"
								+ "visiting the store does not consume an action. Feel free to try the\n"
								+ "buttons an action will not be taken away unless you complete the action.\n"
								+ "Your actions refresh at the start of each day. Good luck and get farming!\n"
								+ "Hover your cursor over a button to see what it does. This helpful\n"
								+ "explanation of mine is only availabe on day 1.");
		} else {
			txtMainScreen.setText("Shop Keeper: Welcome back to the farm. What would you like to do next?\n");
		}
		
		txtMainScreen.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtMainScreen.setEditable(false);
		
		JButton btnViewStoreWindow = new JButton("View Store Window");
		btnViewStoreWindow.setToolTipText("Takes you to the store window");
		btnViewStoreWindow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewStoreWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finishedWindow();
				
				manager.launchShopScreen();
				
			}
		});
		
		JButton btnViewStatusWindow = new JButton("View Status Window");
		btnViewStatusWindow.setToolTipText("Takes you to the window for viewing your crops and animals");
		btnViewStatusWindow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewStatusWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finishedWindow();
				
				manager.launchViewStatusScreen();
			}
		
		
			
			
		});
		
				
		JButton btnTendToCrops = new JButton("Tend To Crops");
		btnTendToCrops.setToolTipText("Takes you to the window for tending to crops");
		btnTendToCrops.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (FarmStock.getCropList().size() == 0) {
					
					txtMainScreen.setText("Shop Keeper: Sorry but you have no crops to tend to.\nVisit the store to buy some.");
				} else {
					
					finishedWindow();
					
					manager.launchTendToCropsScreen();
					
				}
			}
		});
		if (GameEnviroment.getActionsLeft() <= 0) {
			btnTendToCrops.setEnabled(false);
		}
		

		
		
		
		JLabel lblActionsLeft = new JLabel(String.format("Actions Left: %s", GameEnviroment.getActionsLeft()));
		lblActionsLeft.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblActionsLeft.setBounds(1180, 133, 138, 28);
		mainScreen.getContentPane().add(lblActionsLeft);
		

		
		JLabel lblScore = new JLabel(String.format("Score: %s", GameEnviroment.getScore()));
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblScore.setBounds(1180, 72, 138, 28);
		mainScreen.getContentPane().add(lblScore);
		
		JLabel lblDayNumber = new JLabel(String.format("Day %s", GameEnviroment.getDayNumber()));
		lblDayNumber.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblDayNumber.setBounds(1184, 20, 120, 41);
		mainScreen.getContentPane().add(lblDayNumber);
		
		JLabel lblMoney = new JLabel(String.format("Money: $%s", GameEnviroment.getFarm().getMoney()));
		lblMoney.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMoney.setBounds(1180, 94, 168, 49);
		mainScreen.getContentPane().add(lblMoney);
		
		JButton btnUseItem = new JButton("Use An Item");
		btnUseItem.setToolTipText("Takes you to the use item window");
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (FarmStock.getItemsList().size() == 0 && !FarmStock.getSinglePurchaseItemsList().contains(Shop.getTimeMachine())) {
					txtMainScreen.setText("Shop Keeper: Sorry but you have no item to use.\nVisit the store to buy some.");
				} else {
				
					finishedWindow();
					manager.launchUseItemScreen();
				}
			}
		});
		btnUseItem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseItem.setBounds(414, 88, 149, 39);
		mainScreen.getContentPane().add(btnUseItem);
		btnUseItem.setOpaque(false);
		btnUseItem.setContentAreaFilled(false);
		btnUseItem.setBorderPainted(false);
		if (GameEnviroment.getActionsLeft() <= 0) {
			btnUseItem.setEnabled(false);
		}
		
		JLabel lblUseItemBubble = new JLabel("");
		lblUseItemBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblUseItemBubble.setBounds(414, 82, 159, 64);
		mainScreen.getContentPane().add(lblUseItemBubble);
		
		JButton btnTendToFarmLand = new JButton("Tend To Farm Land");
		btnTendToFarmLand.setToolTipText("Uses an action to increase crop limit by 3 and reduced animal happiness loss overnight by 1");
		btnTendToFarmLand.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendToFarmLand.setBounds(600, 111, 152, 41);
		mainScreen.getContentPane().add(btnTendToFarmLand);
		btnTendToFarmLand.setOpaque(false);
		btnTendToFarmLand.setContentAreaFilled(false);
		btnTendToFarmLand.setBorderPainted(false);
		if (GameEnviroment.getActionsLeft() <= 0) {
			btnTendToFarmLand.setEnabled(false);
		}

		JLabel lblTendLandBubble = new JLabel("");
		lblTendLandBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblTendLandBubble.setBounds(600, 106, 159, 64);
		mainScreen.getContentPane().add(lblTendLandBubble);


		JButton btnFeedAnimals = new JButton("Feed Animals");
		btnFeedAnimals.setToolTipText("Uses an action to feed all animals increasing their health by 3");
		btnFeedAnimals.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFeedAnimals.setBounds(359, 424, 152, 39);
		mainScreen.getContentPane().add(btnFeedAnimals);
		btnFeedAnimals.setOpaque(false);
		btnFeedAnimals.setContentAreaFilled(false);
		btnFeedAnimals.setBorderPainted(false);
		if (GameEnviroment.getActionsLeft() <= 0) {
			btnFeedAnimals.setEnabled(false);
		}

		JLabel lblFeedBubble = new JLabel("");
		lblFeedBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblFeedBubble.setBounds(359, 418, 159, 64);
		mainScreen.getContentPane().add(lblFeedBubble);
		btnTendToCrops.setBounds(814, 434, 152, 39);
		mainScreen.getContentPane().add(btnTendToCrops);
		btnTendToCrops.setOpaque(false);
		btnTendToCrops.setContentAreaFilled(false);
		btnTendToCrops.setBorderPainted(false);
		
		JLabel lblTendCropsBubble = new JLabel("");
		lblTendCropsBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblTendCropsBubble.setBounds(814, 428, 159, 64);
		mainScreen.getContentPane().add(lblTendCropsBubble);
		
		JButton btnHarvestCrops = new JButton("Harvest Crops");
		btnHarvestCrops.setToolTipText("Uses an action to harvest crops that are ready, if scarecrow is owned crops earn more money");
		btnHarvestCrops.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHarvestCrops.setBounds(840, 336, 159, 41);
		mainScreen.getContentPane().add(btnHarvestCrops);
		btnHarvestCrops.setOpaque(false);
		btnHarvestCrops.setContentAreaFilled(false);
		btnHarvestCrops.setBorderPainted(false);
		if (GameEnviroment.getActionsLeft() <= 0) {
			btnHarvestCrops.setEnabled(false);
		}
		
		JLabel lblHarvestBubble = new JLabel("");
		lblHarvestBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblHarvestBubble.setBounds(847, 330, 159, 64);
		mainScreen.getContentPane().add(lblHarvestBubble);
		btnViewStatusWindow.setOpaque(false);
		btnViewStatusWindow.setContentAreaFilled(false);
		btnViewStatusWindow.setBorderPainted(false);
		
		btnViewStatusWindow.setBounds(548, 344, 165, 49);
		mainScreen.getContentPane().add(btnViewStatusWindow);
		
		JLabel lblStatusBubble = new JLabel("");
		lblStatusBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblStatusBubble.setBounds(554, 344, 159, 64);
		mainScreen.getContentPane().add(lblStatusBubble);
		btnViewStoreWindow.setBounds(552, 490, 159, 46);
		mainScreen.getContentPane().add(btnViewStoreWindow);
		btnViewStoreWindow.setOpaque(false);
		btnViewStoreWindow.setContentAreaFilled(false);
		btnViewStoreWindow.setBorderPainted(false);
		
		JLabel lblStoreBubble = new JLabel("");
		lblStoreBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblStoreBubble.setBounds(554, 488, 159, 64);
		mainScreen.getContentPane().add(lblStoreBubble);
		
		JButton btnPlayWithAnimals = new JButton("Play With Animals");
		btnPlayWithAnimals.setToolTipText("Uses an action to increase all animals happiness by 2. Increase by 4 if animal toys are owned.");
		btnPlayWithAnimals.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlayWithAnimals.setBounds(270, 296, 147, 41);
		mainScreen.getContentPane().add(btnPlayWithAnimals);
		btnPlayWithAnimals.setOpaque(false);
		btnPlayWithAnimals.setContentAreaFilled(false);
		btnPlayWithAnimals.setBorderPainted(false);
		if (GameEnviroment.getActionsLeft() <= 0) {
			btnPlayWithAnimals.setEnabled(false);
		}
		
		JLabel lblPlayBubble = new JLabel("");
		lblPlayBubble.setIcon(new ImageIcon(MainScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblPlayBubble.setBounds(268, 291, 159, 64);
		mainScreen.getContentPane().add(lblPlayBubble);

		
		JTextPane listBackground = new JTextPane();
		listBackground.setEditable(false);
		listBackground.setBounds(1177, 11, 147, 159);
		mainScreen.getContentPane().add(listBackground);
		listBackground.setBackground(new Color(1f, 1f, 1f, 0.8f));
		
		
		JButton btnGoNextDay = new JButton("Go Next Day");
		btnGoNextDay.setFont(new Font("Tahoma", Font.BOLD, 24));
		if (GameEnviroment.getDaysToPlay() == 1) {
			btnGoNextDay.setText("End Game");
		}
		btnGoNextDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.setDaysToPlay(GameEnviroment.getDaysToPlay() - 1);
				GameEnviroment.setDayNumber(GameEnviroment.getDayNumber() + 1);
				
				if (GameEnviroment.getDaysToPlay() > 0) {
					

					
					String txtOutput = GameEnviroment.randomEventsRunner();
					
					FarmStock.dailyAnimalRunner();
					FarmStock.dailyCropRunner();
					

					SoundPlayer.playMusic("Rooster.wav");
					GameEnviroment.setActionsLeft(2);
					btnTendToCrops.setEnabled(true);
					btnUseItem.setEnabled(true);
					btnTendToFarmLand.setEnabled(true);
					btnFeedAnimals.setEnabled(true);
					btnHarvestCrops.setEnabled(true);
					btnPlayWithAnimals.setEnabled(true);
					
					
					lblScore.setText(String.format("Score: %s", GameEnviroment.getScore()));
					lblMoney.setText(String.format("Money: $%s", GameEnviroment.getFarm().getMoney()));
					lblDayNumber.setText(String.format("Day %s", GameEnviroment.getDayNumber()));
					lblActionsLeft.setText(String.format("Actions Left: %s", GameEnviroment.getActionsLeft()));
					txtMainScreen.setText(txtOutput);
						
					if (GameEnviroment.getDaysToPlay() == 1) {
						btnGoNextDay.setText("End Game");
					}
				} else {
					
					SoundPlayer.playMusic("Hooray.wav");
					
					finishedWindow();
					
					manager.launchEndGameScreen();
				}
				
			}
		});
		btnGoNextDay.setBounds(1036, 615, 185, 64);
		mainScreen.getContentPane().add(btnGoNextDay);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainScreen.class.getResource("/images/BobResized.png")));
		label.setBounds(0, 454, 126, 321);
		mainScreen.getContentPane().add(label);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainScreen.class.getResource("/images/FarmMapResized.png")));
		lblBackground.setBounds(0, 0, 1334, 551);
		mainScreen.getContentPane().add(lblBackground);
		
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (FarmStock.getAnimalList().size() == 0) {
					
					txtMainScreen.setText("Shop Keeper: Sorry but you have no animals to play with, visit the store\nto buy some.");
					
				} else {
					SoundPlayer.playMusic("PlayAnimals.wav");
					GameEnviroment.playWithAnimalsRunner();
					GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
					
					lblActionsLeft.setText(String.format("Actions Left: %s", GameEnviroment.getActionsLeft()));
					
					if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getAnimalToys())) {
						txtMainScreen.setText("Shop Keeper: You have successfully played with your animals\nusing your animals toys, increasing their happiness by 4.");
					} else {
						txtMainScreen.setText("Shop Keeper: You have successfully played with your animals and\nincreased their happiness by 2.");
					}
					
					if (GameEnviroment.getActionsLeft() <= 0) {
						btnTendToCrops.setEnabled(false);
						btnUseItem.setEnabled(false);
						btnTendToFarmLand.setEnabled(false);
						btnFeedAnimals.setEnabled(false);
						btnHarvestCrops.setEnabled(false);
						btnPlayWithAnimals.setEnabled(false);
					}
				
				}
			}
		});
		
		btnFeedAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (FarmStock.getAnimalList().size() == 0) {
					
					txtMainScreen.setText("Shop Keeper: Sorry but you have no animals to feed, visit the store\nto buy some.");
					
				} else {
					
					SoundPlayer.playMusic("Eating.wav");
					GameEnviroment.feedAnimalsRunner();
					GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
					

					txtMainScreen.setText("Shop Keeper: You have successfully fed your animals and\nincreased their health by 3.");
					
					
					lblActionsLeft.setText(String.format("Actions Left: %s", GameEnviroment.getActionsLeft()));
					
					if (GameEnviroment.getActionsLeft() <= 0) {
						btnTendToCrops.setEnabled(false);
						btnUseItem.setEnabled(false);
						btnTendToFarmLand.setEnabled(false);
						btnFeedAnimals.setEnabled(false);
						btnHarvestCrops.setEnabled(false);
						btnPlayWithAnimals.setEnabled(false);
					}
				}
			}
		});
		
		btnHarvestCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean somethingToHarvest = false;
				
				for (Crops crop : FarmStock.getCropList()) {
					
					if (crop.getDaysToHarvest() <= 0) {
						
						somethingToHarvest = true;
					}
				}
				
				
				if (somethingToHarvest) {
					
					HarvestOutputHolder harvestOutput = GameEnviroment.harvestCropsRunner();
					

					SoundPlayer.playMusicLoop("Harvest.wav");
					txtMainScreen.setText(String.format("%s\nHarvest earning total: $%s", harvestOutput.getTxtOutput(), harvestOutput.getReturnedMoney()));
					

					
					GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
					lblActionsLeft.setText(String.format("Actions Left: %s", GameEnviroment.getActionsLeft()));
					lblScore.setText(String.format("Score: %s", GameEnviroment.getScore()));
					lblMoney.setText(String.format("Money: $%s", GameEnviroment.getFarm().getMoney()));
					
					if (GameEnviroment.getActionsLeft() <= 0) {
						btnTendToCrops.setEnabled(false);
						btnUseItem.setEnabled(false);
						btnTendToFarmLand.setEnabled(false);
						btnFeedAnimals.setEnabled(false);
						btnHarvestCrops.setEnabled(false);
						btnPlayWithAnimals.setEnabled(false);
					}
					
					
					
				} else {
					txtMainScreen.setText("Shop Keeper: Sorry but none of your crops are ready to harvest.");
				}
				
			}
		});
		
		btnTendToFarmLand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoundPlayer.playMusic("Sweeping.wav");
				GameEnviroment.tendToFarmLandRunner();
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				
				lblActionsLeft.setText(String.format("Actions Left: %s", GameEnviroment.getActionsLeft()));
				txtMainScreen.setText("Shop Keeper: You have tended to your farm land, reducing the animal\nhappiness decrease overnight by 1 and increasing your crop limit by 3.");	
				
				if (GameEnviroment.getActionsLeft() <= 0) {
					btnTendToCrops.setEnabled(false);
					btnUseItem.setEnabled(false);
					btnTendToFarmLand.setEnabled(false);
					btnFeedAnimals.setEnabled(false);
					btnHarvestCrops.setEnabled(false);
					btnPlayWithAnimals.setEnabled(false);
				}
			}
		});
	}
}
