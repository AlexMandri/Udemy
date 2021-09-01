package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		
		
		if(sal < 2001) {
			System.out.println("isento");
		}else if(sal <3001) {	
			System.out.println((sal-2000) * 0.08);
		}else if(sal < 4501) {
			System.out.println((sal-2000) * 0.18);
		}else{
			System.out.println((sal -2000) * 0.28);
		}
		sc.close();
	}

}
