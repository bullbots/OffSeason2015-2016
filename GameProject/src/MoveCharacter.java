import java.awt.Point;
import java.util.ArrayList;


public class MoveCharacter {

	public Point p1Move(Point location, ArrayList<String> keys){
		int p1Y = (int)location.getY();
		int p1X = (int)location.getX();
		if(keys.contains("w")||keys.contains("s")||keys.contains("d")||keys.contains("a")){
			p1X = p1MoveX(p1X, getDirection(keys));
			p1Y = p1MoveY(p1Y, getDirection(keys));
		}
		
		location.setLocation(p1X,p1Y);
		
		return location;
	}
	
	public double getDirection(ArrayList<String> keys){
		double direction = 0;
		if (keys.contains("w") && keys.contains("a") != true && keys.contains("s") != true && keys.contains("d") != true){
			direction = 3*Math.PI/2;
		}if (keys.contains("a") && keys.contains("w") != true && keys.contains("s") != true && keys.contains("d") != true){
			direction = Math.PI;
		}if (keys.contains("s") && keys.contains("a") != true && keys.contains("w") != true && keys.contains("d") != true){
			direction = Math.PI/2;
		}if (keys.contains("d") && keys.contains("a") != true && keys.contains("w") != true && keys.contains("s") != true){
			direction = 0;
		}if (keys.contains("w") && keys.contains("a") && keys.contains("s") != true && keys.contains("d") != true){
			direction = 5*Math.PI/4;
		}if (keys.contains("w") && keys.contains("d") && keys.contains("s") != true && keys.contains("a") != true){
			direction = 7*Math.PI/4;
		}if (keys.contains("s") && keys.contains("a") && keys.contains("w") != true && keys.contains("d") != true){
			direction = 3*Math.PI/4;
		}if (keys.contains("s") && keys.contains("d") && keys.contains("w") != true && keys.contains("a") != true){
			direction = Math.PI/4;
		}
		
		return direction;
	}
	
	
	
	
	public int p1MoveY(int p1Y, double direction){
		//finds the amount of movement in the Y direction
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
	
	
	public int p1MoveX(int p1X, double direction){
		//finds the amount of movement in the X direction
		double magnitude = 2;
		//double will eventually be taken from User Input class
		
		double xComponent = Math.cos(direction);
		boolean canStepX = true;
		//canStepY depends on map
		if (canStepX = true){
			p1X = (int)(xComponent * magnitude) + p1X;
		}
		return p1X;
	}	
}
