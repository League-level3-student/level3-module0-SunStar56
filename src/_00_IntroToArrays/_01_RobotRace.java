package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	//2. create an array of 5 robots. DONE
	//3. use a for loop to initialize the robots. DONE
	//4. make each robot start at the bottom of the screen, side by side, facing up DONE
	//5. use another for loop to iterate through the array and make each robot move 
	 //  a random amount less than 50. DONE
	public static void main(String[] args) {
		Robot[] bots = new Robot[5];
		Random r = new Random();
		boolean finished = false;
		
		for (int i = 0; i < bots.length; i++) {
			bots[i] = new Robot();
			bots[i].setSpeed(10);
			bots[i].moveTo(i*150+150, 500);
		}
		
		while (finished == false) {
			for (int i = 0; i < bots.length; i++) {
				bots[i].move(r.nextInt(10));
				if (bots[i].getY() <  0) {
					finished = true;
					System.out.println("Bot " + (i + 1) + " won!  *V*");
				}
			}
		}
		
	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

		}	

