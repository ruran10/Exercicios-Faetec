import java.util.Scanner;
import java.util.ArrayList;
public class padariaEstoque{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> quantidades = new ArrayList<>();
		ArrayList<String> produtos = new ArrayList<>();
		ArrayList<Integer> ids = new ArrayList<>();
		
		int opcao = 0;
		
		do {
			System.out.println("[1] - Cadastar Produtos");
			System.out.println("[2] - Listar Produtos");
			System.out.println("[3] - Pesquisar Produtos");
			System.out.println("[4] - Remover Produtos");
			System.out.println("[5] - Sair");
			 opcao = sc.nextInt();
			 sc.nextLine();
			
			switch (opcao){
				case 1:
				System.out.print("Digite o nome do produto: ");
				String produto = sc.nextLine();
				
				System.out.print("Digite a quantidade do produto: ");
				int quantidade = sc.nextInt();
				
				System.out.print("Digite o ID do produto: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				
				quantidades.add(quantidade);
				produtos.add(produto);
				ids.add(id);
				break;
				
				case 2:
				System.out.println("====PRODUTOS CADASTRADOS====");
				for(int i = 0; i <produtos.size(); i++){
					System.out.println("\nProdutos: " + produtos.get(i));
					System.out.println("\nQuantidade: " + quantidades.get(i));
					System.out.println("\nID do produto " + ids.get(i));
					System.out.println("");
					
				}
				break;
				
				case 3:
				System.out.print("Digite o ID do produto: ");
				int idPesquisa = sc.nextInt();
				for (int i = 0; i < ids.size(); i++){
					if(ids.get(i) == idPesquisa){
						System.out.println("Produto encontrado");
						
						System.out.println("\nProduto :" + produtos.get(i));
					System.out.println("\nQuantidade: " + quantidades.get(i));
					System.out.println("\nID do produto: " + ids.get(i));
					}
					
				}
				break;
					 case 4: 
					 System.out.println("Digite o nome do produto que quer remover");
					 String remover = sc.nextLine();

					 produtos.remove(remover);
			} 

		 
		}while (opcao !=5);
	}
}

	

