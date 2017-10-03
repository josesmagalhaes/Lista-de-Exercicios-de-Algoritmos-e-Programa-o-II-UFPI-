package uapi.lista01;

import java.util.Scanner;

public class Questao11 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		int n = in.nextInt();
		for (int i=n;i>=0;i--){
			System.out.println(i);
		}
	}
}
