package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int num, horas;
		double val, sal;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		val = sc.nextDouble();
		
		sal = horas*val;
		
		System.out.println("NUMBER = "+ num);
		System.out.printf("SALARY = U$ %.2f%n", sal);
		
		sc.close();
	}
}
