import java.awt.Dimension;

import javax.swing.JFrame;

import java.awt.Toolkit;


public class GameLaunch {
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.pack();
		frame.setVisible(true);
	}

}
