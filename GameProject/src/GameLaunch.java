import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.JFrame;



/**
 * Main class for the top-view shooter game. Created by FIRST Robotics Team 1891.
 * @author Tyler
 *
 */
public class GameLaunch {
	/**
	 * @param args
	 */
	@SuppressWarnings("javadoc")
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launchMenuBar(frame);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private static void launchMenuBar(JFrame frame){
		MenuBar frameMenu = new MenuBar();
		Menu fileTab = new Menu("File");
		Menu helpTab = new Menu("Help");
	
		fileTab.addActionListener(new FileTabMenuListener());
		
		
		frameMenu.add(helpTab);
		frameMenu.add(fileTab);
		frame.setMenuBar(frameMenu);
	}

}
