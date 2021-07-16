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
	
	System.out.println("\n\n==== Cálculo de energia utilizada por mês de acordo com cada lâmpada ====\n");

	Thread.sleep(1500);
    System.out.println(getNome() + ", você utiliza qual tipo de lâmpada na sua casa?\n" + "\n1 - Lâmpadas Incandescentes" + "\n2 - Lâmpadas Fluorescentes" + "\n3 - Lâmpadas Led");
    setTipoLampada(ler.nextInt());
    
    if(getTipoLampada() == 1) {
        valorGastoMensal = lampadaIncandescente * 30;
        valorEconomizado = valorGastoMensal - (lampadaLed * 30);
        Thread.sleep(1500);
        System.out.println("\n\nVocê gasta em torno de " + valorGastoMensal 
        		+ " por mês de energia apenas com lâmpadas. \nO aconselhavel seria você utilizar a Lâmpada Led, onde você economizaria " 
        		+ Math.round(valorEconomizado) + "\nAssim, reduziria o consumo de energia elétrica melhorando o orçamento familiar.");
    }
    if(getTipoLampada() == 2) {
        valorGastoMensal = lampadaFluorescente * 30;
        valorEconomizado = valorGastoMensal - (lampadaLed * 30);
        Thread.sleep(1500);
        System.out.println("\n\nVocê gasta em torno de " + valorGastoMensal 
        		+ " por mês de energia apenas com lâmpadas. \nO aconselhavel seria você utilizar a Lâmpada Led, onde você economizaria " 
        		+ Math.round(valorEconomizado) + "\nAssim, reduziria o consumo de energia elétrica melhorando o orçamento familiar.");
    }
    if(getTipoLampada() == 3) {
        lampadaLed = lampadaLed * 30;
        Thread.sleep(1500);
        System.out.println("\n\nLâmpadas Led são as que menos consomem energia, além de não emitir muito calor. \nVocê tem uma despesa mensal de " 
        + lampadaLed + " apenas em Lâmpadas, valor baixo em relação as demais. \nParabéns, você contribui com o meio ambiente");
    }
 
	}



}

