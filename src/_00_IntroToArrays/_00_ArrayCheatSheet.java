package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		System.out.println("Step 1");
			String[] numbers = {"10", "20", "30", "40", "50"};
			
		//2. print the third element in the array
		System.out.println("Step 2");
			System.out.println(numbers[2]);
			
		//3. set the third element to a different value
		System.out.println("Step 3");
			numbers[2] = "300";
			
		//4. print the third element again
		System.out.println("Step 4");
			System.out.println(numbers[2]);
			
		//5. use a for loop to set all the elements in the array to a string of your choice
		System.out.println("Step 5");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = "a number";
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println("Step 6");
			for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
		//7. make an array of 50 integers
		System.out.println("Step 7");
			int[] age = new int[50];
			
		//8. use a for loop to make every value of the integer array a random number
		System.out.println("Step 8");
			Random r = new Random();
		
			for (int i = 0; i < age.length; i++) {
				age[i] = r.nextInt(100);
			}
			
		//9. without printing the entire array, print only the smallest number on the array
		System.out.println("Step 9");
			int smallestNum = 50;
			
			for (int i = 0; i < age.length; i++) {
				if (age[i] < smallestNum) {
					System.out.println("less  " + age[i]);
					smallestNum = age[i];
				}
				else {
					System.out.println("more  " + age[i]);
				}
			}
		
						System.out.println(smallestNum + " Smallest");
			
		//10 print the entire array to see if step 8 was correct
		System.out.println("Step 10");
			for (int i = 0; i < age.length; i++) {
				System.out.println(age[i]);
			}
			
		//11. print the largest number in the array.
		System.out.println("Step 11");
			int largestNum = 0;
			
			for (int i = 0; i < age.length; i++) {
				if (age[i] > largestNum) {
					System.out.println("More  " + age[i]);
					largestNum = age[i];
				}
				else {
					System.out.println("Less  " + age[i]);
				}
				
			}
			System.out.println(largestNum + " Largest");
			
		//12. print only the last element in the array
		System.out.println("Step 12");
			System.out.println(age[age.length-1]);
	}
}
