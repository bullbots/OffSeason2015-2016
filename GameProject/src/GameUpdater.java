import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
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
	
	private static boolean[][] filledList= new boolean[800][600];
	
	public static ArrayList<String> keysHeld = new ArrayList<String>();

	public static LinkedList<Enemy> listOfEnemies;
	@Override
	public void run() {
		//Updater thread initialization code.
		MapMaster map = new MapMaster();
		blockList=map.getBlockList();
		Random rand = new Random();
		characterLocation=new Point(rand.nextInt(500), rand.nextInt(500));
		System.out.println("This thread has started: "+Thread.currentThread());
		MoveCharacter characterData = new MoveCharacter();
		fillTheFilledList();//This method fills a list of the filled places by the walls.
		
		Point updatedCharacterLocation;//This variable is used to test if the new character location is on top of a wall or not.
		while(true){
			//All update code goes here
			for(String x: keysHeld){
				System.out.println(x);
			}
			updatedCharacterLocation=characterData.p1Move((Point) characterLocation.clone(),keysHeld);
			if(validLocation(updatedCharacterLocation)){
				characterLocation=updatedCharacterLocation;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void fillTheFilledList(){
		ListIterator<MapBlock> itr = blockList.listIterator();
		while(itr.hasNext()){
			MapBlock tmpBlock=itr.next();
			for(int i=tmpBlock.getMapLocation().x; i<tmpBlock.getMapLocation().x+tmpBlock.getLength();i++){
				for(int j=tmpBlock.getMapLocation().y; j<tmpBlock.getMapLocation().y+tmpBlock.getWidth(); j++){
					filledList[i][j]=true;
				}
			}
		}
	}
	
	private boolean validLocation(Point pt){
		//method that checks all needed point on a component box to make sure that there is not a wall there.
		return (!filledList[pt.x][pt.y] &&
				!filledList[pt.x+10][pt.y] &&
				!filledList[pt.x+20][pt.y] &&
				!filledList[pt.x+20][pt.y+10] &&
				!filledList[pt.x+20][pt.y+20] &&
				!filledList[pt.x+10][pt.y+20] &&
				!filledList[pt.x][pt.y+20] &&
				!filledList[pt.x][pt.y+10]
				);
	}
	
	private static void fillEnemyList(LinkedList<Enemy> enemys){
		Random rand = new Random();
		int tmpX;
		int tmpY;
		for(int i=0; i<20; i++){
			tmpX=rand.nextInt(800);
			tmpY=rand.nextInt(600);
			if(!filledList[tmpX][tmpY]){
				enemys.add(new Enemy());
			}else{
				i--;
			}
		}
	}

}
