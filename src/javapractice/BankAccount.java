package javapractice;

import java.util.Scanner;


public class BankAccount {
	int MinBalance = 100;
	int CurrentBalance;
	public static void main(String[] args) {
		BankAccount Acc = new BankAccount();
		Scanner Scan = new Scanner(System.in);
		char c;
		do{
		System.out.println("Welcome to Bank transaction: ");
		System.out.println("Please enter your choice for Bank Transaction : " +
				"1. Withdraw the Money" +
				"2. Add Money to Account" +
				"3. AccountBalance");
		int choice = Scan.nextInt();
		switch(choice){
		case 1 : Acc.Withdraw();
				 break;
				 
		case 2 : Acc.AddMoney();
				 break;
				 
		case 3 : Acc.AccountBalance();
				 break;
				 
		default : System.out.println("You have entered wrong option");
		          break;
		}
		System.out.println("Do you want to repeat thetransaction : Y or N");
		c = Scan.next().charAt(0);
	     }while (c == 'Y');
		}
	
	private int Withdraw(){
	    Scanner Bank = new Scanner(System.in);
		System.out.println("Please enter amount to be withdraw in the multiple of 50");
		int Amount = Bank.nextInt();
		if (Amount%50 == 0){
			if (Amount >= MinBalance){
				System.out.println("You are enable to withdraw the amount. Terminating" +
						"this transaction.");
			}
			else{
				CurrentBalance = CurrentBalance-Amount;
				System.out.println("The " + Amount + "Amount is withdraw from the " +
						"account and Current balance is " + CurrentBalance);
			}
		}else {System.out.println("Please enter different amount, entered amount is " +
				"not a multiple of 50");
		System.out.println("Please enter amount to be withdraw in the multiple of 50");
		int Amount1 = Bank.nextInt();
		if (Amount1 %50==0){
			if (Amount1 >= CurrentBalance){
				System.out.println("You are enable to withdraw the amount. Terminating" +
						"this transaction.");
			}
			else{
				CurrentBalance = CurrentBalance-Amount1;
				System.out.println("The " + Amount1 + " Amount is withdraw from the " +
						"account and Current balance is " + CurrentBalance);
			}
		}else System.out.println("You have not entered proper amount. Terminating the " +
				"transaction.");
		
		}return CurrentBalance;
		}
	
	
	private int AddMoney(){
		System.out.println("Please enter the amount to add into the account");
		Scanner Option = new Scanner(System.in);
		int Money = Option.nextInt();
		CurrentBalance = CurrentBalance + Money;
		System.out.println("The Money which you have added is " + Money + " and " +
				"Current balance is " + CurrentBalance);
		return CurrentBalance;
	}
	
	private int AccountBalance(){
		System.out.println("The Current Balance in your account is" + CurrentBalance);
		return CurrentBalance;
	}
}
