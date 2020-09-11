/*******************************
*DigitalRoot
********************************
*Project 2 - Digital root of 9
*Christina Joseph
*Sept 10 2020
*CMSC255, 001
********************************/

import java.util.Scanner;

public class DigitalRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/* Prompt user to enter 0 or 1 if they want to input a number or have a random number 
		generated for them. */
		System.out.print("Enter 0 if you would like to enter a number between 1 " + 
			"and 999999. Enter 1 if you would like to have the computer generate it.");
		int yourChoice = input.nextInt();


		/* Direct the response of the previous code. If the user presses 0, then they are 
		allowed to enter another number between 1 and 999999. */
		if (yourChoice == 0) {
			System.out.println("Enter the number between 1 and 999999: ");
			int anyNum = input.nextInt();

			//if anyNum is anything other than a number between 1 to 999999, it is incorrect input
			if (anyNum < 1) {
				System.out.println("Incorrect input");
			}
			else if (anyNum > 999999) {
				System.out.println("Incorrect input");
			}

			// State whether anyNum has a digital root of 9 by seeing if it has a remainder of 0.
			else {

				if (anyNum % 9 == 0) {
					System.out.println(anyNum + " has a digital root of 9");
				}
				else {
					System.out.println(anyNum + " does not have a digital root of 9");
				}
			}

		}
		

		/* Direct the response of the previous code. If user presses 1, then the computer 
		will generate a random number between 1 and 999999. */
		else if (yourChoice == 1) {
			int randNum = (int)(Math.random() * 1000000); //OR int randNum = (int)(Math.random() * 999999 + 1)
			System.out.println(randNum); 

			// State whether randNum has a digital root of 9 by seeing if it has a remainder of 0.
			if (randNum % 9 == 0) {
				System.out.println(randNum + " has a digital root of 9");
			}
			else {
				System.out.println(randNum + " does not have a digital root of 9");
			}
			
		}


		//If you enter any other number than 0 or 1 for yourChoice, it is incorrect input
		else {
			System.out.println("Incorrect input");
		}

	}
}