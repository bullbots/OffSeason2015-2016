import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;

public class UItesting {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.addKeyListener(new UI());
		frame.setPreferredSize(new Dimension(800, 600));
		
		frame.setVisible(true);
		frame.pack();
	}

}
