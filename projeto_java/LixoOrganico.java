package projeto_java;

import java.util.Scanner;

public class LixoOrganico extends DadosUsuario {

	void lixo() throws InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		
		double lixoTotal=0.0; 
		double lixoOrganico=0.0;
		
		System.out.println("\n\n==== Cálculo de produção de lixo orgânico ====\n\n ");
		
		Thread.sleep(1500);
		System.out.println(getNome() + ", quantas pessoas moram na sua residência?");
		setNumeroPessoas(ler.nextInt());
		
		lixoTotal = getNumeroPessoas() * 30;
		lixoOrganico = lixoTotal / 2;
		
		Thread.sleep(1500);
		System.out.println("\n\nA quantidade de lixo orgânico que sua família produz equivale a " + lixoOrganico + " Kg por mês.");
		
		System.out.println("A produção de lixo orgânico está diretamente relacionada com a "
				+ "produção de gases do Efeito Estufa. ");
		
		System.out.println("Com a compostagem, é possível reduzir esse efeito negativo. "
				+ "\nAssim, gera-se um adubo natural, "
				+ "que pode ser utilizado no cultivo de plantas, jardins e até mesmo na agricultura.");
		
	}
	
	
}