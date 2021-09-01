package exercicio;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int n = sc.nextInt();
		
		if(n%2==0 ) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
