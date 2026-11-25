import java.util.ArrayList;

public class TesteArray {
	public static void main(String [] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Bruno");
		nomes.add("Carla");
		nomes.add("Diego");
		
		System.out.println("Tamanho total antes: " + nomes.size());
		
		nomes.remove(2);
		
		System.out.println("Tamanho total depois : " + nomes.size());
	}
}