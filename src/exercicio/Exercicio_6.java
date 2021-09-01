package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);
		
		double A, B, C, PI = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("%nTRIANGULO: %.3f%n", A*C/2);
		System.out.printf("CIRCULO: %.3f%n", PI*(C*C));
		System.out.printf("TRAPEZIO: %.3f%n", ((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f%n", B*B);
		System.out.printf("RETANGULO: %.3f%n", A*B);
		
		sc.close();
	}

}
