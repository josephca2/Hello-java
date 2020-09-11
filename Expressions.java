
public class Expressions {
  public static void main(String[] args){
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /*
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     */
    System.out.println((a + b) / c);   
    
    /*
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     */
    System.out.println(a + b / c);       
    
    /*
     * a plus plus increments the variable by adding 1 (preincrement)
     * a equal a + 1
     * The value displayed is 4
    */
    System.out.println(++a);

    /*
     * a minus minus increments the vairable by subtracting 1 (preincrement)
     * a equals a 
     * The value displayed is 3
    */       
    System.out.println(--a);

    /*
     * a plus plus increments the variable by adding 1 (postincrement)
     * a equal a 
     * The value displayed is 3
    */
    System.out.println(a++); 

    /*
     * a minus minus increments the variable by subtracting 1 (postincrement)
     * a-- equal a + 1
     * 4 - 1 = 3
     * The value displayed is 4
    */      
    System.out.println(a--);

    /*
     * a is 3 
     * 3 is added to 1 to get sum of 4
     * the value displayed is 4
    */
    System.out.println(a + 1);    

    /*
     * d is 17 and c is 5
     * 17 is divided by 5 to generate 3 with a remainder of 2
     * the value displayed is the remainder which is 2
    */    
    System.out.println(d % c);  

    /*
     * 17 is divided by 5 to result in integer division
     * 17/5 = 3
     * the value displayed is 3
    */     
    System.out.println(d / c);  

    /*
     * d is 17 and b is 4
     * 17 is divided by 4 to generate 4 with a remainder of 1
     * the value displayed is the remainder which is 1
    */     
    System.out.println(d % b);  

    /*
     * 17 is divided by 4 to result in integer division
     * 17/4 = 4
     * the value displayed is 4
    */     
    System.out.println(d / b);    

    /*
     * Because division has higher precedence, a is divided by b first
     * so, 3 is divided by 17 by integer division and results in 0
     * 17 is added to 0 and 4 to sum to 21
     * the value displayed is 21
    */   
    System.out.println(d + a / d + b);    

    /*
     * parenthesis takes high precedence than division, so d+a and d+b is done first
     * 17 is added to 3 to sum to 20
     * 17 is added to 4 to sum to 21
     * 20 is divided by 21 by integer division to result in 0
     * the value displayed is 0
    */   
    System.out.println((d + a) / (d + b));  

    /*
     * Math.sqrt() is used to square root a variable
     * the square root of 4 is 2
     * the value displayed is 2
    */     
    System.out.println(Math.sqrt(b));    

    /*
     * Math.pow() is used to set variables to the power of something
     * 3 to the power of 4 is 81
     * the value displayed is 81
    */   
    System.out.println(Math.pow(a, b));    

    /*
     * Math.abs() is used to get the absolute vale of the variable
     * absolute value of -3 is 3
     * the value displayed is 3
    */   
    System.out.println(Math.abs(-a));

    /*
     * Math.max() is used to print the maximum of the two values
     * the maximum value of 3,4 is 4
     * the value displayed is 4
    */
    System.out.println(Math.max(a, b));    
  } 
} 
