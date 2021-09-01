package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area, pi = 3.14159;
		
		r = sc.nextFloat();
		
		area = pi*r*r;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
		
	}

}
