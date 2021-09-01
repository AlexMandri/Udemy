package exercicio;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A%B==0 || B%A==0  ) {
			System.out.println("SAO MULTIPLOS");
		}else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();
		
		

	}

}
