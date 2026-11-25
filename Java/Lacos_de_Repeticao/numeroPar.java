import java.util.Scanner;
public class numeroPar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int contador = 0;
		System.out.println("Digite um número:");
		 numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++){
			
			if( i % 2 == 0 ){
				contador++;
				
			}
			
		}
		System.out.println("Resultado de números pares: "+ contador);
	}
}