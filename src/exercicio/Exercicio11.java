package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		double quantidade = sc.nextInt();
		
		double valor = 0.0;
		if(cod == 1) {
			valor = quantidade * 4.00;
		}else if(cod == 2) {
			valor = quantidade * 4.50;
		}else if(cod == 3) {
			valor = quantidade * 5.00;
		}else if(cod == 4) {
			valor = quantidade * 2.00;
		}else if (cod == 5) {
			valor = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", valor);
		sc.close();

	}

}
