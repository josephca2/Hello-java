/*********************
Christina Joseph
CMSC255, 001
Sept 17 2020
MiddleString - Lab5
*********************/

import java.util.Scanner;

public class MiddleString {
 public static void main(String [] args) {
  Scanner scnr = new Scanner(System.in);
  
  System.out.println("Enter three strings:");
  String str1 = scnr.nextLine();
  String str2 = scnr.nextLine();
  String str3 = scnr.nextLine();
  
  //list all the possible comparisons between strings
  int order1 = str1.compareToIgnoreCase(str2);
  int order2 = str1.compareToIgnoreCase(str3);
  int order3 = str2.compareToIgnoreCase(str1);
  int order4 = str2.compareToIgnoreCase(str3);
  int order5 = str3.compareToIgnoreCase(str1);
  int order6 = str3.compareToIgnoreCase(str2);
  
  //Write if, else statements to satisfy each string being in the middle
  if ((order1 >= 0 && order2 <= 0) || (order2 >= 0 && order1 <= 0)) {
    System.out.println(str1);  
  }
  else if ((order3 >= 0 && order4 <= 0) || (order4 >= 0 && order3 <= 0)) {
    System.out.println(str2);
  }
  else if ((order5 >= 0 && order6 <= 0) || (order6 >= 0 && order5 <= 0)) {
    System.out.println(str3);
  }
  else {
    System.out.println("Incorrect input");
  }


 }
}