package projeto_java;

import java.util.Scanner;

public class EficienciaRecursos extends DadosUsuario {
	
	
	void sacola() throws InterruptedException {

	double emissaoCO2 = 0.0;
	double precoSacola = 0.10;
    double economia = 0.0;
    		
    Scanner ler = new Scanner(System.in);

    
    System.out.println(" \n\n==== Cálculo de consumo de sacolas plásticas ==== \n");
    
    Thread.sleep(1500);
	System.out.println(getNome() + ", quantas sacolas plásticas você consome em média no período de um mês?");
	setSacolasPlasticas(ler.nextInt());  
	        
	
	emissaoCO2 = getSacolasPlasticas() * 0.0625;

	if(getSacolasPlasticas() > 0) {
	
	Thread.sleep(1500);
	System.out.println("\n\nVocê emite " + emissaoCO2 + " KG de CO² para a atmosfera em um mês");
	
	System.out.println("Uma solução plausível e acessível seria o uso de sacolas retornáveis");

	economia = getSacolasPlasticas() * precoSacola;// Economia mensal
	
	System.out.println("Você teria uma economia de " + Math.round(economia) + " reais, o que em um ano totaliza " + Math.round(economia * 12) 
			+ " reais!");
	        
	}
	else {
		System.out.println("\n\nParabéns! Você já contribui com o ambiente sem utilizar sacolas plásticas!");
	}
	        
	}
}

