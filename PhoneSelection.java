/*******************
* Christina Joseph
* CMSC 255, 001
* Lab 04 Selection
* Sept 10 2020
********************/

import java.util.Scanner;

public class PhoneSelection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Prompt user to enter a single letter
		System.out.println("Enter a single letter, and I will tell you"
			+ " what the corresponding digit is on the telephone");
		char alphabet = input.next().charAt(0);
		//Take char alphabet and convert it to uppercase letter
		alphabet = Character.toUpperCase(alphabet);

		//if alphabet entered is A, B, or C then it corresponds to digit of 2
		if (alphabet == 'A' || alphabet == 'B' || alphabet == 'C') {
			int digit = 2;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is D, E, or F then it corresponds to digit of 3
		else if (alphabet == 'D' || alphabet == 'E' || alphabet == 'F') {
			int digit = 3;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is G, H, or I then it corresponds to digit of 4
		else if (alphabet == 'G' || alphabet == 'H' || alphabet == 'I') {
			int digit = 4;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is J, K, or L then it corresponds to digit of 5
		else if (alphabet == 'J' || alphabet == 'K' || alphabet == 'L') {
			int digit = 5;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is M, N, or O then it corresponds to digit of 6
		else if (alphabet == 'M' || alphabet == 'N' || alphabet == 'O') {
			int digit = 6;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is P, Q, R, or S then it corresponds to digit of 7
		else if (alphabet == 'P' || alphabet == 'Q' || alphabet == 'R' || alphabet == 'S') {
			int digit = 7;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is T, U, or V then it corresponds to digit of 8
		else if (alphabet == 'T' || alphabet == 'U' || alphabet == 'V') {
			int digit = 8;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if alphabet entered is W, X, Y, or Z then it corresponds to digit of 9
		else if (alphabet == 'W' || alphabet == 'X' || alphabet == 'Y' || alphabet == 'Z') {
			int digit = 9;
			System.out.println("The digit " + digit + " corresponds to the" + 
				" letter " + alphabet + " on the telephone.");
		}

		//if non-alphabetic input is entered then print statement stating error
		else {
			System.out.println("There is no matching digit for the non-alphabetic input entered.");
		}


	}
}