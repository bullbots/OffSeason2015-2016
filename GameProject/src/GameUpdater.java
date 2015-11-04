import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

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
	
	public static Point characterLocation;
	
	private boolean[][] filledList= new boolean[800][600];
	
	public static ArrayList<String> keysHeld = new ArrayList<String>();

	
	@Override
	public void run() {
		//Updater thread initialization code.
		MapMaster map = new MapMaster();
		blockList=map.getBlockList();
		Random rand = new Random();
		characterLocation=new Point(rand.nextInt(500), rand.nextInt(500));
		System.out.println("This thread has started: "+Thread.currentThread());
		MoveCharacter characterData = new MoveCharacter();
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			//All update code goes here
			keysHeld.add(scan.next());
			characterLocation=characterData.p1Move(characterLocation,keysHeld);
			keysHeld.clear();
		}
	}
	
	private void fillTheFilledList(){
		
		
	}
	
	
	

}
