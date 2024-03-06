package exercicios0603;

import java.util.Scanner;

public class JavaMoeda {
	public static void main(String[] args) {
		//variavel
		double real, dolar;
		
		//Instaciar Classe Scanner
		 Scanner ler = new Scanner (System.in);
		 
		//entrada de dados
		 System.out.println("informar o valor em real");
		real = ler.nextDouble();
		
	
	    //Processamento
			 dolar = real * 0.20;
			 System.out.println("o valor em dolar equivale a:" + dolar);
			 
			 
	}

}
