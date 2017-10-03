package uapi.lista01;

import java.util.Scanner;

public class Questao03 {
	
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		int num = in.nextInt();
		int quadrado = num*num;
		
		System.out.println("O quadrado do numero digitado é: "+quadrado);
		
	}

}
