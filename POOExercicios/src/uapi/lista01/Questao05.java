package uapi.lista01;

import java.util.Scanner;

public class Questao05 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Insira um número: ");
		int num1 = in.nextInt();
		System.out.println("Insira outro número: ");
		int num2 = in.nextInt();		
		
		if (num1>num2){
			System.out.println("O maior número é: "+num1);
		}else if (num2>num1){
			System.out.println("O maior número é: "+num2);
		}else {
			System.out.println("Números iguais.");
		}
	}
}
