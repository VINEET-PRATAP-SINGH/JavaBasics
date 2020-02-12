package test;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);
			}
		int sumAll = 0, i = 100;
	      while (i != 0) {
	         sumAll += i;     
	         --i;
	      }
		   
	      System.out.println("Sum = " + sumAll);
	      Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);
	      do {
	    	 System.out.print("Enter a number: ");
	    	 number = input.nextDouble();
	    	 sum += number;
	      } while (number != 0.0);
		   
	      System.out.println("Sum = " + sum);

	}

}
