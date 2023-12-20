package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

 public static Scanner leia	= new Scanner(System.in);
 

	public static void main(String[] args) {

			
			int opcao;
			
					
			while(true) {

				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "*****************************************************");
				System.out.println("                                                     ");
				System.out.println("               CARAMELO BANK                	     ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Criar Conta                          ");
				System.out.println("            2 - Listar todas as Contas               ");
				System.out.println("            3 - Buscar Conta por Numero              ");
				System.out.println("            4 - Atualizar Dados da Conta             ");
				System.out.println("            5 - Apagar Conta                         ");
				System.out.println("            6 - Sacar                                ");
				System.out.println("            7 - Depositar                            ");
				System.out.println("            8 - Transferir valores entre Contas      ");
				System.out.println("            9 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     " + Cores.TEXT_RESET);
				
				opcao = leia.nextInt();
					
				if (opcao == 9) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nSempre ao seu lado.");
					sobre();
					leia.close();
					System.exit(0);
				}
					
				switch (opcao) {
					case 1:
						System.out.println("\nCriar Conta");
					
	                    		break;
					case 2:
						System.out.println("\nListar todas as Contas");
						
	                    		break;
					case 3:
						System.out.println("\n Bucar conta por número");
		
	                    		break;
					case 4:
						System.out.println("\n Atualizar Conta");
						
	                    		break;
					case 5:
						System.out.println("\n Apagar Conta");
			
	                   	 	break;
					case 6:
						System.out.println("\n Sacar");

	                   	 	break;
					case 7:
						System.out.println("\n Depositar");
						
	                    		break;
					case 8:
						System.out.println("\n Transfirir");
						
	                    		break;
					default:
						System.out.println("\n Opção Inválida!\n");
	                    		break;
				}
			}	
	    }

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:Rex ");
		System.out.println("Generation Brasil - Rexmaster@rex.com");
		System.out.println("github.com/RexionX");
		System.out.println("*********************************************************");
	   }
}
