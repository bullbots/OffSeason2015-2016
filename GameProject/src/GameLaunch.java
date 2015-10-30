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
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GamePanel());
		
		frame.setVisible(true);
		frame.pack();
				
	}
}
