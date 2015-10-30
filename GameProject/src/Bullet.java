
public class Bullet {
	double direction = Math.PI*3/2;
	
	//double will eventually be taken from User Input class
	double magnitude = 7;
	int bY = 45;
	int bX = 55;
	
	public Boolean fired(){
		
		//check if the bullet is fired, idk what this will be helpful for.
		return true;
	}
	
	public int bMoveY(){
		double yComponent = Math.sin(direction);
		bY = (int)(yComponent * magnitude) + bY;
		return bY;
	}
	
	public int bMoveX(){
		double xComponent = Math.sin(direction);
		bX = (int)(xComponent * magnitude) + bX;
		return bX;
	}
	
	
}
