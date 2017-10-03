package uapi.lista01;

import java.util.Scanner;

public class Questao04 {
	
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Digite sua idade em anos: ");
		int idade = in.nextInt();
		double idadeDias = idade*365.25;
		
		System.out.println("O indivíduo já viveu "+idadeDias+" dias.");
		
	}

}
