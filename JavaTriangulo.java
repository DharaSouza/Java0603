package exercicios0603;

import java.util.Scanner;

public class JavaTriangulo {
	
	public static void main(String[] args) {
	//variavel
	double base, altura, area;
	
	//Instaciar Classe Scanner
	 Scanner ler = new Scanner (System.in);
	 
	//entrada de dados
			System.out.println("informe a base de um triangulo");
		 base = ler.nextDouble();
		 System.out.println("informe a altura de um triangulo");
		 altura = ler.nextDouble();
		 
		 //Processamento
		 area = base * altura / 2;
		 
			//Saída
			System.out.println("o valor da area equivale a:" + area);
		 
	}
}
