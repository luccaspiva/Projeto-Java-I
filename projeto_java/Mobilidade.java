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

        System.out.println("\n\n==== Cálculo de gastos com transporte urbano ====\n ");
        
        Thread.sleep(1500);
        System.out.println(getNome() + ", você utiliza qual tipo de transporte?\n" + "\n1 - Transporte Privado"
                + "\n2 - Transporte Público" + "\n3 - Bicicleta");
        setTipoTransporte(ler.nextInt());
        
        System.out.println("\nQuantos Km você percorre em seu trajeto diário? ");
        distanciaPercorrida = ler.nextDouble();
        
        if(getTipoTransporte() == 1) {
        	System.out.println("\nQual o preço do seu combustível?");
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
                    + "Kg.CO² por mês. \nO aconselhável seria você utilizar Trem ou Metrô, onde você ajudaria reduzir em "
                    + Math.round(valorGastoPubli) + " Kg.CO² a emissão de CO² para a atmosfera.");
            System.out.println("Considerando uma bicicleta com valor médio de 700 reais e um consumo de 10 km/L, em um ano você economizaria " 
                    + Math.round((precoCombustivel *12) - 700) + " reais!");

        }
        if (getTipoTransporte() == 2) {

        	Thread.sleep(1500);
        	System.out.println("\n\nO seu trajeto com transporte público transmite em torno de " + Math.round(valorGastoPubli)
                    + " Kg.CO² por mês. \nCom ele você colabora reduzindo " + Math.round(valorEconomizado)
                    + " Kg.CO² de emissão em comparação com um veículo privado.");
        }
        if (getTipoTransporte() == 3) {
            
        	System.out.println("\n\nMuito bem, com a bicicleta no lugar dos carros você tem um ótimo exercício, "
                    + "uma melhoria na economia! \nAlém de um baixo custo com manutenção e ajudar a diminunir a emissão de CO² para a atmosfera. ");
        }
    }
}