import java.util.Scanner;
public class CalcS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float num1 , num2 ;
		byte opcao = 0;
		
		System.out.println("Digite um número:");
		num1 = sc.nextFloat();
		System.out.println("Digite o segundo numero número:");
		num2 = sc.nextFloat();
		
		System.out.println("---MENU DE OPERAÇÕES---");
		System.out.println("[1]- Adição");
		System.out.println("[2]- Subtração");
		System.out.println("[3]- Multiplicação");
		System.out.println("[4]- Divisão");
		opcao = sc.
		nextByte();
		
		switch(opcao){
			case 1:
			System.out.println("Resultado: " + num1+num2);
			break;
			
			case 2:
			System.out.println("Resultado: " + (num1-num2));
			break;
			
			case 3:
			System.out.println("Resultado: " + num1*num2);
			break;
			
			case 4:
			System.out.println("Resultado: " + num1/num2);
			break;
			
			
		}
		
	}
}