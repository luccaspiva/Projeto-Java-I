package projeto_java;

import java.util.Scanner;

public class EficienciaRecursos extends DadosUsuario {
	
	
	void sacola() throws InterruptedException {

	double emissaoCO2 = 0.0;
	double precoSacola = 0.10;
    double economia = 0.0;
    		
    Scanner ler = new Scanner(System.in);

    
    System.out.println(" \n\n==== C�lculo de consumo de sacolas pl�sticas ==== \n");
    
    Thread.sleep(1500);
	System.out.println(getNome() + ", quantas sacolas pl�sticas voc� consome em m�dia no per�odo de um m�s?");
	setSacolasPlasticas(ler.nextInt());  
	        
	
	emissaoCO2 = getSacolasPlasticas() * 0.0625;

	if(getSacolasPlasticas() > 0) {
	
	Thread.sleep(1500);
	System.out.println("\n\nVoc� emite " + emissaoCO2 + " KG de CO� para a atmosfera em um m�s");
	
	System.out.println("Uma solu��o plaus�vel e acess�vel seria o uso de sacolas retorn�veis");

	economia = getSacolasPlasticas() * precoSacola;// Economia mensal
	
	System.out.println("Voc� teria uma economia de " + Math.round(economia) + " reais, o que em um ano totaliza " + Math.round(economia * 12) 
			+ " reais!");
	        
	}
	else {
		System.out.println("\n\nParab�ns! Voc� j� contribui com o ambiente sem utilizar sacolas pl�sticas!");
	}
	        
	}
}

