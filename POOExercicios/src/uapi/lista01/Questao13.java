package uapi.lista01;

import java.util.Scanner;

public class Questao13 {
	
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um valor inteiro: ");
		int num = in.nextInt();
		
		int fat=1;
		
		for (int i=num;i>=1;i--){
			fat=fat*i;
		}
		System.out.println("O valor do fatorial é: "+fat);
	}
}
