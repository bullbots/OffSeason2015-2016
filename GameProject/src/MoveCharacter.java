public class MoveCharacter {
	int p1X = 50;
	int p1Y = 45;

	
	public int p1MoveY(){
		//finds the amount of movement in the Y direction
		
		double direction = Math.PI*3/2;
		//double will eventually be taken from User Input class
		double magnitude = 2;
		//double will eventually be taken from User Input class
		
		double yComponent = Math.sin(direction);
		boolean canStepY = true;
		//canStepY depends on map
		if (canStepY = true){
			p1Y = (int)(yComponent * magnitude) + p1Y;
		}
		return p1Y;
	}
	
	public int p1MoveX(){
		//finds the amount of movement in the X direction
		
		double direction = Math.PI*3/2;
		//double will eventually be taken from User Input class
		double magnitude = 2;
		//double will eventually be taken from User Input class
		
		double xComponent = Math.cos(direction);
		boolean canStepX = true;
		//canStepX depends on map
		if (canStepX = true){
			p1X = (int)(xComponent * magnitude) + p1X;
		}
		return p1X;
	}
	
}
