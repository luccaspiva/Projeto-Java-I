package projeto_java;

import java.util.Scanner;

public class Mobilidade extends DadosUsuario {
	
     void transporte() throws InterruptedException {
        
        double distanciaPercorrida = 0.0;
        double transportePrivado = 0.38;
        double transportePublico = 0.10;

        double valorEconomizado = 0.0;
        double valorTranspPriv = 0.0;
        double valorTranspPubli = 0.0;
        double valorGastoPriv = 0.0;
        double valorGastoPubli = 0.0;
        double precoCombustivel = 0.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("\n\n==== C�lculo de gastos com transporte urbano ====\n ");
        
        Thread.sleep(1500);
        System.out.println(getNome() + ", voc� utiliza qual tipo de transporte?\n" + "\n1 - Transporte Privado"
                + "\n2 - Transporte P�blico" + "\n3 - Bicicleta");
        setTipoTransporte(ler.nextInt());
        
        System.out.println("\nQuantos Km voc� percorre em seu trajeto di�rio? ");
        distanciaPercorrida = ler.nextDouble();
        
        if(getTipoTransporte() == 1) {
        	System.out.println("\nQual o pre�o do seu combust�vel?");
        	precoCombustivel = ler.nextDouble();
        	
        }
        
        precoCombustivel *= (distanciaPercorrida *22)/10;

        valorTranspPriv = distanciaPercorrida * transportePrivado;
        valorTranspPubli = distanciaPercorrida * transportePublico;

        valorGastoPriv = valorTranspPriv * 22;
        valorGastoPubli = valorTranspPubli * 22;

        valorEconomizado = valorGastoPriv - valorGastoPubli;

        if (getTipoTransporte() == 1) {
        	
        	Thread.sleep(1500);
            System.out.println("\n\nO seu carro transmite em torno de " + Math.round(valorGastoPriv)
                    + "Kg.CO� por m�s. \nO aconselh�vel seria voc� utilizar Trem ou Metr�, onde voc� ajudaria reduzir em "
                    + Math.round(valorGastoPubli) + " Kg.CO� a emiss�o de CO� para a atmosfera.");
            System.out.println("Considerando uma bicicleta com valor m�dio de 700 reais e um consumo de 10 km/L, em um ano voc� economizaria " 
                    + Math.round((precoCombustivel *12) - 700) + " reais!");

        }
        if (getTipoTransporte() == 2) {

        	Thread.sleep(1500);
        	System.out.println("\n\nO seu trajeto com transporte p�blico transmite em torno de " + Math.round(valorGastoPubli)
                    + " Kg.CO� por m�s. \nCom ele voc� colabora reduzindo " + Math.round(valorEconomizado)
                    + " Kg.CO� de emiss�o em compara��o com um ve�culo privado.");
        }
        if (getTipoTransporte() == 3) {
            
        	System.out.println("\n\nMuito bem, com a bicicleta no lugar dos carros voc� tem um �timo exerc�cio, "
                    + "uma melhoria na economia! \nAl�m de um baixo custo com manuten��o e ajudar a diminunir a emiss�o de CO� para a atmosfera. ");
        }
    }
}