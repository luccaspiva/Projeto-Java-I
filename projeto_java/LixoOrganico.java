package projeto_java;

import java.util.Scanner;

public class LixoOrganico extends DadosUsuario {

	void lixo() throws InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		
		double lixoTotal=0.0; 
		double lixoOrganico=0.0;
		
		System.out.println("\n\n==== C�lculo de produ��o de lixo org�nico ====\n\n ");
		
		Thread.sleep(1500);
		System.out.println(getNome() + ", quantas pessoas moram na sua resid�ncia?");
		setNumeroPessoas(ler.nextInt());
		
		lixoTotal = getNumeroPessoas() * 30;
		lixoOrganico = lixoTotal / 2;
		
		Thread.sleep(1500);
		System.out.println("\n\nA quantidade de lixo org�nico que sua fam�lia produz equivale a " + lixoOrganico + " Kg por m�s.");
		
		System.out.println("A produ��o de lixo org�nico est� diretamente relacionada com a "
				+ "produ��o de gases do Efeito Estufa. ");
		
		System.out.println("Com a compostagem, � poss�vel reduzir esse efeito negativo. "
				+ "\nAssim, gera-se um adubo natural, "
				+ "que pode ser utilizado no cultivo de plantas, jardins e at� mesmo na agricultura.");
		
	}
	
	
}