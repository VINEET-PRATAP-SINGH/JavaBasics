package test;

import java.util.Scanner;

public class NumberPalindrome {
	public boolean isPalindrome(int number)
	{
		int temp=number,reverse=0;
		while(number!=0)
		{
			reverse=(reverse*10)+(number%10);
			number=number/10;
		}
		if(reverse==temp)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
	NumberPalindrome obj =new NumberPalindrome();
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	
	System.out.println(obj.isPalindrome(number));
		
	sc.close();
	}

}
