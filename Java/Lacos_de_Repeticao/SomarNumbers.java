import java.util.Scanner;
public class SomarNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numero = 0 , soma = 0;
		

		
		System.out.println("Tabuada");
			for (int i = 1; i<=5; i++){
				
				
				System.out.println("Digite um  " + i + " Número: " );
					 numero = sc.nextInt();
					
					soma += numero;
			}
			System.out.println("\n---------------------");
			System.out.println(" A soma total é : " + soma);
			
			

			
			
			
			sc.close();
	}
}