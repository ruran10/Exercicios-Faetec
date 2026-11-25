import java.util.Scanner;
public class media{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float nota1 =  0;
		float nota2 = 0;
		float media = 0;
		System.out.println("Digite sua primeira nota:");
		nota1 = sc.nextFloat();
		System.out.println("Digite sua segunda nota:");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2)/2 ;
		
		if(media >= 7){
			System.out.println("Aprovado");
		}
		else if (media >= 5 ){
			System.out.println("Recuperação");
			
		}
		else {
			System.out.println("Reprovado");
		}
	}
}