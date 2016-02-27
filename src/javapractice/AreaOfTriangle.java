package javapractice;

import java.util.Scanner;


public class AreaOfTriangle {

		static char choice;
	public static void main(String[] args) {
		AreaOfTriangle AOT = new AreaOfTriangle();
		do{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter Length and Breadth of Triangle:");
		double length = Scan.nextDouble();
		double breadth = Scan.nextDouble();
		AOT.Triangle(length,breadth);
		System.out.println("Do you want to repeat the transaction,Y or N:");
		choice = Scan.next().charAt(0);
	  }while(choice =='Y' || choice =='y');
	}
	
	private double Triangle(double a, double b){
		double area = 0;
		area = ((a*b)/2);
		System.out.println("Area of Triangle is " +area);
		return area;
	}
}
