package javapractice;

import java.util.Scanner;


public class HelloWorldClass {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter some String : ");
		String Str = scan.next();
		System.out.println("Hello " + Str + " World Welcomes You");
	   }
}


