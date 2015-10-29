import java.awt.Graphics;
import javax.swing.JPanel;


/**
 * @author Tyler, Zach
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel 
{
	
	/**
	 * Constructor for the main game panel.
	 */
	public GamePanel()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(100, 100, 12, 80);
	}
	
}
