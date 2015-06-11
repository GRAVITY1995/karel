import stanford.karel.*;

//turnLeft()
//move()
//pickBeeper()
//putBeeper()


//hasBeepers()
//frontIsClear()
//rightIsClear()
//leftIsClear()

public class YoungKarel extends Karel {
	public void run() {
		
		if(!frontIsClear() || (frontIsClear() && leftIsClear() && rightIsClear())) {
			turnLeft();
		}
		
		for (int i = 0; i < 4; i++ ) {
			while(frontIsClear()) {
				move();
			}
			
			//this code will run only after our while loop has stopped
			if (leftIsClear()) {
			    turnLeft();
			} else {
				turnRight();
			}
		}
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public Boolean backIsClear() {
		Boolean isClear = false;
		turnLeft();
		
		if(leftIsClear()) {
			isClear = true;
		}
		
		turnRight();
		return isClear;
	}
}









