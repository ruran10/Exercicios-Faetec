import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class biblioteca{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		byte opcao = 0;
		ArrayList<String> livros = new ArrayList<>();
		ArrayList<Integer> quantidades = new ArrayList<>();
		ArrayList<Integer> ids = new ArrayList<>();
		ArrayList<String> categorias = new ArrayList<>();
		ArrayList<Double> precos = new ArrayList<>();
		ArrayList<Double> vendas = new ArrayList<>();
	
		
		do{
				System.out.println(" 1- Cadastrar Livro");
				System.out.println(" 2- Listar Livros");
				System.out.println(" 3- Editar Livros");
				System.out.println(" 4- Excluir Livro");
				System.out.println(" 5- Pesquisar Livros");
				System.out.println(" 6- Ordenar Livros");
				System.out.println(" 7- Registrar venda");
				System.out.println(" 0- Sair");
				opcao = sc.nextByte();
				
				switch (opcao){
					case 1:
					System.out.println("Digite o nome do livro: ");
					String livro = sc.nextLine();
					sc.nextLine();
					
					System.out.println("Digite a categoria do livro: ");
					String categoria = sc.nextLine();
					
					System.out.println("Digite a quantidade de livros que quer adicionar ao estoque: ");
					int quantidade = sc.nextInt();
					
					System.out.println("Digite o  ID do livro: ");
					int id = sc.nextInt();
					
					System.out.println("Digite o preço do livro: ");
					double preco = sc.nextDouble();
					
					System.out.println("Livro cadatrado com sucesso!");
					sc.nextLine();
					
					livros.add(livro);
					categorias.add(categoria);
					quantidades.add(quantidade);
					ids.add(id);
					precos.add(preco);
					
					break;
					
					case 2:
					System.out.println("==== LIVROS CADASTRADOS ====");
					for (int i = 0; i < livros.size(); i++){
						System.out.println("\n Livros: " + livros.get(i));
						System.out.println("\n Quantidades:  " + quantidades.get(i));
						System.out.println("\n IDs: " + ids.get(i));
						System.out.println("\n Preços: " + precos.get(i));
						System.out.println("\n Categorias: " + categorias.get(i));
						
						System.out.println("");
					}
					break;
					
					case 3:
					sc.nextLine();
					System.out.println("Qual posição deeja alterar: ");
					int posicao = sc.nextInt();
					
					System.out.println(" Edite o nome do livro: ");
					String novoLivro = sc.nextLine();
					
					livros.set(posicao, novoLivro);
					
					System.out.println("Livro editado com sucesso!");
					break;
					
					case 4:
					System.out.println("Digite o nome do produto que quer remover");
					 String remover = sc.nextLine();

					 livros.remove(remover);
					 break;
					 
					 case 5:
					 System.out.println("Digite o ID do produto: ");
					 int idPesquisa = sc.nextInt();
					 for( int i = 0; i < ids.size(); i++){
						 if( ids.get(i) == idPesquisa){
							 System.out.println("Produto encontrado!");
							 System.out.println("\n Livros: " + livros.get(i));
							 System.out.println("\n Quantidades:  " + quantidades.get(i));
							 System.out.println("\n IDs: " + ids.get(i));
							 System.out.println("\n Preços: " + precos.get(i));
							 System.out.println("\n Categorias: " +  categorias.get(i));
							 
						 }
					 }
					 break;
					 
					 case 6:
					 Collections.sort(livros, String.CASE_INSENSITIVE_ORDER);
						System.out.println("Livros ordenados!");
						break;
						
					case 7:
					System.out.println("Informe o ID do livro pedido:");
					int idVendido = sc.nextInt();

					System.out.println("Informe quantos livros foram vendidos:");
					int quantidadeVendido = sc.nextInt();

					for (int i = 0; i < ids.size(); i++) {

						if (ids.get(i) == idVendido) {

							if (quantidadeVendido > 0 &&
								quantidadeVendido <= quantidades.get(i)) {

								quantidades.set(i,quantidades.get(i) - quantidadeVendido);
												

								double total = quantidadeVendido * precos.get(i);

						System.out.println("Venda realizada!");
						System.out.println("Livro: " + livros.get(i));
						System.out.println("Total: R$ " + total);
						System.out.println("Estoque atualizado: " + quantidades.get(i));

						} else {
						System.out.println("Quantidade invalida ou estoque insuficiente!");
						}

						break;
						}
					}
				}
		}while (opcao != 0);
	}
}
				
