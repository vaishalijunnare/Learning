package javapractice;

import java.util.Scanner;


public class Palindrome {
		
	public static void main(String[] args) {
		int l =0;
		char choice = 0 ;
	do{
		String reverse ="";
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter text to check for Palindrome : ");
        String text= Scan.next();
        l = text.length();
        if (l==1){
        	System.out.println("Entered string " + text + " is Palindrome");
        }
        else {
        	for (int i=(l-1); i>=0; i--){
        		reverse = reverse + text.charAt(i);
        	} 
        	System.out.println("Reverse staing is "+ reverse);
           	if (text.equals(reverse)){
        		System.out.println("Entered string is Palindrome");
        	}else
        	System.out.println("Enetered string is not a Palindrome");
       }
        System.out.println("Want to repeat the transaction : Y or N");
        choice = Scan.next().charAt(0);
		}while (choice == 'Y' || choice == 'y');
	} 
}
