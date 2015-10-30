import java.awt.Point;
import java.util.LinkedList;


/**
 * @author Tyler
 *
 */
public class MapMaster {
	private static int mapDensity=50;
	private final static int MAX_X_DIST=600;
	private final static int MAX_Y_DIST=800;
	private static boolean[][] occupiedArray = new boolean[800][600];
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
		blocks.add(new MapBlock(new Point(0,0), MAX_X_DIST, 10 ));
		blocks.add(new MapBlock(new Point(0,0), 10, MAX_Y_DIST));
		blocks.add(new MapBlock(new Point(0, MAX_Y_DIST-10), MAX_X_DIST, 10));
		blocks.add(new MapBlock(new Point(MAX_X_DIST-10,0), 10, MAX_Y_DIST));
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
