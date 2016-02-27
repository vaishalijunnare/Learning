package javapractice;

import java.util.Scanner;


public class ObjectCalculator {

	public static void main(String[] args) {
		char C;
		do{
    		Scanner Scan = new Scanner(System.in);
    		System.out.println("Select the option for Calculator : ");
    		/*System.out.println("1. Addition   2. Subtraction   3. Multiplication  " +
    				"4. Division");*/
            System.out.println("1. Addition \n  2. Subtraction \n  3. Multiplication \n " +
        			"4. Division \n");
    		int selection = Scan.nextInt();
    		ObjectCalculator ObjCalc = new ObjectCalculator();
    		switch (selection){
        		case 1 : ObjCalc.Addition();
        		break;
        		
        		case 2 : ObjCalc.Subtraction();
        		break;
        		
        		case 3 : ObjCalc.Multiplication();
        		break;
        		
        		case 4 : ObjCalc.Division();
        		break;
        		
        		default : System.out.println("Invalid Input");
        	    break;
    		}
        	System.out.println("Do you want to repeat the transaction : Y or N");
        	C = Scan.next().charAt(0);
        	System.out.println(C);
    	}while(C == 'Y');
	}
	private void Addition(){
         int Num1, Num2, Result;
         Scanner Num = new Scanner(System.in);
         System.out.println("Enter Two Numbers for Addition : ");
         Num1 = Num.nextInt();
         Num2 = Num.nextInt();
         Result = Num1 + Num2;
         System.out.println("Addition of two numbers is : " + Result);
     	}
		
	private void Subtraction(){
        int Num1, Num2, Result;
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter Two Numbers for Subtraction : ");
        Num1 = Num.nextInt();
        Num2 = Num.nextInt();
        Result = Num1 - Num2;
        System.out.println("Subtraction of two numbers is : " + Result);
    	}
	
	private void Multiplication(){
        int Num1, Num2, Result;
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter Two Numbers for Multiplication : ");
        Num1 = Num.nextInt();
        Num2 = Num.nextInt();
        Result = Num1 * Num2;
        System.out.println("Multiplication of two numbers is : " + Result);
    	}
	
	private void Division(){
		try {
        int Num1, Num2, Result;
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter Two Numbers for Division : ");
        Num1 = Num.nextInt();
        Num2 = Num.nextInt();
        Result = Num1 / Num2;
        System.out.println("Division of two numbers is : " + Result);
    	}
		catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("Arithmetic Exception: You can't divide an integer by 0");
		}	
	  }
	}


