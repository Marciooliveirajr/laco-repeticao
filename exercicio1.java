package LacosRepediacaoForWhileDoWhile;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new  Scanner (System.in);
			
		        int cont, num, ContPar = 0, ContImpar = 0;
		        
		        for( cont = 1; cont <= 10; cont++){
		            System.out.println("Digite o " + cont + "º número");
		            num = leia.nextInt();
		            
		            if(num % 2 == 0){
		                ContPar++;
		            }

		           
		            if(num % 2 == 1){
		                ContImpar++;
		            }
		            
		        }
		        
		        System.out.println("\nTotal de números pares: "+ContPar);
		        System.out.println("\nTotal de números ímpares: "+ContImpar);
		        
		    }
		}
	
