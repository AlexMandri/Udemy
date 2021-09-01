package exercicio;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int HoraInicial = sc.nextInt();
		int HoraFinal = sc.nextInt();
		
		int duracao;
		if(HoraInicial < HoraFinal) {
			duracao = HoraFinal - HoraInicial;
		}else {
			duracao = 24 - HoraInicial + HoraFinal;
		}
		System.out.println("O JOGO DUROU "+ duracao + " HORA (S)");
		sc.close();

	}

}
