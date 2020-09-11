/*******************
Christina Joseph
Lab 3
10/03/2020
CMSC255, 001
*******************/

public class VariableDefinitions {

	//main method
	public static void main(String[] args) {

		// inital declaration of numPets variable
		byte numPets = 4;

		// inital declaration of temperatureReading variable
		float temperatureReading = 89.9F;

		// inital declaration of total variable
		double total = 456.98;

		//inital declaration of stopKey variable
		char stopKey = 'x';

		// Print out each variable name and its value
		System.out.println("The numPets variable has a value of " + numPets);
		System.out.println("The temperatureReading variable has a value of " + temperatureReading);
		System.out.println("The total variable has a value of " + total);
		System.out.println("The stopKey variable has a value of " + stopKey);

		//modified value of numPets variable
		numPets = 5;
		//modified value of temperatureReading variable
		temperatureReading = 75.5F;
		//modified value of total variable
		total = 9873.91;
		//modified value of stopKey variable
		stopKey = 'y';

		//Print out each variable name and its modified value
		System.out.println("The numPets variable now has a value of " + numPets);
		System.out.println("The temperatureReading variable now has a value of " + temperatureReading);
		System.out.println("The total variable now has a value of " + total);
		System.out.println("The stopKey variable now has a value of " + stopKey);

		//inital declaration of MAX_VALUE constant
		final double MAX_VALUE = 45.23;  
		//inital declaration of PEOPLE constant
		final int PEOPLE = 6789;
		//inital declaration of NEG_NUM constant
		final long NEG_NUM = -925;
		//inital declaration of ANSWER constant
		final char ANSWER = 'Y';

		// Print out each constant name and its value
		System.out.println("The MAX_VALUE constant has a value of " + MAX_VALUE);
		System.out.println("The PEOPLE constant has a value of " + PEOPLE);
		System.out.println("The NEG_NUM constant has a value of " + NEG_NUM);
		System.out.println("The ANSWER constant has a value of " + ANSWER);

		/*
		//modify value of MAX_VALUE constant and print
		MAX_VALUE = 56.98;
		System.out.println("The MAX_VALUE constant now has a value of " + MAX_VALUE);
		*/
	}
}