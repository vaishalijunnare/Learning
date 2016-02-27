package javapractice;

import java.util.Scanner;


public class AreaOfCircle {
		static int Pi;
		double Area;
		static double Radius;
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Radius of the Circle :");
		Radius = Scan.nextInt();
		AreaOfCircle AOC = new AreaOfCircle();
		AOC.AreaOfCircleHere();
	}
	private void AreaOfCircleHere(){
		Area = (3.14*Radius*Radius);
		System.out.println("Area of the Circle is :" + Area);
	}
}
