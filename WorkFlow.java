package test;

public class WorkFlow {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 20, d = 0; 
        System.out.println("Var1 = " + a); 
        System.out.println("Var2 = " + b); 
        System.out.println("Var3 = " + c); 
        if ((a < b) && (b == c)) { 
            d = a + b + c; 
            System.out.println("The sum is: " + d); 
        } 
        else
            System.out.println("False conditions"); 
        double firstValue=20.00d, secondValue=80.00d;
        double TotalValue=firstValue+secondValue*100.00d;
        double Remainder= TotalValue%40.00d;
        boolean isNoRemainder=(Remainder==0)?true:false;
        if(!isNoRemainder)
        	System.out.println(Remainder);
	}

}
