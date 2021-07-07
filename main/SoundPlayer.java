package main;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 * This class is used to play sound effects in the game.
 * The wav file must be saved into the sounds folder.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class SoundPlayer {
	
	/**
	 * Plays the specified audio clip once.
	 * 
	 * @param musicLocation the name of the file to be played
	 */
	public static void playMusic (String soundLocation) {
			
		try {
			
			URL soundURL = MusicPlayer.class.getResource("/sounds/" + soundLocation);
			

				
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();

				

		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	/**
	 * Plays the specified audio clip 3 times in a row
	 * 
	 * @param musicLocation the name of the file to be played
	 */
	public static void playMusicLoop(String soundLocation) {
		
		try {
			
			URL soundURL = MusicPlayer.class.getResource("/sounds/" + soundLocation);
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundURL);
			
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			clip.loop(2);

				


		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
}
