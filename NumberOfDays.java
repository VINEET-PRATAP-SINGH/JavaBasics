package test;

import java.util.Scanner;

public class NumberOfDays {
	public boolean isLeapYear(int year)
	{
		if(year<1 || year>9999)
		{
			System.out.println("invalid year");
			return false;
		}
		else
		{
			if(year%4==0 || year%400==0)
				return true;
			else
				return false;
		}
	}
	public int getDays(int month)
	{
		if((month<=7 && month%2!=0) || (month>=8 && month%2==0))
			return 31;
		else
			return 30;
	}
	public static void main(String[] args) {
	
		int year;
		NumberOfDays obj= new NumberOfDays();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		if(obj.isLeapYear(year)==true)
			System.out.println("the year "+year+" is a leap year");
		else
			System.out.println("the year "+year+" is not a leap year");
		System.out.println("enter the month");
		int month=sc.nextInt();
		if(month<=12 && month>=1)
			System.out.println("no. of days in month 2017 "+month+" are "+obj.getDays(month));
		else
			System.out.println("invalid month");
		sc.close();
	}

}
