package uapi.lista01;

import java.util.Scanner;

public class Questao08 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a idade a ser verificada: ");
		int idade = in.nextInt();
		
		if ((idade >= 18)&& (idade < 65)){
			System.out.println("Maior de idade");
		}else if (idade < 18){
			System.out.println("Menor de idade");
		}else if (idade >= 65){
			System.out.println("Pessoa idosa");
		}
	}
}
