import java.awt.Point;


/**
 * @author Tyler
 *
 */
public class MapBlock 
{
	private Point mapLocation;
	private int length;
	private int width;

	/**
	 * @param position
	 * @param length
	 * @param width
	 */
	@SuppressWarnings("javadoc")
	public MapBlock(Point position, int length, int width){
		setMapLocation(position);
		setLength(length);
		setWidth(width);
	}
	
	/**
	 * @return return the location of the block on the map
	 */
	public Point getMapLocation() {
		return mapLocation;
	}
	private void setMapLocation(Point mapLocation) {
		this.mapLocation = mapLocation;
	}
	/**
	 * @return returns the length of the block.
	 */
	public int getLength() {
		return length;
	}
	private void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return returns the width of the block
	 */
	public int getWidth() {
		return width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
}
