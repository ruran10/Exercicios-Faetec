 import java.util.Scanner;
 import java.util.ArrayList;
 public class cadastroAluno{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		 ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Integer> idades = new ArrayList<>();
		
		for(int i = 0; i< 3; i++){
			System.out.println("Digite seu nome:");
			String nome = sc.nextLine();
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			nomes.add(nome);
			idades.add(idade);
		}
		
		System.out.println("\nAlunos cadastrados");
			for (int i = 0; i < nomes.size(); i++){
				System.out.println("Nome: " + nomes.get(i));
				System.out.println("Idade: " + idades.get(i));
			}
	 }
 }