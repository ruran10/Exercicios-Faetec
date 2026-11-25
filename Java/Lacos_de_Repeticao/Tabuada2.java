import java.util.Scanner;
public class Tabuada2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		 int numero = 0;
		
		System.out.print("Digite um número para descobrir a tabuada dele: ");
		numero = sc.nextInt();
		for ( int i = 1; i<= 10; i++ ){
			int resultado = numero*i ;
			System.out.println(numero + "x" + i + "=" + resultado);
		}
		
	}
}