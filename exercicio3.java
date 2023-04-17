package LacosRepediacaoForWhileDoWhile;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero, soma=0;
		
		do {
			
			System.out.println("insira um valor: ");
			
			numero = leia.nextInt();
			
			if (numero>=0) {
				
				soma = (numero + soma);
				
			}
				
			
		} while (numero !=0);
	
		System.out.println("\nA soma dos números positivos é: " + soma);
		
		}
		
	}


