package javapractice;

import java.util.Scanner;
public class Calculator {
	public static void main (String[] args){
		int Option;
		Scanner Scan = new Scanner(System.in);
		System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
		System.out.println("Enter Your Choice : ");
		Option = Scan.nextInt();
		switch(Option){
		case 1 : Addition();
		  		 break;
 		case 2 : Subtraction();
	    		 break;
		case 3 : Multiplication();
		         break;
		case 4 : Division();
				 break; 
		default : System.out.println("Entered Choice is Wrong");	
	    }
    }
	private static void Addition(){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter first Number");
		int Number1 = Scan.nextInt();
		System.out.println("Enter Second Number");
		int Number2 = Scan.nextInt();
		int Answer;
		Answer = Number1+ Number2;
		System.out.println("Addition of Two Number is :" +Answer);
	    }
	
	private static void Subtraction(){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter first Number");
		int Number1 = Scan.nextInt();
		System.out.println("Enter Second Number");
		int Number2 = Scan.nextInt();
		int Answer;
		Answer = Number1- Number2;
		System.out.println("Addition of Two Number is :" +Answer);
        }
	private static void Multiplication(){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter first Number");
		int Number1 = Scan.nextInt();
		System.out.println("Enter Second Number");
		int Number2 = Scan.nextInt();
		int Answer;
		Answer = Number1 * Number2;
		System.out.println("Addition of Two Number is :" +Answer);
	}
	private static void Division(){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter first Number");
		int Number1 = Scan.nextInt();
		System.out.println("Enter Second Number");
		int Number2 = Scan.nextInt();
		int Answer;
		Answer = Number1+ Number2;
		System.out.println("Addition of Two Number is :" +Answer);
     }
}
