package uapi.lista01;

import java.util.Scanner;

public class Questao05 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Insira um n�mero: ");
		int num1 = in.nextInt();
		System.out.println("Insira outro n�mero: ");
		int num2 = in.nextInt();		
		
		if (num1>num2){
			System.out.println("O maior n�mero �: "+num1);
		}else if (num2>num1){
			System.out.println("O maior n�mero �: "+num2);
		}else {
			System.out.println("N�meros iguais.");
		}
	}
}
