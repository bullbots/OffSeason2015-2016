import java.awt.Point;
import java.util.ArrayList;

public class Bullet {
	int x = 0;
	int y = 0;
	boolean isFired = false;
	double speed = 0;
	double dir = 0;
	
	public void init(Point location, ArrayList<String> keys, double velocity, double direction){
		y = (int)location.getY();
		x = (int)location.getX();
		
		int ycomp = (int)(Math.sin(direction) * velocity);
		int xcomp = (int)(Math.cos(direction) * velocity);
		boolean isFired = true;
		
		if(keys.contains("up")){
			ycomp = ycomp - 10;
		}if(keys.contains("right")){
			xcomp = xcomp + 10;
		}if(keys.contains("down")){
			ycomp = ycomp + 10;
		}if(keys.contains("left")){
			xcomp = xcomp - 10;
		}
		dir = Math.atan(ycomp/xcomp);
		speed = Math.sqrt(ycomp^2 + xcomp^2);
	}
	
	public Point moveBullet(Point location){
		
		x = bulletMoveX(x, dir);
		y = bulletMoveY(y, dir);
		location.setLocation(x,y);
		
		return location;
	}
	
	
	public int bulletMoveY(int Y, double direction){
		double yComponent = Math.sin(direction);
		Y = (int)(yComponent * speed) + Y;
		return Y;
	}
	public int bulletMoveX(int X, double direction){
		double xComponent = Math.cos(direction);
		X = (int)(xComponent * speed) + X;
		return X;
	}
}
