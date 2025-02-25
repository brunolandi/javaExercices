package program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();

		double check = CurrencyConverter.calcIOF(dollarAmount);
		double check2 = CurrencyConverter.dollarToReal(dollarPrice, check);

		System.out.printf("Amount to be paid in Real: R$ %.2f%n", check2);

		sc.close();

	}

}
