import java.awt.Point;


/**
 * @author Tyler
 *
 */
public class MapBlock 
{
	private Point mapLocation;
	private int lengthX;//Consider this distance along the x axis
	private int widthY;//Consider this the distance along the y axis

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
	 * @return returns the length of the block, the length should be considered the length along the x axis
	 */
	public int getLength() {
		return lengthX;
	}
	private void setLength(int length) {
		this.lengthX = length;
	}
	/**
	 * @return returns the width of the block, the width should be considered the length along the y axis
	 */
	public int getWidth() {
		return widthY;
	}
	private void setWidth(int width) {
		this.widthY = width;
	}
}
