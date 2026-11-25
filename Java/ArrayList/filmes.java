import java.util.Scanner;
import java.util.ArrayList;
public class filmes{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> filmes = new ArrayList<>();
		
		
		for(int i = 0; i<5; i++){
			System.out.println("\nDigite o filme que quer adicionar a lista: ");
			String filme = sc.nextLine();
			
			filmes.add(filme);
		}
		for(int i = 0 ; i < filmes.size(); i++){
			System.out.println("\nSeus filmes" + filmes.get(i));
				 
		}
		sc.nextLine();
		filmes.remove(2);
		
		for(int i = 0 ; i < filmes.size(); i++){
			System.out.println("\nSeus filmes" + filmes.get(i));
		}
	}
}