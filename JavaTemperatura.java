package exercicios0603;

import java.util.Scanner;

public class JavaTemperatura {
	public static void main(String[] args) {
		//Variavel
		double celsius,fahrenheit;
		
		//Instaciar Classe Scanner
		Scanner ler = new Scanner (System.in);

		//entrada de dados
		System.out.println("informe a temperatura em graus fahrenheit");
	 fahrenheit = ler.nextDouble();

	 //Processamento
	 celsius = ((fahrenheit - 32)*5) / 9;
	 
	//Saída
	System.out.println("o valor de graus celsius é equivalente a:" + celsius);
		ler.close();	
		
	}
	

}
