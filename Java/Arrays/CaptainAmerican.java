import java.util.Scanner;
public class CaptainAmerican{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int []numero = new int[5];
		
		for(int i=0; i<5; i++){
			System.out.print("Entre com o " + "valor "+ (i+1) + ":  " );
			numero[i] = sc.nextInt();
			soma+= numero[1];
		}
		System.out.print("A soma é:" + soma);
		sc.close();
	}
}