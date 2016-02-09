import robocode.*;
import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngleDegrees;

/****************************************************************************
 * Wallace - a robot by Lauren Mills,, Kyle Niewiada, and Alex Stuart
 ****************************************************************************/
public class Wallace extends Robot
{
	public double halfWidth,halfHeight;
	public int hit,corner;
	public boolean firstScan = false;
	/****************************************************************************
	 * Runs Wallace's default behavior 
 	****************************************************************************/
	public void run() {
		//get Height and width of battle field
		halfWidth = .5 * getBattleFieldWidth();
 		halfHeight = .5 * getBattleFieldHeight();
 		
	    // Set colors
		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.red);
		setBulletColor(Color.red);
		setScanColor(Color.red);
		
		// 360 scan to find walls bearing and move opposite direction(inside scanned robot)
		turnRadarRight(360);
 	
		goCorner(); // in the opposite heading 
		
		// Robot main loop
		while(true) {
			if(!inCorner()){
				goCorner();
			}
		scan(); // make a radar sweeping method to scan that 90* 
			
		}
	}

	/****************************************************************************
	 * When Wallace scans an opponent he shoots if appropriate
 	****************************************************************************/
	public void onScannedRobot(ScannedRobotEvent e) {
		
		//after the inital scan determine what quadurant we have spawned in and 
		//head to the closest wall
		if(!firstScan){
		
			int quad = (int) e.getHeading() /90;
			double opponentHeading = quad * 90.0;
			turn((opponentHeading + 180)% 360);
			ahead(400);//move ahead until hitting a wall,then go to corner
		}
		
		//If walls is close and has low energy and avoid firing to avoid 
		//walls going into his disabled path
		if(e.getDistance() < 150 && e.getEnergy() < 20){
		System.out.println("not firing");
		return;
		}
		
		//fire 5 if walls is scanned
		if(firstScan)
		fire(5);
		firstScan = true;
	
	}

	/****************************************************************************
	 * The inCorner method determines if Wallace has made it to a corner
	 * and returns a corresponding boolean value
 	****************************************************************************/
	public boolean inCorner(){
		
		//sets padding to the size of Wallace
		int padding = 21;
	
        //Determines wallace needs to be in the top left corner but is not
		if (getX()< halfWidth && getY() > halfHeight){
			if (getX() > padding && getY() < getBattleFieldHeight()-padding){
				return false;		
			}
		}
        
		//Determines wallace needs to be in the lower left corner but is not
		if (getX()< halfWidth && getY() < halfHeight){
			if (getX() > padding && getY() > padding){
				return false;
				
			}
		}
	
		//Determines wallace needs to be in the top right corner but is not
		if (getX()> halfWidth && getY() > halfHeight){
			if (getX() < getBattleFieldWidth() - padding && getY() < getBattleFieldHeight()-padding){
				return false;
			}
		}
		
		//Determines wallace needs to be in the lower right corner but is not
		if (getX()>= halfWidth && getY() <= halfHeight){
			if (getX() < getBattleFieldWidth() - padding && getY() > padding){
				return false;
			}
		}
		
		//Wallace is in a corner
		return true;
	}

	/****************************************************************************
	 * When hit by a bullet dodge
 	****************************************************************************/
	public void onHitByBullet(HitByBulletEvent e) {	
		
		if(e.getHeading()% 90 > 5){
			return;
		}
		//Determine the robots heading to determine what way to dodge
		double dodgeHeading  = e.getHeading() + 90;
		dodgeHeading  = dodgeHeading % 360; 
		turnDodge(dodgeHeading);
	}
	
	/****************************************************************************
	 * This method determines which direction we dodge based on dodgeHeading
 	****************************************************************************/
	public void turnDodge( double heading) {
		
		if(heading - getHeading() < 5){
			ahead(75);
			back(75);
		}
		
		if((heading - (getHeading() +180) % 360) < 5){
			
			back(75);
			ahead(75);
		}
	}
	
	/****************************************************************************
	 * This method determines which direction to turn at the begining of the
	 * battle
 	****************************************************************************/
	public void turn (double heading){
		if (heading - getHeading() < 180 && heading - getHeading() > 0){
			//System.out.println("right");
			double turn =  heading - getHeading();
			turnRight(turn);
		}else{
						//System.out.println("left");
		
			double turn = (360 + getHeading()) - heading;
			turn = turn % 360;
			turnLeft(turn);
		}
	}
	
	/****************************************************************************
	 * This method determines which corner to go to and moves wallace to the
	 * appropriate corner
 	****************************************************************************/
	public void goCorner(){
		
		

	double gunH = 0;
	
		//Top left
		if (getX()< halfWidth && getY() > halfHeight){
			turnRight(normalRelativeAngleDegrees(0 - getHeading()));
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
		
		//move to corner
		turnGunRight(normalRelativeAngleDegrees(gunH - getGunHeading()));
		ahead(5000);
		turnLeft(90);
		ahead(5000);
	}
	
	/****************************************************************************
	 * If wallace hits a robot fire
 	****************************************************************************/
	public void onHitRobot(HitRobotEvent e) {
		fire(3);
	}
	
	/****************************************************************************
	 * If wallace hits a wall move back 3
 	****************************************************************************/
	public void onHitWall(HitWallEvent e) {
		back(3);
	}	
	
}