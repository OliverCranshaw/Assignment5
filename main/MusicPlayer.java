package main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
/**
 * This class is used to play the background music of the game.
 * The wav file must be saved into the sounds folder.
 * 
 * @author Oliver Cranshaw, Michael Woodard
 */
public class MusicPlayer {
	

	
	/**
	 * Plays the music from a specific filename.
	 * The music is looped until the program is ended.
	 * If the file location can't be found an error is
	 * displayed.
	 * 
	 * @param musicLocation the music files name
	 */
	public static void playMusic (String musicLocation) {
		
		try {
			
			URL musicURL = MusicPlayer.class.getResource("/sounds/" + musicLocation);
			

			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicURL);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			
			FloatControl gainControl = 
				    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				gainControl.setValue(-15.0f);
			clip.start();
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
				
		
		
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}

}
