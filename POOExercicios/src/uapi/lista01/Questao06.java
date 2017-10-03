package uapi.lista01;

import java.util.Scanner;

public class Questao06 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		int num = in.nextInt();
		int mult = num*2;
		
		if (mult > 30){
			System.out.println("O resultado da multiplicação é: "+mult);
		}else {
			System.out.println("A condição do programa não foi atendida!");
		}
	}
}
