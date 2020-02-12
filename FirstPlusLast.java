package test;

import java.util.Scanner;

public class FirstPlusLast {
	public static void sumFirstLastDigit(int number)
	{
		int temp=0,sum=0;
		sum+=number%10;
		while(number!=0)
		{
			temp=number%10;
			number/=10;
		}
		sum+=temp;
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number;
		System.out.println("enter the no.");
		number=sc.nextInt();
		if(number>=0)
		sumFirstLastDigit(number);
		else 
			System.out.println("negative or invalid no.");
	}

}
