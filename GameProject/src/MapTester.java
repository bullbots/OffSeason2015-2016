import java.util.Arrays;


/**
 * @author Tyler
 *
 */
public class MapTester {
	/**
	 * @param args cmd line args
	 */
	public static void main(String[]args){
		MapMaster test = new MapMaster();
		boolean [][] test1 = test.getOccupiedArray();
		test.getBlockList();
		System.out.println(Arrays.deepToString(test1));
	}
}
