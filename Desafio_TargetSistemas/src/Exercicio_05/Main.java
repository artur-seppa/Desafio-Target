package Exercicio_05;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String txt;
		int contador;
		
		System.out.printf("Escreva uma palavra:\n");
		txt = entrada.nextLine();
	
		char[] txt_reverso = new char[txt.length()];
		contador = txt.length() - 1;
		
		for (int i = 0; i < txt.length(); i++) {
			txt_reverso[i] = txt.charAt(contador);
			contador--;
		}
		
		System.out.print(txt_reverso);

	}

}
