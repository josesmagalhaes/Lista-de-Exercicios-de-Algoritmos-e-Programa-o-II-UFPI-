package uapi.lista01;

import java.util.Scanner;

public class Questao12 {
	
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o primeiro intereva-lo: ");
		int inter1 = in.nextInt();
		System.out.println("Digite o segundo intereva-lo: ");
		int inter2 = in.nextInt();
		
		for (int i=inter1;i<=inter2;i++){
			System.out.println(i);
		}
	}
}
