package exercicios0603;

import java.util.Scanner;

public class JavaGasolina {

	public static void main(String[] args) {
		//Variavel
		double vlitro , distancia, ckm, litrog, custo;
		//Instaciar Classe Scanner
				Scanner ler = new Scanner (System.in);
				

	//entrada de dados
				System.out.println("quantos custa a gasolina:");
				vlitro= ler.nextDouble();
				System.out.println("Qual a distancia que você quer percorrer:");
				distancia  = ler.nextDouble();
				System.out.println("Qual o cunsumo medio:");
				ckm = ler.nextDouble();
				System.out.println("quantos litros gastos:");
		        litrog = ler.nextDouble(); 
				System.out.println("qual o custo total");
	            custo = ler.nextDouble();
	            
	          //Processamento
	    		ckm = distancia / custo;
	            custo = ckm * vlitro;
	            
	          //Saída
	            System.out.println("quantos litros gastos:" +litrog);
				System.out.println("qual o custo total" +custo);
	        
	}
}
	
	
