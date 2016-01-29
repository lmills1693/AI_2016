import robocode.*;

import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngleDegrees;



// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Wallace - a robot by (your name here)
 */
public class Wallace extends Robot
{

	public double halfWidth,halfHeight;

	/**
	 * run: Wallace's default behavior
	 */
	public void run() {
		halfWidth = .5 * getBattleFieldWidth();
 		halfHeight = .5 * getBattleFieldHeight();
	    // Set colors
		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.red);
		setBulletColor(Color.red);
		setScanColor(Color.red);
		
 		goCorner();

		// Robot main loop
		while(true) {
	
			ahead(30);
			if(!inCorner())
				goCorner();
		
		
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(5);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	
// ADD EQUALLLLLLL
	public boolean inCorner(){
		int padding = 21;
		
		
		if (getX()< halfWidth && getY() > halfHeight){
			if (getX() > padding && getY() < getBattleFieldHeight()-padding){
				System.out.println("Top Left");
				return false;
				
			}
		}
        
		
		if (getX()< halfWidth && getY() < halfHeight){
			if (getX() > padding && getY() > padding){
				System.out.println("Lower Left");
				return false;
				
			}
		}
	
		if (getX()> halfWidth && getY() > halfHeight){
			if (getX() <= getBattleFieldWidth() - padding && getY() <= getBattleFieldHeight()-padding){
				System.out.println("Top right ");
				return false;
			}
		}
		
		
		if (getX()>= halfWidth && getY() <= halfHeight){
			if (getX() < getBattleFieldWidth() - padding && getY() > padding){
				System.out.println("lower right");
				return false;
			}
		}
		System.out.println("We are in a corner");
		return true;
	}

	public void onHitByBullet(HitByBulletEvent e) {	
		 
	if(inCorner())
		back(70);	
		

		
		System.out.println(getX() + "  " + getY());

		
		//if (e.getBearing() > -95 && e.getBearing() < 0 ){
		//ahead(200);
		//}
     
	 
}
	public void goCorner(){
		getCorner();
		ahead(5000);
		turnLeft(90);
		ahead(5000);
		turnGunLeft(90);
		turnRadarLeft(0);

	}
	public void getCorner() {
		
		//Top left
		if (getX()< halfWidth && getY() > halfHeight){
			turnRight(normalRelativeAngleDegrees(0 - getHeading()));
			}
		
		//Bottom left
		if (getX() < halfWidth && getY()<halfHeight){
			turnRight(normalRelativeAngleDegrees(270 - getHeading()));
		}
		
		//Top right 
		if (getX() > halfWidth && getY()>halfHeight){
			turnRight(normalRelativeAngleDegrees(90 - getHeading()));
		}
		
		//Bottom right
		if (getX() > halfWidth && getY()<halfHeight){
		}
	}
	
	public void onHitRobot(HitRobotEvent e) {
	
		//back(500);
		getEnergy();
		fire(3);
	}
	
	public void onBulletHit(HitByBulletEvent e){
		

	
	}
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(3);
	}	
	
	
}
