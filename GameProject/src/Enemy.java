import java.awt.Point;

public class Enemy {
	int epositionx, epositiony;
	public int getenemyx(){
		return epositionx;
	}
	public int getenemyy(){
		return epositiony;
	}
	char enemy;
	int enemyLife;
	int enemyMaxlife;{
		enemyMaxlife = 10;
		enemyLife = enemyMaxlife;}

	public Point update(Point enemyLocation){
		if(epositionx > 300){
			epositionx = epositionx + 5;
		}
		if(epositiony < 500){
			epositiony = epositiony + 8;
		}  
		if(epositionx < 300){
			epositionx = epositionx -8;
		}
		if(epositiony > 500){
			epositiony = epositiony -5;
		}
		if(enemyLife == 0){
					}
		return enemyLocation;
	}
}

