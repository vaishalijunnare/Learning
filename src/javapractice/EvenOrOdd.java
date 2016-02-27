package javapractice;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter any Integer number : ");
		int Number1 = Scan.nextInt();
		int Number2 = Number1%2;
		if (Number2 ==0) {
			System.out.println("Entered number " +Number1+ " is Even Number ");
		}
		else System.out.println("Entered Number " +Number1+ " is Odd Number");
	}
}
