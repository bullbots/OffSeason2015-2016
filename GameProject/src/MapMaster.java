import java.awt.Point;
import java.util.LinkedList;


/**
 * @author Tyler
 *
 */
public class MapMaster {
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
		blocks.add(new MapBlock(new Point(0,0), 600, 10));
	}
}
