package main;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
/**
 * This class is the use item screen. It shows
 * all items the farmer has and their quantity.
 * There is an option to use each item.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class UseItemScreen {
	
	/**
	 * The frame of the item screen
	 */
	private JFrame frmUseItemScreen;
	/**
	 * The manager for opening and closing screens
	 */
	private GameEnviroment manager;
	
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of windows
	 */
	public UseItemScreen(GameEnviroment incomingManager) {
		manager = incomingManager;
		initialize();
		frmUseItemScreen.setVisible(true);
	}
	
	/**
	 * Closes the window.
	 */
	public void closeWindow() {
		
		frmUseItemScreen.dispose();
	}
	
	/**
	 * Closes the window and launches the main screen.
	 */
	public void finishedWindow() {
		
		manager.closeUseItemScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUseItemScreen = new JFrame();
		frmUseItemScreen.setBounds(100, 100, 1350, 790);
		frmUseItemScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBackToFarm = new JButton("Back To Farm Menu");
		btnBackToFarm.setBounds(1036, 596, 159, 28);
		btnBackToFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finishedWindow();
			}
		});
		frmUseItemScreen.getContentPane().setLayout(null);
		
		JButton btnUseWeedKiller = new JButton("Use Weed Killer");
		btnUseWeedKiller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GameEnviroment.useAnItemRunner("Weed Killer");
				
				finishedWindow();
			}
		});
		
		JLabel lblAnimalTreatsAmount = new JLabel("");
		lblAnimalTreatsAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnimalTreatsAmount.setForeground(Color.CYAN);
		lblAnimalTreatsAmount.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblAnimalTreatsAmount.setBounds(201, 367, 77, 51);
		frmUseItemScreen.getContentPane().add(lblAnimalTreatsAmount);
		
		JLabel lblFertiliserAmount = new JLabel("");
		lblFertiliserAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFertiliserAmount.setForeground(Color.CYAN);
		lblFertiliserAmount.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblFertiliserAmount.setBounds(867, 416, 77, 51);
		frmUseItemScreen.getContentPane().add(lblFertiliserAmount);
		
		JLabel lblWeedKillerAmount = new JLabel("");
		lblWeedKillerAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWeedKillerAmount.setForeground(Color.CYAN);
		lblWeedKillerAmount.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblWeedKillerAmount.setBounds(601, 96, 77, 51);
		frmUseItemScreen.getContentPane().add(lblWeedKillerAmount);
		
		JLabel lblEnergyBarAmount = new JLabel("");
		lblEnergyBarAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnergyBarAmount.setForeground(new Color(0, 255, 255));
		lblEnergyBarAmount.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblEnergyBarAmount.setBounds(336, 96, 77, 51);
		frmUseItemScreen.getContentPane().add(lblEnergyBarAmount);
		btnUseWeedKiller.setOpaque(false);
		btnUseWeedKiller.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseWeedKiller.setContentAreaFilled(false);
		btnUseWeedKiller.setBorderPainted(false);
		btnUseWeedKiller.setBounds(699, 6, 149, 39);
		frmUseItemScreen.getContentPane().add(btnUseWeedKiller);
		if (FarmStock.getItemsList().contains(Shop.getWeedKiller())) {
			btnUseWeedKiller.setVisible(true);
			btnUseWeedKiller.setEnabled(true);
		} else {
			btnUseWeedKiller.setVisible(false);
			btnUseWeedKiller.setEnabled(false);
		}
		
		JButton btnUseEnergyBar = new JButton("Use Energy Bar");
		btnUseEnergyBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GameEnviroment.useAnItemRunner("Energy Bar");
				
				finishedWindow();
			}
		});
		btnUseEnergyBar.setOpaque(false);
		btnUseEnergyBar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseEnergyBar.setContentAreaFilled(false);
		btnUseEnergyBar.setBorderPainted(false);
		btnUseEnergyBar.setBounds(442, 6, 149, 39);
		frmUseItemScreen.getContentPane().add(btnUseEnergyBar);
		if (FarmStock.getItemsList().contains(Shop.getEnergyBar())) {
			btnUseEnergyBar.setVisible(true);
			btnUseEnergyBar.setEnabled(true);
		} else {
			btnUseEnergyBar.setVisible(false);
			btnUseEnergyBar.setEnabled(false);
		}

		
		
		JButton btnUseTimeMachine = new JButton("Use Time Machine");
		btnUseTimeMachine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GameEnviroment.useAnItemRunner("Time Machine (DeLorean)");
				
				finishedWindow();
				
			}
		});
		btnUseTimeMachine.setOpaque(false);
		btnUseTimeMachine.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseTimeMachine.setContentAreaFilled(false);
		btnUseTimeMachine.setBorderPainted(false);
		btnUseTimeMachine.setBounds(619, 354, 149, 39);
		frmUseItemScreen.getContentPane().add(btnUseTimeMachine);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getTimeMachine())) {
			btnUseTimeMachine.setVisible(true);
			btnUseTimeMachine.setEnabled(true);
		} else {
			btnUseTimeMachine.setVisible(false);
			btnUseTimeMachine.setEnabled(false);
		}

		
		JLabel lblEnergyBarBubble = new JLabel("");
		lblEnergyBarBubble.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblEnergyBarBubble.setBounds(442, 0, 159, 64);
		frmUseItemScreen.getContentPane().add(lblEnergyBarBubble);
		if (FarmStock.getItemsList().contains(Shop.getEnergyBar())) {
			lblEnergyBarBubble.setVisible(true);
			lblEnergyBarBubble.setEnabled(true);
		} else {
			lblEnergyBarBubble.setVisible(false);
			lblEnergyBarBubble.setEnabled(false);
		}
		
		
		JLabel lblWeedKillerBubble = new JLabel("");
		lblWeedKillerBubble.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblWeedKillerBubble.setBounds(699, 0, 159, 64);
		frmUseItemScreen.getContentPane().add(lblWeedKillerBubble);
		if (FarmStock.getItemsList().contains(Shop.getWeedKiller())) {
			lblWeedKillerBubble.setVisible(true);
			lblWeedKillerBubble.setEnabled(true);
		} else {
			lblWeedKillerBubble.setVisible(false);
			lblWeedKillerBubble.setEnabled(false);
		}

		
		JLabel lblTimeMachineBubble = new JLabel("");
		lblTimeMachineBubble.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblTimeMachineBubble.setBounds(619, 348, 159, 64);
		frmUseItemScreen.getContentPane().add(lblTimeMachineBubble);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getTimeMachine())) {
			lblTimeMachineBubble.setVisible(true);
			lblTimeMachineBubble.setEnabled(true);
		} else {
			lblTimeMachineBubble.setVisible(false);
			lblTimeMachineBubble.setEnabled(false);
		}

		
		JLabel lblFertiliserPic = new JLabel("");
		lblFertiliserPic.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/FertiliserUse.png")));
		lblFertiliserPic.setBounds(964, 364, 120, 110);
		frmUseItemScreen.getContentPane().add(lblFertiliserPic);
		if (FarmStock.getItemsList().contains(Shop.getFertiliser())) {
			lblFertiliserPic.setVisible(true);
			lblFertiliserPic.setEnabled(true);
		} else {
			lblFertiliserPic.setVisible(false);
			lblFertiliserPic.setEnabled(false);
		}
		
		JLabel lblWeedKillerPic = new JLabel("");
		lblWeedKillerPic.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/WeedKillerUse.png")));
		lblWeedKillerPic.setBounds(688, 61, 105, 120);
		frmUseItemScreen.getContentPane().add(lblWeedKillerPic);
		if (FarmStock.getItemsList().contains(Shop.getWeedKiller())) {
			lblWeedKillerPic.setVisible(true);
			lblWeedKillerPic.setEnabled(true);
		} else {
			lblWeedKillerPic.setVisible(false);
			lblWeedKillerPic.setEnabled(false);
		}
		
		JLabel lblEnergyBarPic = new JLabel("");
		lblEnergyBarPic.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/EnergyBarUse.png")));
		lblEnergyBarPic.setBounds(416, 71, 139, 110);
		frmUseItemScreen.getContentPane().add(lblEnergyBarPic);
		if (FarmStock.getItemsList().contains(Shop.getEnergyBar())) {
			lblEnergyBarPic.setVisible(true);
			lblEnergyBarPic.setEnabled(true);
		} else {
			lblEnergyBarPic.setVisible(false);
			lblEnergyBarPic.setEnabled(false);
		}
		
		JLabel lblTimeMachinePic = new JLabel("");
		lblTimeMachinePic.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/TimeMachineUse.png")));
		lblTimeMachinePic.setBounds(566, 403, 186, 129);
		frmUseItemScreen.getContentPane().add(lblTimeMachinePic);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getTimeMachine())) {
			lblTimeMachinePic.setVisible(true);
			lblTimeMachinePic.setEnabled(true);
		} else {
			lblTimeMachinePic.setVisible(false);
			lblTimeMachinePic.setEnabled(false);
		}
		
		JLabel lblAnimalTreatsPic = new JLabel("");
		lblAnimalTreatsPic.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/AnimalTreatsUse.png")));
		lblAnimalTreatsPic.setBounds(288, 323, 105, 120);
		frmUseItemScreen.getContentPane().add(lblAnimalTreatsPic);
		frmUseItemScreen.getContentPane().add(btnBackToFarm);
		if (FarmStock.getItemsList().contains(Shop.getAnimalTreats())) {
			lblAnimalTreatsPic.setVisible(true);
			lblAnimalTreatsPic.setEnabled(true);
		} else {
			lblAnimalTreatsPic.setVisible(false);
			lblAnimalTreatsPic.setEnabled(false);
		}
		
		JSeparator separator = new JSeparator();
		separator.setBounds(108, 552, 55, 2);
		frmUseItemScreen.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(108, 551, 2, 15);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		frmUseItemScreen.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(108, 565, 40, 2);
		frmUseItemScreen.getContentPane().add(separator_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(108, 552, 41, 15);
		textPane.setEditable(false);
		frmUseItemScreen.getContentPane().add(textPane);
		
		JLabel lblBobPicture = new JLabel("");
		lblBobPicture.setBounds(0, 454, 126, 321);
		lblBobPicture.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/BobResized.png")));
		frmUseItemScreen.getContentPane().add(lblBobPicture);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(148, 552, 743, 198);
		frmUseItemScreen.getContentPane().add(scrollPane);
		
		JTextArea txtOutput = new JTextArea();
		scrollPane.setViewportView(txtOutput);
		txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtOutput.setEditable(false);
		txtOutput.setText("Shop Keeper: Please pick an item you would like to use. The amount of\n"
					   + "each item you have is shown by the number to the left of it. Once you\n"
					   + "have picked an item to use, it will be used an you will return to the\n"
					   + "farm menu.");
		
		JButton btnUseFertiliser = new JButton("Use Fertiliser");
		btnUseFertiliser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (FarmStock.getCropList().size() == 0) {
					txtOutput.setText("Shop Keeper: Sorry but you have no crops to use fertiliser on.");
				} else {
				
					GameEnviroment.useAnItemRunner("Fertiliser");
					
					finishedWindow();
				}
			}
		});
		btnUseFertiliser.setOpaque(false);
		btnUseFertiliser.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseFertiliser.setContentAreaFilled(false);
		btnUseFertiliser.setBorderPainted(false);
		btnUseFertiliser.setBounds(951, 341, 149, 39);
		frmUseItemScreen.getContentPane().add(btnUseFertiliser);
		if (FarmStock.getItemsList().contains(Shop.getFertiliser())) {
			btnUseFertiliser.setVisible(true);
			btnUseFertiliser.setEnabled(true);
		} else {
			btnUseFertiliser.setVisible(false);
			btnUseFertiliser.setEnabled(false);
		}
		
		
		JButton btnUseAnimalTreats = new JButton("Use Animal Treats");
		btnUseAnimalTreats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (FarmStock.getAnimalList().size() == 0) {
					txtOutput.setText("Shop Keeper: Sorry but you have no animals to feed animal treats to.");
				} else {
					
					GameEnviroment.useAnItemRunner("Animal Treats");
					
					finishedWindow();
				}
			}
		});
		btnUseAnimalTreats.setOpaque(false);
		btnUseAnimalTreats.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseAnimalTreats.setContentAreaFilled(false);
		btnUseAnimalTreats.setBorderPainted(false);
		btnUseAnimalTreats.setBounds(313, 263, 149, 39);
		frmUseItemScreen.getContentPane().add(btnUseAnimalTreats);
		if (FarmStock.getItemsList().contains(Shop.getAnimalTreats())) {
			btnUseAnimalTreats.setVisible(true);
			btnUseAnimalTreats.setEnabled(true);
		} else {
			btnUseAnimalTreats.setVisible(false);
			btnUseAnimalTreats.setEnabled(false);
		}
		
		JLabel lblFertiliserBubble = new JLabel("");
		lblFertiliserBubble.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblFertiliserBubble.setBounds(951, 334, 159, 64);
		frmUseItemScreen.getContentPane().add(lblFertiliserBubble);
		if (FarmStock.getItemsList().contains(Shop.getFertiliser())) {
			lblFertiliserBubble.setVisible(true);
			lblFertiliserBubble.setEnabled(true);
		} else {
			lblFertiliserBubble.setVisible(false);
			lblFertiliserBubble.setEnabled(false);
		}
		
		JLabel lblAnimalTreatsBubble = new JLabel("");
		lblAnimalTreatsBubble.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblAnimalTreatsBubble.setBounds(312, 257, 159, 64);
		frmUseItemScreen.getContentPane().add(lblAnimalTreatsBubble);
		if (FarmStock.getItemsList().contains(Shop.getAnimalTreats())) {
			lblAnimalTreatsBubble.setVisible(true);
			lblAnimalTreatsBubble.setEnabled(true);
		} else {
			lblAnimalTreatsBubble.setVisible(false);
			lblAnimalTreatsBubble.setEnabled(false);
		}
		
		JLabel lblItemUseBackground = new JLabel("");
		lblItemUseBackground.setBounds(0, 0, 1334, 551);
		lblItemUseBackground.setIcon(new ImageIcon(UseItemScreen.class.getResource("/images/ItemUseBackgroundResized.jpg")));
		frmUseItemScreen.getContentPane().add(lblItemUseBackground);
		
		
		int energyBarNum = 0;
		int weedKillerNum = 0;
		int fertiliserNum = 0;
		int animalTreatsNum = 0;
		
		for (Items item : FarmStock.getItemsList()) {
			
			if (item.getName() == "Energy Bar") {
				energyBarNum += 1;
			} else if (item.getName() == "Weed Killer") {
				weedKillerNum += 1;
			} else if (item.getName() == "Fertiliser") {
				fertiliserNum += 1;
			} else if (item.getName() == "Animal Treats") {
				animalTreatsNum += 1;
			}
			
		}
		
		if (energyBarNum == 0) {
			lblEnergyBarAmount.setVisible(false);
		} else {
			lblEnergyBarAmount.setText(String.format("%s", energyBarNum));
		}
		if (weedKillerNum == 0) {
			lblWeedKillerAmount.setVisible(false);
		} else {
			lblWeedKillerAmount.setText(String.format("%s", weedKillerNum));
		}
		if (fertiliserNum == 0) {
			lblFertiliserAmount.setVisible(false);
		} else {
			lblFertiliserAmount.setText(String.format("%s", fertiliserNum));
		}
		if (animalTreatsNum == 0) {
			lblAnimalTreatsAmount.setVisible(false);
		} else {
			lblAnimalTreatsAmount.setText(String.format("%s", animalTreatsNum));
		}

		
	}
}
