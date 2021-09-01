package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if(X ==0 && Y==0) {
			System.out.println("ORIGEM");
		}else if(X >=0 && Y > 0) {
			System.out.println("Q1");
		}else if(X>=0 && Y < 0) {
			System.out.println("Q4");
		}else if(X <=0 && Y < 0) {
			System.out.println("Q3)");
		}else {
			System.out.println("Q2");
		}
		
		sc.close();
	}

}
