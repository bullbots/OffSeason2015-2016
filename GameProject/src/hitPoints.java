import java.util.ArrayList;

public class hitPoints {
	
	public static void updateHealth()
	{
		
				
	}

	public static ArrayList checkHits() 
	{
		ArrayList<String> wasHit = new ArrayList<String>();
		for (int x = GameUpdater.listOfEnemies.size(); x < 0; x--)
		{
			if (GameUpdater.listOfBullets.contains(GameUpdater.listOfEnemies.get(x)))
			{
				wasHit.add(x + "enemy");
			}
		}
		if (GameUpdater.listOfBullets.contains(GameUpdater.characterLocation))
			{
				wasHit.add("player");
			}
		return wasHit;
	}
}
