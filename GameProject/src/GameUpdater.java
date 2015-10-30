import java.util.LinkedList;
import javax.swing.JPanel;


/**
 * Updater Thread for the game
 * @author Tyler
 *
 */
@SuppressWarnings("serial")
public class GameUpdater extends JPanel implements Runnable{

	/**
	 * This list contains a set of "blocks" that will create the map, this variable should only be called 
	 * To be painted outisde of the updater thread, the updater thread will control the updates on the list itself.
	 */
	public static LinkedList<MapBlock> blockList;

	@Override
	public void run() {
		MapMaster map = new MapMaster();
		blockList=map.getBlockList();
		System.out.println("This thread has started: "+Thread.currentThread());
		while(true){
			//All update code goes here
			
		}
	}
	

}
