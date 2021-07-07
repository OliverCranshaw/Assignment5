package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/**
 * This class is the end game screen. It displays the final
 * score the player achieves before they quit the game.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class EndGameScreen {

	/**
	 * The frame of the end game screen
	 */
	private JFrame frmEndGameScreen;
	/**
	 * The manager of opening and closing screens
	 */
	private GameEnviroment manager;
	
	/**
	 * Initializes the screen and sets the manager.
	 * 
	 * @param incomingManager the manager of screens
	 */
	public EndGameScreen(GameEnviroment incomingManager) {
		manager = incomingManager;
		initialize();
		frmEndGameScreen.setVisible(true);
	}
	
	/**
	 * Closes the window.
	 */
	public void closeWindow() {
		
		frmEndGameScreen.dispose();
	}
	
	/**
	 * Closes the window and ends the game.
	 */
	public void finishedWindow() {
		
		manager.closeEndGameScreen(this);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEndGameScreen = new JFrame();
		frmEndGameScreen.setTitle("Game Over");
		frmEndGameScreen.setBounds(100, 100, 1350, 790);
		frmEndGameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEndGameScreen.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Tahoma", Font.BOLD, 18));
		textPane.setBounds(440, 466, 473, 50);
		frmEndGameScreen.getContentPane().add(textPane);
		textPane.setText(String.format("There are now no days left and the game is over.\nYour final score is: %s", GameEnviroment.getScore()));

		
		JButton btnCloseGame = new JButton("Close Game");
		btnCloseGame.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCloseGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finishedWindow();

			}
		});
		btnCloseGame.setBounds(603, 548, 144, 42);
		frmEndGameScreen.getContentPane().add(btnCloseGame);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/BobResized.png")));
		lblNewLabel.setBounds(316, 418, 127, 271);
		frmEndGameScreen.getContentPane().add(lblNewLabel);
		
		JLabel lblThanksForPlaying = new JLabel("");
		lblThanksForPlaying.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/Cool Text - Thanks For Playing -357199064837986.png")));
		lblThanksForPlaying.setBounds(70, 32, 698, 174);
		frmEndGameScreen.getContentPane().add(lblThanksForPlaying);
		
		JLabel lblBackgroundPic = new JLabel("");
		lblBackgroundPic.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/EndScreenBackgroundResized.png")));
		lblBackgroundPic.setBounds(0, 0, 1334, 751);
		frmEndGameScreen.getContentPane().add(lblBackgroundPic);
	}
}
