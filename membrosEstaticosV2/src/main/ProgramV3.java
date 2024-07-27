package main;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator2;

public class ProgramV3 {
	
	/*
	 * nesse último exemplo, devido aos cálcuos não receberem valores diferentes, apenas de entrada e após isso todos os cálculos serem fixos, criamos dentro do package util
	 * uma nova classe Calculator2, dentro dela, também indicamos a constante PI que agora é static assim como as funções que também são estaticas, dessa forma, importamos a classe
	 * e não é necessário instanciar o ojbeto, apenas chamar a classe com a função/método desejado e indicando qual valor irá receber, nesse caso o usuário insere o valor de radius;
	 */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius value: ");
		double radius = sc.nextDouble();
		
		double c = Calculator2.circumferenceV2(radius);
		double v = Calculator2.volumeV2(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator2.PI);
		
		sc.close();

	}
	
	

}
