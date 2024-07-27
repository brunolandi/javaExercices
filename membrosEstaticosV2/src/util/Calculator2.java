package util;

public class Calculator2 {

	public static final double PI = 3.14159;
	// public static final double NET_SALARY = 3.14159; EXEMPLO CASO SEJA NOME
	// COMPOSTO

	public static double circumferenceV2(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volumeV2(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
