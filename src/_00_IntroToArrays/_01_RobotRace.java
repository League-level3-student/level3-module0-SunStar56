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
			int version = 2;
			//setup
		if (version == 1) {
			for (int i = 0; i < bots.length; i++) {
				
				bots[i].moveTo(200 * i + 50, 500);
			}
				while (bots[1].getY() > 0 && bots[2].getY() > 0 && bots[3].getY() > 0 && bots[4].getY() > 0 && bots[5].getY() > 0) {
					
				 {	
					for (int j = 0; j < bots.length; j++) {
						bots[j].move(r.nextInt(50));
						if (bots[j].getY() <= 0) {
							System.out.println("Bot "+(j + 1) +" won!");
						}
						}
					}
				}
		}
		
		if (version == 2) {
			Robot[] bots2 = new Robot[2];
			Random r2 = new Random();
			for (int i = 0; i < bots.length; i++) {
				bots2[i] = new Robot();
				bots2[i].setSpeed(10);
				bots2[i].moveTo(200, 500 + i*50);
			}
		}
		
				
					
				
			
		
		}
		
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

		}	

