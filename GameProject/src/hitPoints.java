import java.util.ArrayList;

public class hitPoints {
	
	public static void updateHealth()
	{
		
	}

	public static ArrayList<String> checkHits() 
	{
		ArrayList<String> wasHit = new ArrayList<String>();
		for (int y = 0; y == GameUpdater.listOfBullets.size() - 1; y++)
		{
			for (int x = 0; x == GameUpdater.listOfEnemies.size() - 1; x++)
			{
				if (GameUpdater.listOfEnemies.get(x).getEnemyLocation() == GameUpdater.listOfBullets.get(y).getBulletLocation())
				{
					wasHit.add(x + "enemy");
				}
			}
		}
		if (GameUpdater.listOfBullets.contains(GameUpdater.characterLocation))
			{
				wasHit.add("player");
			}
		}
		
		return wasHit;
	}
}
