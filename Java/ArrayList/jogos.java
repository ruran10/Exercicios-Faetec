import java.util.Scanner;
import java.util.ArrayList;
public class jogos{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> jogos = new ArrayList<>();
		
		for (int i = 0 ; i < 4 ; i ++){
			System.out.println("Digite o nome do jogo que quer adicionar:");
				String jogo = sc.nextLine();
				
			
			jogos.add(jogo);
			
		}
			System.out.println("Meus jogos");
			System.out.println(jogos.get(0));
			System.out.println("");
			System.out.println(jogos.get(1));
			System.out.println("");
			System.out.println(jogos.get(2));
			System.out.println("");
			System.out.println(jogos.get(3));
			
			
			
		System.out.println("");	
		System.out.println("Qual posição deseja alterar ?");
			int posicao = sc.nextInt();
			sc.nextLine();
		
		System.out.println("Digite o novo jogo: ");
			String novoJogo = sc.nextLine();
		
		jogos.set(posicao, novoJogo);
		
		
			System.out.println(jogos.get(0));
			System.out.println("");
			System.out.println(jogos.get(1));
			System.out.println("");
			System.out.println(jogos.get(2));
			System.out.println("");
			System.out.println(jogos.get(3));
		
	}
}