import java.awt.Point;
import java.util.Random;

public class Enemy {
	private Point enemyLocation;
	private int currentDir;
	int lifePoint=100;
	//There are 8 moveble directions for the enemies
	//1 North
	//2 NorthEast
	//3 East
	//4 SouthEast
	//5 South
	//6 SouthWest
	//7 West
	//8 Northwest
	public void update(Point enemyLocation){
		Point characterLocation = GameUpdater.characterLocation;
		Point tmpEnemyLocation= enemyLocation;
		if(tmpEnemyLocation.x-characterLocation.x<=0){
			//Then character is in quadrent 1 or 4
			if(tmpEnemyLocation.y-characterLocation.y<=0){
				//Then character is in quadrent 4
				//will only move direction 3, 4 or 5
				if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x+1, tmpEnemyLocation.y+1))){
					currentDir=4;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x+1, tmpEnemyLocation.y))){
					currentDir=3;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x, tmpEnemyLocation.y+1))){
					currentDir=5;
				}
				
			}else{
				//Then character is in quadrent 1
				//will only move direction 1, 2 or 3
				if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x, tmpEnemyLocation.y-1))){
					currentDir=1;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x+1, tmpEnemyLocation.y-1))){
					currentDir=2;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x+1, tmpEnemyLocation.y))){
					currentDir=3;
				}
			}
		}else{
			//Then character is in quadrent 2 or 3
			if(tmpEnemyLocation.y-characterLocation.y<=0){
				//Then the character is in quadrent 3
				//will only move direction 5, 6 or 7
				if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x, tmpEnemyLocation.y+1))){
					currentDir=5;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x-1, tmpEnemyLocation.y+1))){
					currentDir=6;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x-1, tmpEnemyLocation.y))){
					currentDir=7;
				}
			}else{
				//Then the character is in quadrent 2
				//will only move direction 6, 7 or 8
				if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x-1, tmpEnemyLocation.y))){
					currentDir=6;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x-1, tmpEnemyLocation.y-1))){
					currentDir=7;
				}else if(GameUpdater.validLocation(new Point(tmpEnemyLocation.x, tmpEnemyLocation.y-1))){
					currentDir=8;
				}
			}
		}
		
		//Now we can actually move the characterd
		switch(currentDir){
		case 1:
			this.enemyLocation = new Point(enemyLocation.x, enemyLocation.y-1);
			break;
		case 2:
			this.enemyLocation = new Point(enemyLocation.x+1, enemyLocation.y-1);
			break;
		case 3:
			this.enemyLocation = new Point(enemyLocation.x+1, enemyLocation.y);
			break;
		case 4:
			this.enemyLocation = new Point(enemyLocation.x+1, enemyLocation.y+1);
			break;
		case 5:
			this.enemyLocation = new Point(enemyLocation.x, enemyLocation.y+1);
			break;
		case 6:
			this.enemyLocation = new Point(enemyLocation.x-1, enemyLocation.y+1);
			break;
		case 7:
			this.enemyLocation = new Point(enemyLocation.x-1, enemyLocation.y);
			break;
		case 8:
			this.enemyLocation = new Point(enemyLocation.x-1, enemyLocation.y-1);
			break;
		}
	}


	public Point getEnemyLocation() {
		return enemyLocation;
	}


	public void setEnemyLocation(Point enemyLocation) {
		this.enemyLocation = enemyLocation;
	}


	public int getLifePoint() {
		return lifePoint;
	}


	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
}

