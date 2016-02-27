package javapractice;

import java.util.Scanner;


public class TableMultiplication {
	    static int Number;
	   	public static void main(String[] args){
		TableMultiplication TMul = new TableMultiplication();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please Enter the Number of which table need to create:");
		Number = Scan.nextInt();
		TMul.Table();
	}

	   	private void Table(){
		int i;
		for (i=1; i<10 ; i++){
			int Temp = Number*i;
			System.out.println(Temp);
		}
	}
}
