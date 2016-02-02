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
	public int gotHit,hit,corner;

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
	
			
			if(!inCorner())
				goCorner();
			scan();
		
			
	}}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		
		if(e.getDistance() < 80 && e.getEnergy() < 15){
		return;
		}
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
			if (getX() < getBattleFieldWidth() - padding && getY() < getBattleFieldHeight()-padding){
				System.out.println("Top right " + getX() + " " + getY());
				if(getRadarHeading() != 90){
				System.out.println();
				}
				return false;
			}
		}
		
		
		if (getX()>= halfWidth && getY() <= halfHeight){
			if (getX() < getBattleFieldWidth() - padding && getY() > padding){
				System.out.println("lower right");
				return false;
			}
		}
		//System.out.println("We are in a corner");
		return true;
	}

	public void onHitByBullet(HitByBulletEvent e) {	
		 
		
		
		gotHit ++;
		if(e.getHeading()% 90 > 5){
			return;
		}
		double dodgeHeading  = e.getHeading() + 90;
		dodgeHeading  = dodgeHeading % 360; 
		turnDodge(dodgeHeading);
		System.out.println("heading of bullet = " + e.getHeading());
		System.out.println("dodging" + dodgeHeading);
		
		
		
		
		



     
	 
}
	public void turnDodge( double heading) {
		
		if(heading - getHeading() < 5){
			ahead(75);
			back(75);
		}
		if((heading - (getHeading() +180) % 360) < 5){
			
			back(75);
			ahead(75);
		}
	/*	if (heading - getHeading() < 180 && heading - getHeading() > 0){
			System.out.println("right");
			double turn =  heading - getHeading();
			turnRight(turn);
		}else{
						System.out.println("left");
		
			double turn = (360 + getHeading()) - heading;
			turn = turn % 360;
			turnLeft(turn);
		}*/

	}
	public void goCorner(){
		
		

	double gunH = 0;
		System.out.println("going corner");
		//Top left
		if (getX()< halfWidth && getY() > halfHeight){
			turnRight(normalRelativeAngleDegrees(0 - getHeading()));
			//System.out.println("top left");
			gunH = 270;
			corner = 1;
			}
		
		//Bottom left
		if (getX() < halfWidth && getY()<halfHeight){
			turnRight(normalRelativeAngleDegrees(270 - getHeading()));
			gunH = 180;
		}
		
		//Top right 
		if (getX() >= halfWidth && getY()>=halfHeight){
			turnRight(normalRelativeAngleDegrees(90 - getHeading()));
			gunH = 0;
		}
		
		//Bottom right
		if (getX() > halfWidth && getY()<halfHeight){
			turnRight(normalRelativeAngleDegrees(180 - getHeading()));
			gunH = 90 ; 
		}
		
		turnGunRight(normalRelativeAngleDegrees(gunH - getGunHeading()));
		ahead(5000);
		turnLeft(90);
		ahead(5000);
		//turnGunLeft(90);
		//turnRadarLeft(0);
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
