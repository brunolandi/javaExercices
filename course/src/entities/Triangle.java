package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double area() {
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		//outra maneira de se fazer seria locando o resultado em uma nova variavel, ex:
		
		//double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		//return result;
		
	}
}
