import java.util.Scanner;
public class Leitor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int maior = 0 , menor = 0  , soma = 0;
		
		int []numero = new int[10];
		
		for(int i=0; i<10; i++){
			System.out.print("Entre com o valor "+ (i+1)+ ": " );
			numero[i] = sc.nextInt();
			soma+= numero[i];
			if(i==0){
				maior=numero[i];
				menor=numero[i];
			}
			else{
				if (numero[1]>maior){
					maior = numero[i];
				}
				if(numero[i] < menor){
					menor =numero[i];
				}
			}
		}
		
		System.out.println("A soma é:" + soma);
		System.out.println("O maior número é:" + maior);
		System.out.println("O menor número é:" + menor);
		
		sc.close();
	}
}