package javapractice;

import java.util.Scanner;


public class Swaping {
	
	public static void main(String[] args) {
		Swaping swap = new Swaping();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please Enter two numbers to swap : ");
		int Num1 = Scan.nextInt();
		int Num2 = Scan.nextInt();
		swap.SwapNum(Num1, Num2);
	}
	
	private int SwapNum(int a,int b){
		int temp;
		temp = a;
		a = b;
        System.out.println("The two numbers after swaping re : " +a + " and " + temp);
        return temp;
	}
}
