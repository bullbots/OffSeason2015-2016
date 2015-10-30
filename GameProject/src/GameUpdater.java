import java.awt.Graphics;


/**
 * @author Tyler
 *
 */
@SuppressWarnings({ "serial", "unused" })
public class GameUpdater extends GamePanel{
	/**
	 * Updates and paints the new game
	 */
	public void updateGame(){
		mapLinked.clear();
		repaint();
	}
}
