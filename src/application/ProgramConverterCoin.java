package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConverterCoin;

public class ProgramConverterCoin {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the Dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many Dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = ConverterCoin.coin(amount, dollarPrice);
		System.out.printf("Amount to be paid in Reais = %.2f%n" ,result);

		sc.close();
	}
}
