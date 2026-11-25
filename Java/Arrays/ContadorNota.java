import java.util.Scanner;
public class ContadorNota{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de alunos:");
		int qtd = sc.nextInt();
		
		double[] notas = new double [qtd];
		
		double soma = 0;
		int aprovados = 0;
		double menor = 0;
		double maior = 0;
		
		for (int i = 0; i< qtd; i++) {
			System.out.print("Digite a nota do aluno" + (i+1) + ": ");
			notas[i] = sc.nextDouble();
			
			soma += notas[i];
			
			if (notas[i] >=6) {
				maior = notas[i];
			}
			if (notas[i] >=6) {
				menor = notas[i];
			}
		}
		double media = soma/ qtd;
		System.out.println("\n===== RESULTADOS =====");
		System.out.println("Maior nota: " + maior);
		System.out.println("Menor nota: " + menor);
		System.out.println("Média da turma: " + media);
		System.out.println("Aprovados: " + aprovados);
		sc.close();
	}
}
		
			