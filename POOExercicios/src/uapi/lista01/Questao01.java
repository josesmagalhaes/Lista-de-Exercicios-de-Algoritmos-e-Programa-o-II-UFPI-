package uapi.lista01;

import java.util.Scanner;

public class Questao01 {
	
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = in.nextInt();
		System.out.println("Digite seu salario: ");
		float salario = in.nextFloat();
		
		System.out.println("O nome do indiv�duo � "+nome+". Ele possui "+idade+" anos. Seu sal�rio � de R$: "+salario+".");
	}
	
}
