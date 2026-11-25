import java.util.Scanner;
public class comb{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int soma =0;
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		for (int i = 1; i <= numero; i++){
			soma+= i;
			System.out.println("Resultado:" + soma);
		}
	}
}