package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
/**
 * This class is the tend to crops screen.
 * It displays the types of crops the farmer has
 * and gives the option to tend to a type of crop
 * to reduce its days left till harvest.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class TendToCropsScreen {
	
	/**
	 * The frame of the crops screen
	 */
	private JFrame frmTendToCropsScreen;
	/**
	 * The manager for launching and closing windows
	 */
	private GameEnviroment manager; 
	
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of windows
	 */
	public TendToCropsScreen(GameEnviroment incomingManager) {
		manager = incomingManager;
		initialize();
		frmTendToCropsScreen.setVisible(true);
	}
	
	/**
	 * Closes the window.
	 */
	public void closeWindow() {
		
		frmTendToCropsScreen.dispose();
	}
	
	/**
	 * Closes the window and launches the main screen.
	 */
	public void finishedWindow() {
		
		manager.closeTendToCropsScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTendToCropsScreen = new JFrame();
		frmTendToCropsScreen.setBounds(100, 100, 1350, 790);
		frmTendToCropsScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTendToCropsScreen.getContentPane().setLayout(null);
		
		
		boolean containsPotato = false;
		boolean containsRice = false;
		boolean containsWheat = false;
		boolean containsCorn = false;
		boolean containsSugarcane = false;
		boolean containsBerry = false;
		
		for (Crops crop: FarmStock.getCropList()) {
			if (crop.getName() == "Potato") {
				containsPotato = true;
			} else if (crop.getName() == "Rice") {
					containsRice = true;
			} else if (crop.getName() == "Wheat") {
				containsWheat = true;
			} else if (crop.getName() == "Corn") {
				containsCorn = true;
			} else if (crop.getName() == "Sugarcane") {
				containsSugarcane = true;
			} else if (crop.getName() == "Berry") {
				containsBerry = true;
			}
		}
		
		
		JButton btnUseWaterSprinklers = new JButton("Use Water Sprinklers");
		btnUseWaterSprinklers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.useWaterSprinklersRunner();
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnUseWaterSprinklers.setOpaque(false);
		btnUseWaterSprinklers.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUseWaterSprinklers.setContentAreaFilled(false);
		btnUseWaterSprinklers.setBorderPainted(false);
		btnUseWaterSprinklers.setBounds(638, 153, 173, 41);
		frmTendToCropsScreen.getContentPane().add(btnUseWaterSprinklers);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getWaterSprinklers())) {
			btnUseWaterSprinklers.setEnabled(true);
			btnUseWaterSprinklers.setVisible(true);
		} else {
			btnUseWaterSprinklers.setEnabled(false);
			btnUseWaterSprinklers.setVisible(false);
		}
		
		JLabel lblWaterSprinklersBubble = new JLabel("");
		lblWaterSprinklersBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblWaterSprinklersBubble.setBounds(648, 153, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblWaterSprinklersBubble);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getWaterSprinklers())) {
			lblWaterSprinklersBubble.setVisible(true);
		} else {
			lblWaterSprinklersBubble.setVisible(false);
		}
		
		JButton btnTendBerry = new JButton("Tend To Berrys");
		btnTendBerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.tendToCropsRunner("Berry");
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnTendBerry.setOpaque(false);
		btnTendBerry.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendBerry.setContentAreaFilled(false);
		btnTendBerry.setBorderPainted(false);
		btnTendBerry.setBounds(836, 293, 147, 41);
		frmTendToCropsScreen.getContentPane().add(btnTendBerry);
		
		
		if (containsBerry) {
			btnTendBerry.setEnabled(true);
			btnTendBerry.setVisible(true);
		} else {
			btnTendBerry.setEnabled(false);
			btnTendBerry.setVisible(false);
		}
		
		JButton btnTendSugarcane = new JButton("Tend To Sugarcane");
		btnTendSugarcane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.tendToCropsRunner("Sugarcane");
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnTendSugarcane.setOpaque(false);
		btnTendSugarcane.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendSugarcane.setContentAreaFilled(false);
		btnTendSugarcane.setBorderPainted(false);
		btnTendSugarcane.setBounds(831, 26, 156, 41);
		frmTendToCropsScreen.getContentPane().add(btnTendSugarcane);
		if (containsSugarcane) {
			btnTendSugarcane.setEnabled(true);
			btnTendSugarcane.setVisible(true);
		} else {
			btnTendSugarcane.setEnabled(false);
			btnTendSugarcane.setVisible(false);
		}
		
		JButton btnTendCorn = new JButton("Tend To Corn");
		btnTendCorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.tendToCropsRunner("Corn");
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnTendCorn.setOpaque(false);
		btnTendCorn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendCorn.setContentAreaFilled(false);
		btnTendCorn.setBorderPainted(false);
		btnTendCorn.setBounds(503, 293, 147, 41);
		frmTendToCropsScreen.getContentPane().add(btnTendCorn);
		if (containsCorn) {
			btnTendCorn.setEnabled(true);
			btnTendCorn.setVisible(true);
		} else {
			btnTendCorn.setEnabled(false);
			btnTendCorn.setVisible(false);
		}
		
		JButton btnTendWheat = new JButton("Tend To Wheat");
		btnTendWheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.tendToCropsRunner("Wheat");
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnTendWheat.setOpaque(false);
		btnTendWheat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendWheat.setContentAreaFilled(false);
		btnTendWheat.setBorderPainted(false);
		btnTendWheat.setBounds(503, 26, 147, 41);
		frmTendToCropsScreen.getContentPane().add(btnTendWheat);
		if (containsWheat) {
			btnTendWheat.setEnabled(true);
			btnTendWheat.setVisible(true);
		} else {
			btnTendWheat.setEnabled(false);
			btnTendWheat.setVisible(false);
		}
		
		JButton btnTendRice = new JButton("Tend To Rice");
		btnTendRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.tendToCropsRunner("Rice");
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnTendRice.setOpaque(false);
		btnTendRice.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendRice.setContentAreaFilled(false);
		btnTendRice.setBorderPainted(false);
		btnTendRice.setBounds(173, 293, 147, 41);
		frmTendToCropsScreen.getContentPane().add(btnTendRice);
		if (containsRice) {
			btnTendRice.setEnabled(true);
			btnTendRice.setVisible(true);
		} else {
			btnTendRice.setEnabled(false);
			btnTendRice.setVisible(false);
		}
		
		JButton btnTendPotato = new JButton("Tend To Potatos");
		btnTendPotato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnviroment.tendToCropsRunner("Potato");
				GameEnviroment.setActionsLeft(GameEnviroment.getActionsLeft() - 1);
				finishedWindow();
			}
		});
		btnTendPotato.setOpaque(false);
		btnTendPotato.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendPotato.setContentAreaFilled(false);
		btnTendPotato.setBorderPainted(false);
		btnTendPotato.setBounds(173, 26, 147, 41);
		frmTendToCropsScreen.getContentPane().add(btnTendPotato);
		if (containsPotato) {
			btnTendPotato.setEnabled(true);
			btnTendPotato.setVisible(true);
		} else {
			btnTendPotato.setEnabled(false);
			btnTendPotato.setVisible(false);
		}
		
		JLabel lblWaterSprinklers = new JLabel("");
		lblWaterSprinklers.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/WaterSprinklersTend.png")));
		lblWaterSprinklers.setBounds(614, 195, 143, 138);
		frmTendToCropsScreen.getContentPane().add(lblWaterSprinklers);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getWaterSprinklers())) {
			lblWaterSprinklers.setVisible(true);
		} else {
			lblWaterSprinklers.setVisible(false);
		}
		
		
		JLabel lblScarecrow = new JLabel("New label");
		lblScarecrow.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ScarecrowTend.png")));
		lblScarecrow.setBounds(340, 195, 75, 138);
		frmTendToCropsScreen.getContentPane().add(lblScarecrow);
		if (FarmStock.getSinglePurchaseItemsList().contains(Shop.getScarecrow())) {
			lblScarecrow.setVisible(true);
		} else {
			lblScarecrow.setVisible(false);
		}
		
		JLabel lblSugarcaneBubble = new JLabel("");
		lblSugarcaneBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblSugarcaneBubble.setBounds(833, 26, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblSugarcaneBubble);
		if (containsSugarcane) {
			lblSugarcaneBubble.setVisible(true);
		} else {
			lblSugarcaneBubble.setVisible(false);
		}
		
		
		JLabel lblBerryBubble = new JLabel("");
		lblBerryBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblBerryBubble.setBounds(833, 293, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblBerryBubble);
		if (containsBerry) {
			lblBerryBubble.setVisible(true);
		} else {
			lblBerryBubble.setVisible(false);
		}
		
		JLabel lblCornBubble = new JLabel("");
		lblCornBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblCornBubble.setBounds(500, 293, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblCornBubble);
		if (containsCorn) {
			lblCornBubble.setVisible(true);
		} else {
			lblCornBubble.setVisible(false);
		}
		
		JLabel lblWheatBubble = new JLabel("");
		lblWheatBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblWheatBubble.setBounds(500, 26, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblWheatBubble);
		if (containsWheat) {
			lblWheatBubble.setVisible(true);
		} else {
			lblWheatBubble.setVisible(false);
		}
		
		JLabel lblPotatoBubble = new JLabel("");
		lblPotatoBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblPotatoBubble.setBounds(171, 26, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblPotatoBubble);
		if (containsPotato) {
			lblPotatoBubble.setVisible(true);
		} else {
			lblPotatoBubble.setVisible(false);
		}
		
		JLabel lblRiceBubble = new JLabel("New label");
		lblRiceBubble.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/ButtonBubbleResized.png")));
		lblRiceBubble.setBounds(171, 293, 159, 55);
		frmTendToCropsScreen.getContentPane().add(lblRiceBubble);
		if (containsRice) {
			lblRiceBubble.setVisible(true);
		} else {
			lblRiceBubble.setVisible(false);
		}
		
		JLabel lblTendBerryPic = new JLabel("");
		lblTendBerryPic.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/BerryTend.png")));
		lblTendBerryPic.setBounds(833, 360, 116, 113);
		frmTendToCropsScreen.getContentPane().add(lblTendBerryPic);
		if (containsBerry) {
			lblTendBerryPic.setVisible(true);
		} else {
			lblTendBerryPic.setVisible(false);
		}
		
		JLabel lblSugarcaneTendPic = new JLabel("");
		lblSugarcaneTendPic.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/SugarcaneTend.png")));
		lblSugarcaneTendPic.setBounds(833, 92, 131, 138);
		frmTendToCropsScreen.getContentPane().add(lblSugarcaneTendPic);
		if (containsSugarcane) {
			lblSugarcaneTendPic.setVisible(true);
		} else {
			lblSugarcaneTendPic.setVisible(false);
		}
		
		JLabel lblCornTendPic = new JLabel("");
		lblCornTendPic.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/CornTend.png")));
		lblCornTendPic.setBounds(493, 368, 126, 91);
		frmTendToCropsScreen.getContentPane().add(lblCornTendPic);
		if (containsCorn) {
			lblCornTendPic.setVisible(true);
		} else {
			lblCornTendPic.setVisible(false);
		}
		
		JLabel lblWheatTendPic = new JLabel("");
		lblWheatTendPic.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/WheatTend.png")));
		lblWheatTendPic.setBounds(493, 81, 201, 127);
		frmTendToCropsScreen.getContentPane().add(lblWheatTendPic);
		if (containsWheat) {
			lblWheatTendPic.setVisible(true);
		} else {
			lblWheatTendPic.setVisible(false);
		}
		
		JLabel lblPotatoTendPic = new JLabel("");
		lblPotatoTendPic.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/PotatoTend.png")));
		lblPotatoTendPic.setBounds(158, 92, 137, 108);
		frmTendToCropsScreen.getContentPane().add(lblPotatoTendPic);
		if (containsPotato) {
			lblPotatoTendPic.setVisible(true);
		} else {
			lblPotatoTendPic.setVisible(false);
		}
		
		JLabel lblRiceTendPic = new JLabel("");
		lblRiceTendPic.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/RiceTend.png")));
		lblRiceTendPic.setBounds(158, 346, 126, 127);
		frmTendToCropsScreen.getContentPane().add(lblRiceTendPic);
		if (containsRice) {
			lblRiceTendPic.setVisible(true);
		} else {
			lblRiceTendPic.setVisible(false);
		}
		
		JLabel lblBobPicture = new JLabel("");
		lblBobPicture.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/BobResized.png")));
		lblBobPicture.setBounds(0, 454, 126, 321);
		frmTendToCropsScreen.getContentPane().add(lblBobPicture);
		
		JButton btnGoBack = new JButton("Back To Farm Menu");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnGoBack.setBounds(1036, 596, 159, 28);
		frmTendToCropsScreen.getContentPane().add(btnGoBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(108, 552, 55, 2);
		frmTendToCropsScreen.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(108, 551, 2, 15);
		frmTendToCropsScreen.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(108, 565, 40, 2);
		frmTendToCropsScreen.getContentPane().add(separator_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(108, 552, 41, 15);
		frmTendToCropsScreen.getContentPane().add(textPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(148, 552, 743, 198);
		frmTendToCropsScreen.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setText("Shop Keeper: Please choose a crop to tend to. If you own water sprinklers\n"
					   + "you can use them to water all crop types at once. Once you pick a crop to\n"
					   + "tend to you will be returned to the farm menu.");
		
		JLabel lblCropBackgroundPicture = new JLabel("");
		lblCropBackgroundPicture.setIcon(new ImageIcon(TendToCropsScreen.class.getResource("/images/CropsBackgroundResized.png")));
		lblCropBackgroundPicture.setBounds(0, 0, 1334, 551);
		frmTendToCropsScreen.getContentPane().add(lblCropBackgroundPicture);



	}
}
