import robocode.*;

import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngleDegrees;



// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Wallace - a robot by (your name here)
 */
public class Wallace extends Robot
{
	private byte moveDirection;
	double halfWidth = .5 * getBattleFieldWidth();
	double halfHeight = .5 * getBattleFieldHeight();
	int gotHit = 0;

	/**
	 * run: Wallace's default behavior
	 */
	public void run() {
	    // Set colors
		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.red);
		setBulletColor(Color.red);
		setScanColor(Color.red);
		
 		goCorner();
		

// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
	
			// Replace the next 4 lines with any behavior you would like
		
		ahead(30);
	/*	int padding = 50;
		//upper left
		if (getX()< halfWidth && getY() > halfHeight){
			if (getX() > padding && getY() < getBattleFieldHeight()-padding){
				goCorner();
			}
		}
        
		//lower left
		if (getX()< halfWidth && getY() < halfHeight){
			if (getX() > padding && getY() > padding){
				goCorner();
			}
		}
		//upper right
		if (getX()> halfWidth && getY() > halfHeight){
			if (getX() < getBattleFieldWidth() - padding && getY() < getBattleFieldHeight()-padding){
				goCorner();
			}
		}
		
		//lower right
		if (getX()> halfWidth && getY() < halfHeight){
			if (getX() < getBattleFieldWidth() - padding && getY() > padding){
				goCorner();
			}
		}
		*/
		
			
		
	
		
	
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
public void onHitByBullet(HitByBulletEvent e) {	
		gotHit ++; 
	//	turnRight(e.getBearing() + 90);	
		moveDirection *= -1;
		back(70);	
		
		if (e.getBearing() < 95 && e.getBearing() > 0 ){
		turnRight(90);	
		}
		
		System.out.println(getX() + "  " + getY());

		
		//if (e.getBearing() > -95 && e.getBearing() < 0 ){
		//ahead(200);
		//}
     
	 
}
	
//moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
public void goCorner() {
			
		
		
		// We don't want to stop when we're just turning...
		//stopWhenSeeRobot = false;
		// turn to face the wall to the "right" of our desired corner.
		
		
		if (getX()< halfWidth && getY() > halfHeight){
			turnRight(normalRelativeAngleDegrees(0 - getHeading()));
			// Ok, now we don't want to crash into any robot in our way...
			//stopWhenSeeRobot = true;
			// Move to that wall
			ahead(5000);
			// Turn to face the corner
			turnLeft(90);
			// Move to the corner
			ahead(5000);
			// Turn gun to starting point
			turnGunLeft(90);
			
			turnRadarLeft(0);
			//turnRadarRight(45);
		}
		if (getX() < halfWidth && getY()<halfHeight){
			turnRight(normalRelativeAngleDegrees(270 - getHeading()));
			ahead(5000);
			// Turn to face the corner
			turnLeft(90);
			
			ahead(5000);
			
			
			// Move to the corner
			//ahead(5000);
			// Turn gun to starting point
			turnGunLeft(90);
			
			turnRadarLeft(0);
			
		}

		if (getX() > halfWidth && getY()>halfHeight){
			turnRight(normalRelativeAngleDegrees(90 - getHeading()));
			ahead(5000);
			// Turn to face the corner
			turnLeft(90);
			
			ahead(5000);
			
			
			// Move to the corner
			//ahead(5000);
			// Turn gun to starting point
			turnGunLeft(90);
			
			turnRadarLeft(0);
				
		}

		if (getX() > halfWidth && getY()<halfHeight){
			turnRight(normalRelativeAngleDegrees(180 - getHeading()));
			ahead(5000);
			// Turn to face the corner
			turnLeft(90);
			
			ahead(5000);
			
			
			// Move to the corner
			//ahead(5000);
			// Turn gun to starting point
			turnGunLeft(90);
			
			turnRadarLeft(0);
			
		}
	}
	
public void onHitRobot(HitRobotEvent e) {
	
//back(500);
getEnergy();
fire(3);	

	//turnLeft(400);
//goCorner();
	//turnGunRight(45);

	
	
	
				
}
	public void onBulletHit(HitByBulletEvent e){
		
	gotHit = 0;
	
	}
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(3);
	}	
	
	
}
