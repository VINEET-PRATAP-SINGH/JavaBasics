package test;

import java.util.Scanner;

public class FrequencyCalulator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string;
		System.out.println("enter the string");
		string=sc.nextLine();
		int[] arryString=new int[string.length()];
		for(int i=0;i<string.length()-1;i++)
		{
			arryString[i]=string.charAt(i);
		}
		for(int i=0;i<string.length();i++)
		{
			int c=1;
			if(arryString[i]==0)
				continue;
			else
			for(int j=i+1;j<string.length();j++)
			{
				if(arryString[i]==arryString[j])
				{
					c++;
					arryString[j]=0;
				}
				
			}
			System.out.println("the char "+string.charAt(i)+" appeared "+c+" times");
		}
		if(string.charAt(string.length()-1)!=0)
			System.out.println("the char "+string.charAt(string.length()-1)+" appeared 1 times");
		
	}

}
