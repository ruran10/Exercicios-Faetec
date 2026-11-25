import java.util.Scanner;
import java.util.Arrays;

public class Biblis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String[] livros = new String[20];
		int cont = 0;
	    byte op = 0;
		
        System.out.println("===========SISTEMA BIBLIOTECÁRIO,===========");
        System.out.println("[1] - Cadastrar Livro");
        System.out.println("[2] - Listar Livros");
        System.out.println("[3] - Pesquisar Livros");
		System.out.println("[4] - Livros Encontrados");
        System.out.println("[0] - Sair");

        do {
            System.out.print("\nEscolha uma opção: ");
            op = sc.nextByte();
			

            switch (op) {
                case 0:
                    System.out.println("\nTem certeza que deseja encerrar o sistema?");
                    System.out.println("[1] - Sim");
                    System.out.println("[2] - Não");
                    System.out.print("Opção: ");
                    byte confirmacao = sc.nextByte();
                    
                    if (confirmacao == 1) {
                        System.out.println("Sistema encerrado.");
                    } else {
                        System.out.println("Retornando ao sistema...");
                        op = -1;
                    }
                    break;

                case 1:
				if (cont < 20){
                    System.out.print("Nome do Livro : ");
                    livros[cont] = sc.next();
					const++;
					System.out.println("Livro Cadastrado com Sucesso!");
				}else {
					System.out.println("Limite de Livros Atingidos");
				} 
                    break;

                case 2:
					System.out.println("Lista de Livros");
					for (int i = 0; i< cont; i++{
						System.out.println((i + 1) + ": " + livros[i]);
					}
                    break;
                case 3:
                   
                    break;

                default:
                    if (op != -1) {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}