package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, numPec1, numPec2;
		double valor1, valor2, valorP;
		
		cod1 = sc.nextInt();
		numPec1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		numPec2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorP = (numPec1*valor1)+(numPec2*valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorP);
		
		sc.close();
	}

}
