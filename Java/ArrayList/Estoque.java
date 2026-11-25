 import java.util.Scanner;
 import java.util.ArrayList;
 public class Estoque{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		 ArrayList<Integer> quantidades = new ArrayList<>();
		 ArrayList<String>  produtos = new ArrayList<>();
		 
		 for(int i = 0; i < 3; i++){
			 System.out.print("Digite o nome do produto que quer cadastrar: ");
			 String produto = sc.nextLine();
			 
			 
			 System.out.print("Digite a quantidade do produto: ");
			 int quantidade = sc.nextInt();
			 
			 
			 sc.nextLine();
			 
			 quantidades.add(quantidade);
			 produtos.add(produto);
		 }
		 for(int i = 0; i< produtos.size(); i++){
			 System.out.println("Produto: " + produtos.get(i));
			 System.out.println("Quantidade: " + quantidades.get(i));
		 }
		 
	 }
 }