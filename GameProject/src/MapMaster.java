import java.awt.Point;
import java.util.LinkedList;


/**
 * @author Tyler
 *
 */
public class MapMaster {
	private static int mapDensity=50;
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
		blocks.add(new MapBlock(new Point(0,0), 10, 800));
		fillOccupiedArrayIndex(new Point(0,0), 10, 800);
		blocks.add(new MapBlock(new Point(0,0), 600, 10));
		fillOccupiedArrayIndex(new Point(0,0), 600, 10);
		blocks.add(new MapBlock(new Point(790,0),600, 10 ));
		fillOccupiedArrayIndex(new Point(790,0),600, 10 );
		blocks.add(new MapBlock(new Point(0,590),800, 10));
		fillOccupiedArrayIndex(new Point(0,590),800, 10);
		for(int i=0; i<mapDensity; i++){
			
		}
	}

	/**
	 * @return the array with occupied data
	 */
	public boolean[][] getOccupiedArray() {
		return occupiedArray;
	}

	private static void fillOccupiedArrayIndex(Point start,int numX, int numY){
		int startX=start.x;
		int startY=start.y;
		for(int i=0; i<numX; i++){
			for(int j=0; j<numY; j++){
				occupiedArray[i][j] =true;
			}
		}
	}
}
