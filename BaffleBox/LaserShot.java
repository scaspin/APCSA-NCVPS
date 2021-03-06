import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;


public class LaserShot extends MovingScreenObject {
	
	/**
	 * 
	 * @param location location of the projectile
	 * @param size size of the projectile
	 * @param i image of the projectile
	 * @param angle angle the projectile is aiming toward
	 */
	
	public LaserShot(Point location, Rectangle size, Image i, double angle){
		super(location, size, i, angle);
		
		double endX = location.x;
		double endY = location.y;
		
		double newEndX = location.x + (endX - location.x)*Math.cos(Math.toRadians(angle));
		double newEndY = location.y + (endY - location.y)*Math.sin(Math.toRadians(angle));
		
		double changeX = (newEndX - location.x);
		double changeY = (newEndY - location.y);
		vector = new Vector(changeX, changeY);
	}
	
	/**
	 * simulates movement of the projectile
	 */
	public void move() 
		{
			location.x += vector.getChangeX();
			location.y += vector.getChangeY();
		}
		
}