package main;

import java.util.Locale;
import java.util.Scanner;

public class ProgramV1 {

	/*
	 * nesse exemplo estamos utilizando a versão em que criamos os métodos dentro da própria classe main, nesse caso, tudo precisa ser estatico para ser acessado dentro de main;
	 */
	
	public static final double PI = 3.14159;
	//public static final double NET_SALARY = 3.14159; EXEMPLO CASO SEJA NOME COMPOSTO
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius value: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		
		sc.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
