import java.util.Random;

public class MapTest {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int minXBound;
		int maxXBound;
		int minYBound;
		int maxYBound;
	
		minXBound = rand.nextInt(1);
		maxXBound = rand.nextInt(800);
		minYBound = rand.nextInt(1);
		maxYBound = rand.nextInt(600);
		
		System.out.println("minXBound: " + minXBound);
		System.out.println("maxXBound: " + maxXBound);
		System.out.println("minYBound: " + minYBound);
		System.out.println("maxYBound: " + maxYBound);
		
		

	}

}
