package test;

import java.util.Scanner;

public class SpeedConverter {
	public static long toMilesPerHour(double KilometersPerHour) {
		 long roundValue;
		 if (KilometersPerHour<0)
			 roundValue=-1;
		 else
			 roundValue= Math.round((KilometersPerHour/8)*5);
		return roundValue;
		
		
	}
	public static void printConversion(double KilometersPerHour) {
		 
		 if (KilometersPerHour<0)
			 System.out.println("Invalid Value");
		 else
			 System.out.println(KilometersPerHour+" km/h = " +(Math.round((KilometersPerHour/8)*5))+" mi/h");
		
	}	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		if(barking==true)
		{
			if((hourOfDay>=0 && hourOfDay<=8)||hourOfDay>=22)
				return true;
		}
		
		return false;
	}
	public static boolean hasEqualSum(int val1, int val2, int checker)
	{
		if((val1+val2)==checker)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter km- ");
		double kmValue=sc.nextDouble();
		System.out.println(toMilesPerHour(kmValue));
		SpeedConverter obj=new SpeedConverter();
		obj.printConversion(kmValue);
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(hasEqualSum(2, 3, 6));
		sc.close();
	}

}
