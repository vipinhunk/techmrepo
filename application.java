package project1;

public class Calculator {

	int num1 ;
	int num2 ;
	
	 int addition (int num1 ,int num2 ) {
		 int result = num1 + num2 ;
	     return result;
	 }
	 
	 
	 
	  int subtraction (int num1, int num2) {
		 int result = num1 - num2 ;
		 return result;
		 

	 }
	 some changes by in file anup on 23/10/22
	 
	 package project1;

import java.util.Scanner;

public class Calculatorsolution {

	

	public static void main(String[] args) {
		
  System.out.println("execute start from the main method");
Calculator calc = new Calculator();
Scanner sc = new Scanner(System.in);

int num1 = sc.nextInt();
int num2 = sc.nextInt();

int sum = calc.addition(num1, num2);
System.out.println(sum);

	
	
	int subtraction = calc.subtraction(num1,num2);
	System.out.println(subtraction);
	
	
	int multiply = calc.multiply(num1,num2);
	System.out.println(multiply);
	
	
	int divide = calc.divide(num1, num2);
	System.out.println(divide);
	
	
	}
	
	
}

		 
		 
	 }
	 some chages in file vipin date 20/9/22
	 
	  
	int multiply (int num1, int num2) {
		int result= num1 * num2 ;
		return result;
		
	}
	int divide (int num1, int num2) {
		int result = num1/num2 ;
		return result;
	}
}

