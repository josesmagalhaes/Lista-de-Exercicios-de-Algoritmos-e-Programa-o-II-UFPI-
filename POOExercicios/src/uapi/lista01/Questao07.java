package uapi.lista01;

import java.util.Scanner;

public class Questao07 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um ano a ser verificado: ");
		int ano = in.nextInt();
		if ((ano % 400)== 0){
			System.out.println("Ano bisexto");
		}else if (((ano % 4)== 0) && ((ano % 100)!= 0)){
			System.out.println("Ano bisexto");
		}else {
			System.out.println("O ano digitado não é bissexto!");
		}
	}
}
