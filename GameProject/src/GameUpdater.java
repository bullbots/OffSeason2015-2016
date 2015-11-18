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
	 * To be painted outisde of the updater thread, the updater thread will control the updates on the list itself.
	 */
	public static LinkedList<MapBlock> blockList;
	
	/**
	 * Current point of character location.
	 */
	public static Point characterLocation;
	
	private static boolean[][] filledList= new boolean[800][600];
	
	/**
	 * List of all keys currently pressed on the keyboard.
	 */
	public static ArrayList<String> keysHeld = new ArrayList<String>();

	/**
	 * List filled with all of the enemies for the game.
	 */
	public static LinkedList<Enemy> listOfEnemies = new LinkedList<Enemy>();
	
	/**
	 * List of all bullet objects
	 */
	public static LinkedList<Bullet> listOfBullets = new LinkedList<Bullet>();
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		//Updater thread initialization code.
		MapMaster map = new MapMaster();
		blockList=map.getBlockList();
		Random rand = new Random();
		while(characterLocation==null){
			int tmpX = rand.nextInt(500)+100;
			int tmpY = rand.nextInt(400)+100;
			if(validLocation(new Point(tmpX, tmpY))){
				characterLocation = new Point(tmpX, tmpY);
			}
		}
		characterLocation=new Point(rand.nextInt(500), rand.nextInt(500));
		System.out.println("This thread has started: "+Thread.currentThread());
		MoveCharacter characterData = new MoveCharacter();
		fillTheFilledList();//This method fills a list of the filled places by the walls.
		fillEnemyList();//This method will fill the map with enemies fillTheFilledList must be run before this.
		
		Point updatedCharacterLocation;//This variable is used to test if the new character location is on top of a wall or not.
		while(true){
			//All update code goes here
			updatedCharacterLocation=characterData.p1Move((Point) characterLocation.clone(),(ArrayList<String>) keysHeld.clone());
			if(validLocation(updatedCharacterLocation)){
				characterLocation=updatedCharacterLocation;
			}
			moveEnemies();//Updates the location of all the enemies.
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
	
	/**
	 * Returns true if the location of the object is valid false otherwise
	 * @param pt Objects point
	 * @return true if valid location, false otherwise
	 */
	public boolean validLocation(Point pt){
		//method that checks all needed point on a component box to make sure that there is not a wall there.
		return (!filledList[pt.x+10][pt.y+10]);
	}
	
	private static void fillEnemyList(){
		Random rand = new Random();
		int tmpX;
		int tmpY;
		for(int i=0; i<20; i++){
			tmpX=rand.nextInt(800);
			tmpY=rand.nextInt(600);
			if(!filledList[tmpX][tmpY]){
				Enemy tmpEnemy = new Enemy();
				tmpEnemy.epositionx=tmpX;
				tmpEnemy.epositiony=tmpY;
				listOfEnemies.add(tmpEnemy);
			}else{
				i--;
			}
		}
	}
	
	private static void moveEnemies(){
		ListIterator<Enemy> itr = listOfEnemies.listIterator();
		while(itr.hasNext()){
			Enemy tmpEnemy = itr.next();
			tmpEnemy.update(new Point(tmpEnemy.getenemyx(), tmpEnemy.getenemyx()));
		}
	}

}
