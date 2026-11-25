import java.util.Scanner;
import java.util.ArrayList;
public class frutas{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> frutas = new ArrayList<>();
		
		for( int i = 0; i < 3; i++){
		System.out.println("Digite a fruta que quer adicionar ao estoque: ");
		String fruta = sc.nextLine();
		
		frutas.add(fruta);
	}
	System.out.println("Fruta " + frutas.get(0));
	System.out.println("Quantidade de frutas:"  + frutas.size());
}
}