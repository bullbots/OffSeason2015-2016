import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JPanel;


/**
 * Updater Thread for the game
 * @author Tyler
 *
 */
public class GameUpdater extends JPanel implements Runnable, ActionListener{

	public static LinkedList<MapBlock> blockList;
	public void actionPerformed(ActionEvent e) {
		System.out.println("GamePanel called Action");
		GamePanel gamePanel = new GamePanel();
		System.out.println("Action Even list size: "+blockList.size());
		gamePanel.repaint();
	}

	@Override
	public void run() {
		MapMaster map = new MapMaster();
		blockList=map.getBlockList();
		System.out.println("This thread has started: "+Thread.currentThread());
		while(true){
			System.out.println("UpdaterThread running");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			blockList.clear();
		}
	}

}
