import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * @author Tyler, Zach
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel 
{
	
	Thread GPthread = new Thread(new GameUpdater());
	Timer time;
	/**
	 * Constructor for the main game panel.
	 */
	public GamePanel()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ListIterator<MapBlock> itr=GameUpdater.blockList.listIterator();
		g.setColor(Color.BLUE);
		g.fillOval(GameUpdater.characterLocation.x, GameUpdater.characterLocation.y, 20, 20);
		while(itr.hasNext()){
			MapBlock tmpBlock = itr.next();
			Point currentPoint = tmpBlock.getMapLocation();
			g.setColor(Color.BLACK);
			g.fill3DRect(currentPoint.x, currentPoint.y, tmpBlock.getLength(), tmpBlock.getWidth(), true);
		}
	}
	/**
	 * This method should be invoked right after the instantiation of the game panel.
	 */
	public void startGamePanel(){
		this.setPreferredSize(new Dimension(800,600));
		time = new Timer(10, new Repainter());
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(new UI());
		GPthread.start();
		time.start();
	}
	
	private class Repainter implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			repaint();
		}
		
	}
}
