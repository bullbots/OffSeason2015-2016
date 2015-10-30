import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;


/**
 * @author Tyler
 *
 */
public class MapMaster {
	private static int mapDensity=50;
	private final static int MAX_X_DIST=800;
	private final static int MAX_Y_DIST=600;
	private static boolean[][] occupiedArray = new boolean[600][800];
	LinkedList<MapBlock> blocks= new LinkedList<MapBlock>();
	
	/**
	 * 
	 * @return returns a list that is filled with objects of type MapBlock.
	 */
	public LinkedList<MapBlock> getBlockList(){
		fillList(blocks);
		return blocks;
	}
	
	private static void fillList(LinkedList<MapBlock> blocks){
		int downOrUp;
		Random rand = new Random();
		blocks.add(new MapBlock(new Point(0,0), MAX_X_DIST, 10 ));
		blocks.add(new MapBlock(new Point(0,0), 10, MAX_Y_DIST));
		blocks.add(new MapBlock(new Point(0, MAX_Y_DIST-10), MAX_X_DIST, 10));
		blocks.add(new MapBlock(new Point(MAX_X_DIST-10,0), 10, MAX_Y_DIST));
		for(int i=0; i<mapDensity;i++){
			downOrUp=rand.nextInt(99)+1;
			if(downOrUp<=50){
				blocks.add(new MapBlock(new Point(rand.nextInt(800), rand.nextInt(600)), 10, 100));
			}else{
				blocks.add(new MapBlock(new Point(rand.nextInt(800), rand.nextInt(600)), 100, 10));
			}
		}
	}

	/**
	 * @return the array with occupied data
	 */
	public boolean[][] getOccupiedArray() {
		return occupiedArray;
	}

	private static void fillOccupiedArrayIndex(Point start,int numX, int numY){
		
	}
}
