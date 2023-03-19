package Exercicio_02;

import java.util.Scanner; 

public class Main {

	static long fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		boolean condicao = false;
		
		System.out.printf("Informe um número:\n");
		num = entrada.nextInt();
		
		for (int i = 0; i <= num; i++) {
			if(Main.fibonacci(i) == num) {
				condicao = true;
				break;
			} 
			
			if(Main.fibonacci(i) > num) {
				break;
			}
        }
		
		if(condicao) {
			System.out.printf("O numero "+num+" pertence a sequencia \n");
		} else {
			System.out.printf("O numero "+num+" NAO pertence a sequencia \n");
		}
	}

}
