package exercicios0603;

import java.util.Scanner;

public class JavaAlgaritimo {

		public static void main(String[] args) {
	         // Variaveis
			double a,b,soma,multiplicacao,divisao,subtracao;
			
			// Instaciar classe Scanner
			Scanner ler = new Scanner(System.in);
			
			// Entrada de dados 
			System.out.println("Informe valor l: ");
			a = ler.nextDouble();
			System.out.println("Informe valor 2: ");
			b = ler.nextDouble();
			
			//Processamento
			soma = a + b;
			divisao = a / b;
			multiplicacao = a * b;
			subtracao = a - b;
			
			//Saída
			System.out.println("O resultado é :" + soma);
			System.out.println("O resultado é :" + divisao);
			System.out.println("O resultado é :" + multiplicacao);
			System.out.println("O resultado é :" + subtracao);
			ler.close();
				

		}

	}



