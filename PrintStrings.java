import java.util.Scanner;

public class PrintStrings {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first word: ");
	String first = input.nextLine();

	System.out.print("Enter second word: ");
	String second = input.nextLine();

	int order = first.compareToIgnoreCase(second);

	if (order > 0) {
		System.out.println(second);
		System.out.println(first);
	}
	else if (order < 0) {
		System.out.println(first); 
		System.out.println(second);
	}
	else if (order == 0) {
		System.out.println(first + " and " + second + " are equal");
	}
	else {
		System.out.println("Incorrect input");
	}
	
	}
} 
