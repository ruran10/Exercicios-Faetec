import java.util.Scanner;
public class votacaoIdade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int entrevistados = 0, soma = 0, menor = 0, maior = 0;
		double media = 0.0;
		
		System.out.println("---PESQUISA DE DADOS---");
		System.out.print("Insira a quantidade de entrevistados:");
		entrevistados = sc.nextInt();
		int[] idade = new int[entrevistados];
		
		for(int i = 0; i < entrevistados; i++){
			System.out.print("Digite a idade da pessoa " + (i+1)+ ": ");
				idade[i] = sc.nextInt();
				
				soma+=idade[i];
				media = soma/entrevistados;
			if( menor<idade[i]){
				menor = idade[i];
				
			}
			if (idade[i]>maior){
			maior = idade[i];
			
			
			}
			
		}
			System.out.println("ESTÁ É A MÉDIA DAS IDADES : " + media);
			System.out.println("Essa é a idade menor: " + menor);
			System.out.println("Essa é a idade maior: " + maior);
		
		
	}
}
