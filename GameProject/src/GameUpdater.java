import java.awt.Graphics;


/**
 * @author Tyler
 *
 */
@SuppressWarnings("serial")
public class GameUpdater extends GamePanel{
	/**
	 * Updates and paints the new game
	 */
	public void updateGame(Graphics g){
		
		g.clearRect(10, 10, 100, 100);
		repaint();
	}
}
