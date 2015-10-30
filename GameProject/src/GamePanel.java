import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;


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
	
	/**
	 * Constructor for the main game panel.
	 */
	public GamePanel()
	{
		
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
