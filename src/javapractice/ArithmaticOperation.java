package javapractice;

import java.util.Scanner;


public class ArithmaticOperation {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int Number1 = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int Number2 = scan.nextInt();
		int Addition = Number1 + Number2;
		System.out.println("Addition of Two Numbers is "+ Addition );
	}
}
