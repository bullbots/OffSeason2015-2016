public class MoveCharacter {
	int p1X = 50;
	int p1Y = 45;

	
	public int p1MoveY(){
		//finds the amount of movement in the Y direction
		
		double direction = Math.PI*3/2;
		//double will eventually be taken from User Input class
		double magnitude = 2;
		//double will eventually be taken from User Input class
		
		double ycom = Math.sin(direction);
		boolean canStepY = true;
		//canStepY depends on map
		if (canStepY = true){
			p1Y = (int)(ycom * magnitude) + p1Y;
		}
		return p1Y;
		
	}
	
	public int p1MoveX(){
		//finds the amount of movement in the X direction
		
		double direction = Math.PI*3/2;
		//double will eventually be taken from User Input class
		double magnitude = 2;
		//double will eventually be taken from User Input class
		
		double xcom = Math.cos(direction);
		boolean canStepX = true;
		//canStepX depends on map
		if (canStepX = true){
			p1X = (int)(xcom * magnitude) + p1X;
		}
		return p1X;
	}
	
}
