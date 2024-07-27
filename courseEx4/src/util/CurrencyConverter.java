package util;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double calcIOF(double a) {
		double x = (a * IOF) + a;
		return x;
	}

	public static double dollarToReal(double a, double b) {
		double x = a * b;
		return x;
	}
}
