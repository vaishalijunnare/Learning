package javapractice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		int Fact=1 ;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a Number for Factorial : ");
		int Number = Scan.nextInt();
		if (Number < 0){
			System.out.println("Entered Number is not a Interger Number ");
		}
	   else {
		  	   for (int i=Number; i>0; i--){
		//  		   System.out.println(i);
		  		   Fact = Fact * i ;
		//  	  	   System.out.println(Fact);
		  	  	   }
		  	  System.out.println("Factorial of " +Number+ " is "+Fact);
		   }	
	}
}
