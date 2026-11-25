import java.util.Scanner;
public class Tabuada{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double numero =sc.nextDouble();
		
		System.out.println("Tabuada do " + numero);
			for (int i = 1; i<=10; i++){
				double resultado= numero*i;
				
				System.out.println(numero  + "x"   + i +  "="   + resultado);
			}
			
			for (double i = 1; i<=10; i++){
				double resultado= numero/i;
				
				System.out.println(numero  + "/"   + i +  "="   + resultado);
			}
			
			for (double i = 1; i<=10; i++){
				double resultado= numero-i;
				
				System.out.println(numero  + "-"   + i +  "="   + resultado);
			}
			for (double i = 1; i<=10; i++){
				double resultado= numero+i;
				
				System.out.println(numero  + "+"   + i +  "="   + resultado);
			}
			
			sc.close();
	}
}