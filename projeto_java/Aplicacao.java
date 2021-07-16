package projeto_java;

import java.util.Scanner;

public class Aplicacao extends DadosUsuario {

	public static void main(String[] args) throws InterruptedException {
		
		//Cabe�alho do sistema:
				System.out.println("      "
						+ "     ____                   ____               _                 \n"
						+ " __/\\__   | __ )    ___    ___   / ___|   ___     __| |   ___    __/\\__\n"
						+ " \\    /   |  _ \\   / _ \\  / _ \\ | |      / _ \\   / _` |  / _ \\   \\    /\n"
						+ " /_  _\\   | |_) | |  __/ |  __/ | |___  | (_) | | (_| | |  __/   /_  _\\\n"
						+ "   \\/     |____/   \\___|  \\___|  \\____|  \\___/   \\__,_|  \\___|     \\/  ");
				
				System.out.println("________________________________________________________________________");
				
				//************************************
				
		System.out.println("\n\nO BeeCode estar� pronto em alguns instantes!");
		Thread.sleep(4000);
		System.out.println("\n\n=====================================================================");
		Thread.sleep(1000);
		System.out.println("\nVamos come�ar sua jornada sustent�vel. A seguir, farei algumas " 
		+ " perguntas para entendermos melhor o seu perfil");
		Thread.sleep(1000);
		System.out.println("\nVamos l�!?");
		Thread.sleep(1000);
		

		EficienciaEnergetica efEnerg = new EficienciaEnergetica();
		EficienciaRecursos efRec = new EficienciaRecursos();
		Mobilidade mob = new Mobilidade();
		LixoOrganico org = new LixoOrganico();
		
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.print("\nComo voc� prefere ser chamade? ");
		setNome(ler.next());
		Thread.sleep(1000);


		efEnerg.lampada();
		Thread.sleep(3500);
		
		efRec.sacola();
		Thread.sleep(3500);
		
		mob.transporte();
		Thread.sleep(3500);
		
		org.lixo();
		Thread.sleep(4000);
		
		
		System.out.println("\n\n=====================================================================\n");
		Thread.sleep(2000);
		System.out.println("Carregando seus dados...");
		Thread.sleep(4000);

		
		if(getTipoLampada() == 3 && getSacolasPlasticas() == 0 && getTipoTransporte() == 3 ) {
			
			Thread.sleep(1500);
			
			System.out.println("\n\nParab�ns, " + getNome() + "!!! Voc� contribui para o meio ambiente! Devido a isso"
					+ ", voc� ganhou 40% de desconto em produtos BeeCode! Que tal conferir agora mesmo?");
			Thread.sleep(1500);
			
			System.out.println("\nUma forma simples e eficiente � acessando a sess�o de sustent�veis do Mercado Livre.");
			Thread.sleep(1500);		
			
			System.out.println("\nAqui vai o link: https://www.mercadolivre.com.br/produtos-sustentaveis#menu=categories ");
			
		}
		else {
			Thread.sleep(1500);
			
			System.out.println("\n\nAgora que voc� j� sabe a import�ncia dos produtos sustent�veis, que tal come�ar "
					+ "a inser�-los no seu dia a dia!?");
			Thread.sleep(1500);

			System.out.println("\nUma forma simples e eficiente � acessando a sess�o de sustent�veis do Mercado Livre.");
			Thread.sleep(1500);
			
			System.out.println("\nAqui vai o link: https://www.mercadolivre.com.br/produtos-sustentaveis#menu=categories ");
			
		}
		System.out.println("\n\n=====================================================================\n");
		Thread.sleep(2000);
		System.out.println("A equipe BeeCode agradece a prefer�ncia. "
				+ "\nContinuamos trabalhando duro para buscar alternativas cada vez mais sustent�veis para os h�bitos de consumo. "
				+ "\nContamos contigo nessa caminhada!!!");
		
		Thread.sleep(2000);
		System.out.println("\n\n=====================================================================");
		Thread.sleep(1500);
		System.out.println("\n\nFechando aplica��o...");
		Thread.sleep(4000);
		System.out.println("\n\n=====================================================================");
		
		System.out.println("      "
				+ "     ____                   ____               _                 \n"
				+ " __/\\__   | __ )    ___    ___   / ___|   ___     __| |   ___    __/\\__\n"
				+ " \\    /   |  _ \\   / _ \\  / _ \\ | |      / _ \\   / _` |  / _ \\   \\    /\n"
				+ " /_  _\\   | |_) | |  __/ |  __/ | |___  | (_) | | (_| | |  __/   /_  _\\\n"
				+ "   \\/     |____/   \\___|  \\___|  \\____|  \\___/   \\__,_|  \\___|     \\/  ");
		
		System.out.println("________________________________________________________________________");
		
		//************************************
		
		ler.close();
		
	}
	

}
