import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;



/**
 * Main class for the top-view shooter game. Created by FIRST Robotics Team 1891.
 * @author Tyler, Zach
 *
 */
public class GameLaunch {
	/**
	 * @param args
	 */
	@SuppressWarnings("javadoc")
	public static void main(String[]args){
		//Music code
		
		
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel = new GamePanel();
		gamePanel.startGamePanel();
		frame.getContentPane().add(gamePanel);
		
		frame.pack();
		frame.setVisible(true);
				
	}
}
