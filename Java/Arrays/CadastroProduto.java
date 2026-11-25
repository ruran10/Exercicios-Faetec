import java.util.Scanner;
public class CadastroProduto{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int qtdProdutos = 0;
		double produtoCaro = 0 , produtoBarato = 0 , media = 0;
		
		System.out.println("Digite a quantidade de produtos : ");
		qtdProdutos = sc.nextInt();
		
		double[] precos;
		precos = new double [qtdProdutos];
		
		for (int i = 0; i < qtdProdutos; i++){
			System.out.println("Digite o preço do produto " +  ( i+1 ) + ": "  );
			precos[i] = sc.nextInt();
			
			if(precos[i] >= produtoCaro){
				produtoCaro = precos[i];
				System.out.println(produtoCaro);
			}
			if (precos[i] >= produtoBarato){
				produtoBarato = precos[i];
				System.out.println(produtoBarato);
			}
			
			
		}
	}
}	
		
	

		
		
		
		
		