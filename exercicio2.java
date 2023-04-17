package LacosRepediacaoForWhileDoWhile;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args) {
		
			Scanner leia = new Scanner (System.in);
									
			int Idade,Num=0,Cont=0, id=0;
		
			System.out.println("\nDigite a idade : ");
			
			Idade = leia.nextInt();
		
			while(Idade != -1) {
			
			if(Idade  <=21) {
				Num++;
				
			}if(Idade  >=50) {
				Cont++;
							
			}
			
			System.out.println("\nDigite a idade : ");
			Idade = leia.nextInt();
			
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+Num);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+Cont);

	}

}