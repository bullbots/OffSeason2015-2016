import java.awt.Point;
import java.util.ArrayList;

public class MoveCharacter {
	
	public double velocity = 4;
	public double currentDirection = 0;
	
	public Point p1Move(Point location, ArrayList<String> keys){
		int p1Y = (int)location.getY();
		int p1X = (int)location.getX();
		int newY = p1Y;
		int newX = p1X;
		
		if(keys.contains("w")||keys.contains("s")||keys.contains("d")||keys.contains("a")){
			magnitude();
			direct(keys);
		}else{
			magnitudeLess();
		}
		
		newX = p1MoveX(p1X, currentDirection);
		newY = p1MoveY(p1Y, currentDirection);
		
		
		location.setLocation(newX,newY);
		if(!GameUpdater.validLocation(location)){
			location.setLocation(p1X,newY);
			if(!GameUpdater.validLocation(location)){
				location.setLocation(newX, p1Y);
				if(!GameUpdater.validLocation(location)){
					location.setLocation(p1X, p1Y);
				}
			}
		}
		
		
		return location;
	}
	
	public void direct(ArrayList<String> keys){
		double input = getDirection(keys);
		
		if(Math.abs(input - currentDirection)< Math.PI){
			currentDirection = input * .2 + currentDirection *  .8;
		}else{
			currentDirection = input;
		}
		
	}
	
	public void magnitude(){
		
		if(velocity < 4){
			velocity = velocity + .4;
		}
		
		
	}
	public void magnitudeLess(){
		
		if(velocity>0){
			velocity = velocity - .4;
		}
		
		
	}
	
	public int p1MoveY(int p1Y, double direction){
		double yComponent = Math.sin(direction);
		p1Y = (int)(yComponent * velocity) + p1Y;
		return p1Y;
	}
	
	
	public int p1MoveX(int p1X, double direction){
		double xComponent = Math.cos(direction);
		p1X = (int)(xComponent * velocity) + p1X;
		return p1X;
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
	
}
