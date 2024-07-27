package main;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramV2 {
	
	/*
	 * nesse outro exemplo, criamos a Calculator dentro de util e jogamos a constante PI e as funções circumference e volume para o pacote e criamos o objeto calc para acessar as funções
	 * é examante a mesma forma que acessamos a função Scanner, chamando a classe para o programa principal e então instanciando a entrada para sc; 
	 */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius value: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
		
		sc.close();

	}
	
	

}
