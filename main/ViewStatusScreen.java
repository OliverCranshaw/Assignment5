package main;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
/**
 * This class is the view status screen. It shows
 * the crops and animals that are owned and their
 * stats. This allows the player to see how their
 * farm is going and helps them decide what action
 * to do.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class ViewStatusScreen {
	
	/**
	 * The frame of the view status screen
	 */
	private JFrame frmViewStatusScreen;
	/**
	 * The manager for closing and launching screens
	 */
	private GameEnviroment manager;
	
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of windows
	 */
	public ViewStatusScreen(GameEnviroment incomingManager) {
		manager = incomingManager;
		initialize();
		frmViewStatusScreen.setVisible(true);
	}
	
	/**
	 * Closes the window.
	 */
	public void closeWindow() {
		
		frmViewStatusScreen.dispose();
	}
	
	/**
	 * Closes the window and launches the main screen.
	 */
	public void finishedWindow() {		
		
		manager.closeViewStatusScreen(this);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViewStatusScreen = new JFrame();
		frmViewStatusScreen.setBounds(100, 100, 1350, 790);
		frmViewStatusScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBackToFarmMenu = new JButton("Back To Farm Menu");
		btnBackToFarmMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finishedWindow();

			}
		});
		frmViewStatusScreen.getContentPane().setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(686, 123, 647, 441);
		frmViewStatusScreen.getContentPane().add(scrollPane_1);

		
		JTextArea txtAnimalsDisplay = new JTextArea();
		scrollPane_1.setViewportView(txtAnimalsDisplay);
		txtAnimalsDisplay.setEditable(false);

		
		txtAnimalsDisplay.setFont(new Font("Monospaced", Font.BOLD, 22));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 119, 647, 444);
		frmViewStatusScreen.getContentPane().add(scrollPane);

		
		JTextArea txtCropsDisplay = new JTextArea();
		scrollPane.setViewportView(txtCropsDisplay);
		txtCropsDisplay.setEditable(false);
		txtCropsDisplay.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnBackToFarmMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBackToFarmMenu.setBounds(499, 575, 344, 75);
		frmViewStatusScreen.getContentPane().add(btnBackToFarmMenu);

		
		JLabel lblCrops = new JLabel(String.format("Crops: (%s/%s)", FarmStock.getCropList().size(), GameEnviroment.getFarm().getCropLimit()));
		lblCrops.setForeground(Color.CYAN);
		lblCrops.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCrops.setBounds(211, 74, 206, 46);
		frmViewStatusScreen.getContentPane().add(lblCrops);
		
		JLabel lblAnimals = new JLabel("Animals:");
		lblAnimals.setForeground(Color.CYAN);
		lblAnimals.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAnimals.setBounds(959, 72, 163, 51);
		frmViewStatusScreen.getContentPane().add(lblAnimals);
		
		JLabel lblBackgroundPic = new JLabel("");
		lblBackgroundPic.setIcon(new ImageIcon(ViewStatusScreen.class.getResource("/images/StatusBackgroundResized.png")));
		lblBackgroundPic.setBounds(0, 0, 1334, 751);
		frmViewStatusScreen.getContentPane().add(lblBackgroundPic);
		

		
		if (FarmStock.getCropList().size() == 0) {
			
			txtCropsDisplay.setText("You have no crops, visit the store to buy some.\r\n\r\n");
		} else {
			
			String cropOutput = "";
			
			for (Crops crop : FarmStock.getCropList()) {
				
				if (crop.getDaysToHarvest() <= 0) {
					cropOutput += (String.format("%s: Ready to harvest.\n", crop.getName(), crop.getDaysToHarvest()));
				} else {
					
					cropOutput += (String.format("%s: %s days left to harvest.\n", crop.getName(), crop.getDaysToHarvest()));
				}
			}
			
			txtCropsDisplay.setText(cropOutput);
			
		}
		
		if (FarmStock.getAnimalList().size() == 0) {
			
			txtAnimalsDisplay.setText("You have no animals, visit the store to buy some.\r\n\r\n");
		} else {
			
			String animalOutput = "";
			
			for (Animals animal : FarmStock.getAnimalList()) {
				animalOutput += (String.format("%s: Has %s health and %s happiness.\n", animal.getName(), animal.getHealth(), animal.getHappiness()));
			}
			
			txtAnimalsDisplay.setText(animalOutput);
			
		}
	}
}
