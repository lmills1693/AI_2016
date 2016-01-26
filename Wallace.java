package ai365;
import robocode.*;

import java.awt.Color;




// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Wallace - a robot by (your name here)
 */
public class Wallace extends Robot
{
	
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
		
	}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
	
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {	
		

     
	 
	}
		public void goCorner() {
		// We don't want to stop when we're just turning...
		//stopWhenSeeRobot = false;
		// turn to face the wall to the "right" of our desired corner.
		
		System.out.println("1: " + getX());
		System.out.println("2: " + getBattleFieldWidth());
		if(getX() < (.5 * getBattleFieldWidth())){
			if(getY() < (.5 * getBattleFieldHeight())){
				//bottom left
				
				while(getHeading() != 0){
				turnLeft(1);
				
				
				}
			}
			else{
				//top left
			}
		}else{
			if(getY() < (.5 * getBattleFieldHeight())){
				//bottom right
			}
			else{
				//top right
			}
		}
			
	
}
	
public void onHitRobot(HitRobotEvent e) {
	//back(500);
getEnergy();
fire(2);	


}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(3);
	}	
	
	
}
