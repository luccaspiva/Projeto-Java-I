package projeto_java;

import java.util.Scanner;

public class EficienciaEnergetica extends DadosUsuario {
	
	void lampada() throws InterruptedException {
	
	double lampadaIncandescente = 3.32;
    double lampadaFluorescente = 1.07;
    double lampadaLed = 0.30;
    double valorGastoMensal;
    double valorEconomizado=0.0;
    
    Scanner ler = new Scanner(System.in);
	
	System.out.println("\n\n==== C�lculo de energia utilizada por m�s de acordo com cada l�mpada ====\n");

	Thread.sleep(1500);
    System.out.println(getNome() + ", voc� utiliza qual tipo de l�mpada na sua casa?\n" + "\n1 - L�mpadas Incandescentes" + "\n2 - L�mpadas Fluorescentes" + "\n3 - L�mpadas Led");
    setTipoLampada(ler.nextInt());
    
    if(getTipoLampada() == 1) {
        valorGastoMensal = lampadaIncandescente * 30;
        valorEconomizado = valorGastoMensal - (lampadaLed * 30);
        Thread.sleep(1500);
        System.out.println("\n\nVoc� gasta em torno de " + valorGastoMensal 
        		+ " por m�s de energia apenas com l�mpadas. \nO aconselhavel seria voc� utilizar a L�mpada Led, onde voc� economizaria " 
        		+ Math.round(valorEconomizado) + "\nAssim, reduziria o consumo de energia el�trica melhorando o or�amento familiar.");
    }
    if(getTipoLampada() == 2) {
        valorGastoMensal = lampadaFluorescente * 30;
        valorEconomizado = valorGastoMensal - (lampadaLed * 30);
        Thread.sleep(1500);
        System.out.println("\n\nVoc� gasta em torno de " + valorGastoMensal 
        		+ " por m�s de energia apenas com l�mpadas. \nO aconselhavel seria voc� utilizar a L�mpada Led, onde voc� economizaria " 
        		+ Math.round(valorEconomizado) + "\nAssim, reduziria o consumo de energia el�trica melhorando o or�amento familiar.");
    }
    if(getTipoLampada() == 3) {
        lampadaLed = lampadaLed * 30;
        Thread.sleep(1500);
        System.out.println("\n\nL�mpadas Led s�o as que menos consomem energia, al�m de n�o emitir muito calor. \nVoc� tem uma despesa mensal de " 
        + lampadaLed + " apenas em L�mpadas, valor baixo em rela��o as demais. \nParab�ns, voc� contribui com o meio ambiente");
    }
 
	}



}

