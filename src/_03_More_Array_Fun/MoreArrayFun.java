package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] words = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		printString(words);
		
		reversePrint(words);
		
		everyOtherString(words);
		
		randomPrint(words);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printString(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reversePrint(String[] words) {
		//-1 for the first string to work
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[words.length - 1 - i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOtherString(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 1) {
				System.out.println(words[i]);
			}
			else {
		
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomPrint (String[] words) {
		Random r = new Random();
		
		for (int i = 0; i < words.length; i++) {
			int random = r.nextInt(words.length);
			System.out.println(words[random]);
		}
		
		
	}
	
}
