import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.ListIterator;

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
		System.out.println("Call to paintComponent in GamePanel");
		while(itr.hasNext()){
			MapBlock tmpBlock = itr.next();
			Point currentPoint = tmpBlock.getMapLocation();
			g.setColor(Color.BLACK);
			g.fill3DRect(currentPoint.x, currentPoint.y, tmpBlock.getLength(), tmpBlock.getWidth(), true);
		}
	}
	public void startGamePanel(){
		this.setPreferredSize(new Dimension(800,600));
		time = new Timer(10, new GameUpdater());
		GPthread.start();
		time.start();
	}
}
