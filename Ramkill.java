
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.*;



import java.awt.*;
import static robocode.util.Utils.normalRelativeAngleDegrees;

//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Ramkill - a robot by (your name here)
 */
public class Ramkill extends Robot
{
		int gotHit;
		int turnDirection = 1; // Clockwise or counterclockwise
		public boolean hitWall = false;

	/**
	 * run: Spin around looking for a target
	 */
	public void run() {
		// Set colors
		setBodyColor(Color.red);
		setGunColor(Color.red);
		setRadarColor(Color.red);
//turnRight(normalRelativeAngleDegrees(0 - getHeading()));
		while (true) {
		 
	
		 back(150);
		 turnRight(90);
		  back(150);
	}}


		public void onHitByBullet(HitByBulletEvent e) {	
		gotHit ++;
		//System.out.println(gotHit);
	}
	/**
	 * onScannedRobot:  We have a target.  Go get it.
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
			fire(3);
			
	}

	/**
	 * onHitRobot:  Turn to face robot, fire hard, and ram him again!
	 */
		public void onHitWall(HitWallEvent e) {

//EDIT HERE		
//System.out.println(getY()+" " + getX());
		if(getX() > 230 && getY() == 582 ){
		//System.out.println("greater than 550");
		//System.out.println(getY()+" " + getX());
		turnRight(90);
		ahead(40);
		}
		
		if(getY() == 582){
		//	turnRight(normalRelativeAngleDegrees(270 - getHeading()));
			//System.out.println("dyinggg "+getHeading());
			return;
		}
		
	
		if(getX()> getBattleFieldWidth()*.5){
		
	    turnRight(normalRelativeAngleDegrees(0 - getHeading()));
		//System.out.println("left");
		}else{

			turnRight(normalRelativeAngleDegrees(90 - getHeading()));
			}

	}	
	public void onHitRobot(HitRobotEvent e) {
	//System.out.println("hit a robit");
	}
	
	}
