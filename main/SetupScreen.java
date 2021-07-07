package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * This class is the setup screen. It displays
 * instructions for setting up the game and when
 * finished initiates the farm, shop, and rest
 * of game.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class SetupScreen {

	/**
	 * The frame of the setup screen
	 */
	private JFrame frmGameSetup;
	/**
	 * The farmer name input text
	 */
	private JTextField farmerNameInput;
	/**
	 * The farm name input text
	 */
	private JTextField farmNameInput;
	/**
	 * The manager that opens and closes windows
	 */
	private GameEnviroment manager;
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of windows
	 */
	public SetupScreen(GameEnviroment incomingManager) {
		manager = incomingManager;
		initialize();
		frmGameSetup.setVisible(true);
	}
	
	/**
	 * Closes the window.
	 */
	public void closeWindow() {
		
		frmGameSetup.dispose();
	}
	
	/**
	 * Closes the window and launches the main screen.
	 */
	public void finishedWindow() {		
		
		manager.closeSetupScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameSetup = new JFrame();
		frmGameSetup.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmGameSetup.setTitle("Game Setup");
		frmGameSetup.setBounds(100, 100, 1350, 790);
		frmGameSetup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameSetup.getContentPane().setLayout(null);
		
		JLabel lblFarmPic = new JLabel("");
		lblFarmPic.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/NormalFarmResized.jpg")));
		lblFarmPic.setBounds(377, 566, 350, 184);
		frmGameSetup.getContentPane().add(lblFarmPic);

		
		JTextPane farmNameError = new JTextPane();
		farmNameError.setForeground(Color.RED);
		farmNameError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		farmNameError.setEditable(false);
		farmNameError.setBounds(841, 638, 459, 20);
		frmGameSetup.getContentPane().add(farmNameError);
		
		JTextPane daysToPlay = new JTextPane();
		daysToPlay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		daysToPlay.setEditable(false);
		daysToPlay.setBounds(970, 438, 170, 28);
		frmGameSetup.getContentPane().add(daysToPlay);
		
		JTextPane farmerName = new JTextPane();
		farmerName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farmerName.setEditable(false);
		farmerName.setBounds(970, 482, 205, 28);
		frmGameSetup.getContentPane().add(farmerName);
		
		JTextPane farmerNameError = new JTextPane();
		farmerNameError.setForeground(Color.RED);
		farmerNameError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		farmerNameError.setEditable(false);
		farmerNameError.setBounds(841, 509, 459, 20);
		frmGameSetup.getContentPane().add(farmerNameError);
		
		JTextPane animalStartHappiness = new JTextPane();
		animalStartHappiness.setEditable(false);
		animalStartHappiness.setFont(new Font("Tahoma", Font.BOLD, 14));
		animalStartHappiness.setText("12");
		animalStartHappiness.setBounds(275, 622, 29, 28);
		frmGameSetup.getContentPane().add(animalStartHappiness);

		
		JTextPane startingCropLimit = new JTextPane();
		startingCropLimit.setEditable(false);
		startingCropLimit.setFont(new Font("Tahoma", Font.BOLD, 14));
		startingCropLimit.setText("5");
		startingCropLimit.setBounds(245, 722, 61, 28);
		frmGameSetup.getContentPane().add(startingCropLimit);

		
		JTextPane farmerAge = new JTextPane();
		farmerAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farmerAge.setEditable(false);
		farmerAge.setBounds(970, 525, 170, 28);
		frmGameSetup.getContentPane().add(farmerAge);
		
		JTextPane cropValueBonus = new JTextPane();
		cropValueBonus.setEditable(false);
		cropValueBonus.setFont(new Font("Tahoma", Font.BOLD, 14));
		cropValueBonus.setText("1");
		cropValueBonus.setBounds(211, 571, 68, 28);
		frmGameSetup.getContentPane().add(cropValueBonus);

		
		JTextPane farmType = new JTextPane();
		farmType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farmType.setEditable(false);
		farmType.setBounds(970, 573, 205, 28);
		frmGameSetup.getContentPane().add(farmType);
		
		JTextPane farmName = new JTextPane();
		farmName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farmName.setEditable(false);
		farmName.setBounds(970, 615, 205, 28);
		frmGameSetup.getContentPane().add(farmName);
		
		JTextPane startingCash = new JTextPane();
		startingCash.setEditable(false);
		startingCash.setFont(new Font("Tahoma", Font.BOLD, 14));
		startingCash.setText("25");
		startingCash.setBounds(183, 673, 109, 28);
		frmGameSetup.getContentPane().add(startingCash);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(119, 49, 145, 39);
		frmGameSetup.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/Cool Text - Farm Simulator -357226919553251.png")));
		lblNewLabel_1.setBounds(10, 11, 754, 141);
		frmGameSetup.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrBobHiThere = new JTextArea();
		txtrBobHiThere.setEditable(false);
		txtrBobHiThere.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrBobHiThere.setText("Shop Keeper: Hi there, my name is Bob and I'll be guiding you through your farm. \r\nYour goal is to earn the highest score in a set number of days. \r\nThe score is decided by the total money you earn and the animals you have alive at the end of the game. \r\nPlease follow the instructions below to setup your farm.\r\n");
		txtrBobHiThere.setBounds(10, 163, 1290, 113);
		frmGameSetup.getContentPane().add(txtrBobHiThere);

		
		JSlider daysToPlaySlider = new JSlider();
		daysToPlaySlider.setMajorTickSpacing(1);
		daysToPlaySlider.setPaintLabels(true);
		daysToPlaySlider.setValue(5);
		daysToPlaySlider.setMinimum(5);
		daysToPlaySlider.setPaintTicks(true);
		daysToPlaySlider.setMaximum(10);
		daysToPlaySlider.setBounds(492, 285, 273, 45);
		frmGameSetup.getContentPane().add(daysToPlaySlider);

		
		JSlider farmerAgeSlider = new JSlider();
		farmerAgeSlider.setValue(5);
		farmerAgeSlider.setPaintTicks(true);
		farmerAgeSlider.setPaintLabels(true);
		farmerAgeSlider.setMinimum(15);
		farmerAgeSlider.setMaximum(65);
		farmerAgeSlider.setMajorTickSpacing(5);
		farmerAgeSlider.setBounds(492, 405, 273, 45);
		frmGameSetup.getContentPane().add(farmerAgeSlider);

		
		farmerNameInput = new JTextField();
		farmerNameInput.setToolTipText("");
		farmerNameInput.setFont(new Font("Tahoma", Font.PLAIN, 19));
		farmerNameInput.setBounds(248, 345, 160, 28);
		frmGameSetup.getContentPane().add(farmerNameInput);
		farmerNameInput.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Farm Overview:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setLabelFor(frmGameSetup);
		lblNewLabel_2.setBounds(839, 279, 285, 69);
		frmGameSetup.getContentPane().add(lblNewLabel_2);
		
		JTextPane txtpnDaysToPlay = new JTextPane();
		txtpnDaysToPlay.setText("Days to play:\r\n\r\nFarmer name:\r\n\r\nFarmer age:\r\n\r\nFarm type:\r\n\r\nFarm name:\r\n");
		txtpnDaysToPlay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnDaysToPlay.setEditable(false);
		txtpnDaysToPlay.setBackground(Color.WHITE);
		txtpnDaysToPlay.setBounds(841, 438, 459, 226);
		frmGameSetup.getContentPane().add(txtpnDaysToPlay);
		
		JLabel lblNewLabel_3 = new JLabel("Use the slider to select your number of days to play. ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 285, 472, 32);
		frmGameSetup.getContentPane().add(lblNewLabel_3);
		
		JLabel lblInputYourFarmers = new JLabel("Input your farmer's name:\r\n");
		lblInputYourFarmers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInputYourFarmers.setBounds(10, 345, 238, 32);
		frmGameSetup.getContentPane().add(lblInputYourFarmers);
		
		JLabel lblUseTheSlider = new JLabel("Use the slider to select your farmer's age.\r\n");
		lblUseTheSlider.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUseTheSlider.setBounds(10, 405, 382, 32);
		frmGameSetup.getContentPane().add(lblUseTheSlider);
		

		
		JComboBox<String> farmTypeComboBox = new JComboBox<String>();
		farmTypeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (farmTypeComboBox.getSelectedItem() == "Normal Farm") {
					
					cropValueBonus.setText("10");
					animalStartHappiness.setText("12");
					startingCash.setText("25");
					startingCropLimit.setText("10");
					
					lblFarmPic.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/NormalFarmResized.jpg")));
					
				} else if (farmTypeComboBox.getSelectedItem() == "Valuable Crops Farm") {
					
					cropValueBonus.setText("30");
					animalStartHappiness.setText("10");
					startingCash.setText("20");
					startingCropLimit.setText("15");
					
					lblFarmPic.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/CropFarmResized.png")));
				
				} else if (farmTypeComboBox.getSelectedItem() == "Happy Animals Farm") {
					
					cropValueBonus.setText("0");
					animalStartHappiness.setText("15");
					startingCash.setText("20");
					startingCropLimit.setText("5");
					
					lblFarmPic.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/AnimalFarmResized.jpg")));
					
				} else if (farmTypeComboBox.getSelectedItem() == "Rich Farm") {
					
					cropValueBonus.setText("20");
					animalStartHappiness.setText("10");
					startingCash.setText("40");
					startingCropLimit.setText("8");
					
					lblFarmPic.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/RichFarmResized.jpg")));
				}
				
			}
		});
		farmTypeComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		farmTypeComboBox.setMaximumRowCount(4);
		farmTypeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Normal Farm", "Valuable Crops Farm", "Happy Animals Farm", "Rich Farm"}));
		farmTypeComboBox.setBounds(377, 523, 221, 39);
		frmGameSetup.getContentPane().add(farmTypeComboBox);
		
		JLabel lblUseTheCombo = new JLabel("Use the combo box to pick a farm type. ");
		lblUseTheCombo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUseTheCombo.setBounds(10, 525, 357, 32);
		frmGameSetup.getContentPane().add(lblUseTheCombo);
		
		JTextArea txtrCropGrowthBonus = new JTextArea();
		txtrCropGrowthBonus.setEditable(false);
		txtrCropGrowthBonus.setText("Crop value bonus:\r\n\r\nAnimal happiness bonus:\r\n\r\nStarting cash:\r\n\r\nStarting crop limit:");
		txtrCropGrowthBonus.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtrCropGrowthBonus.setBounds(21, 568, 319, 183);
		frmGameSetup.getContentPane().add(txtrCropGrowthBonus);

		
		JLabel lblInputYourFarm = new JLabel("Input your farm name:\r\n");
		lblInputYourFarm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInputYourFarm.setBounds(10, 465, 212, 32);
		frmGameSetup.getContentPane().add(lblInputYourFarm);
		
		farmNameInput = new JTextField();
		farmNameInput.setToolTipText("");
		farmNameInput.setFont(new Font("Tahoma", Font.PLAIN, 19));
		farmNameInput.setColumns(10);
		farmNameInput.setBounds(216, 465, 160, 28);
		frmGameSetup.getContentPane().add(farmNameInput);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (farmTypeComboBox.getSelectedIndex() == 0) {

					GameEnviroment.setFarm(new NormalFarm());
					
				} else if (farmTypeComboBox.getSelectedIndex() == 1) {
					
					GameEnviroment.setFarm(new ValuableCropsFarm());
				
				} else if (farmTypeComboBox.getSelectedIndex() == 2) {
					
					GameEnviroment.setFarm(new HappyAnimalsFarm());
					
				} else if (farmTypeComboBox.getSelectedIndex() == 3) {
					
					GameEnviroment.setFarm(new RichFarm());
				
				}
				
				GameEnviroment.getFarm().setFarmName(farmName.getText());
				GameEnviroment.getFarmer().setFarmerAge(farmerAge.getText());
				GameEnviroment.getFarmer().setFarmerName(farmerName.getText());
				GameEnviroment.setDaysToPlay(Integer.parseInt(daysToPlay.getText()));
				GameEnviroment.setDaysToPlayHolder(Integer.parseInt(daysToPlay.getText()));


				
				SoundPlayer.playMusic("Rooster.wav");
				finishedWindow();
				
				

			}
		});
		btnProceed.setEnabled(false);
		btnProceed.setBounds(1119, 675, 145, 52);
		frmGameSetup.getContentPane().add(btnProceed);
		
		JTextArea txtrPressTheCheck = new JTextArea();
		txtrPressTheCheck.setEditable(false);
		txtrPressTheCheck.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrPressTheCheck.setText("Press the Check Setup button to update the details below.\r\nIf you are happy with your setup click proceed to begin \r\nthe game.\r\n");
		txtrPressTheCheck.setBounds(839, 345, 461, 69);
		frmGameSetup.getContentPane().add(txtrPressTheCheck);

		
		JButton btnCheckSetup = new JButton("Check Setup");
		btnCheckSetup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean viableFarmerName = false;
				boolean viableFarmName = false;
				
				daysToPlay.setText(String.format("%s", daysToPlaySlider.getValue()));
				
				
				String name = farmerNameInput.getText();
				
				if(!name.matches("[a-zA-Z]+")) {
					
					farmerName.setText(name);
					
					farmerNameError.setText("Your farmer name must not include numbers or special characters.");
					viableFarmerName = false;
					
				} else if (name.length() > 15 | name.length() < 3) {
					
					farmerName.setText(name);
					
					farmerNameError.setText("Your farmer name be between 3 and 15 characters inclusive.");
					viableFarmerName = false;
					
				} else {
					farmerNameError.setText("");
					
					farmerName.setText(name);
					viableFarmerName = true;
				}		
						
		
				name = farmNameInput.getText();
				
				if (name.length() > 15 | name.length() < 3) {
					
					farmName.setText(name);
					viableFarmName = false;
					farmNameError.setText("Your farm name be between 3 and 15 characters inclusive.");
				
				} else {
					
					farmNameError.setText("");
					
					
					farmName.setText(name);
					viableFarmName = true;
					
				}
				
				farmerAge.setText(String.format("%s", farmerAgeSlider.getValue()));
				farmType.setText(String.format("%s", farmTypeComboBox.getSelectedItem()));
				
				if (viableFarmName && viableFarmerName) {
					
					btnProceed.setEnabled(true);
				} else {
					btnProceed.setEnabled(false);
				}
				
			}	
		});
		btnCheckSetup.setBounds(901, 675, 145, 52);
		frmGameSetup.getContentPane().add(btnCheckSetup);
		
		JLabel lblBackgroundPic = new JLabel("");
		lblBackgroundPic.setIcon(new ImageIcon(SetupScreen.class.getResource("/images/SetupBackgroundResizedFlipped.jpg")));
		lblBackgroundPic.setBounds(0, 0, 1334, 750);
		frmGameSetup.getContentPane().add(lblBackgroundPic);
	}
	

}
