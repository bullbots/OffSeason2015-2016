import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * @author Tyler, Zach
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel 
{
	MapMaster map = new MapMaster();
	LinkedList<MapBlock> mapLinked = map.getBlockList();
	
	Object mapArray[] = new Object[mapLinked.size()];
	Timer time;
	
	/**
	 * Constructor for the main game panel.
	 */
	public GamePanel()
	{
		time=new Timer(10, new UpdateGame());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		LinkedList<MapBlock> mapBound = map.getBlockList();
		for(int i = 0; i<mapArray.length; i++)
		{
			
		}
		
	}
	
	
}
