package test;

public class Primitive {

	public static void main(String[] args) {
	int Min=Integer.MIN_VALUE;
	int Max=Integer.MAX_VALUE;
	System.out.println("max value="+Max);
	System.out.println("min value="+Min);
	System.out.println("overflow"+Max+1);
	System.out.println("underflow"+(Min-1));
	int check=1_23_45;
	System.out.println(check);
	byte NewByte= (byte) (check/5);
	System.out.println(NewByte);
	float FloatValue=5f/3f;
	double DoubleValue=5d/3d;
	System.out.println(FloatValue+" "+DoubleValue);
	char Unicode='\u0044';
	char CharValue='\u00A9';
	System.out.println(Unicode+" "+CharValue);
	String myString="String contains ";
	System.out.println(myString);
	myString=myString+"\u00A9 2020";
	System.out.println(myString);
	int myInt=50;
	myString=myString+myInt;
	System.out.println(myString);
	myInt+=10;
	System.out.println(myInt);
	System.out.println("Max int value    = " + Integer.MAX_VALUE);
	System.out.println("Min int value    = " + Integer.MIN_VALUE);
	
	}

}
