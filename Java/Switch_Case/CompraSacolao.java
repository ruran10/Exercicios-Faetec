import java.util.Scanner;
public class CompraSacolao{
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		while(true) {
			System.out.println(contador);
				contador++;
		System.out.println("Olá digite um numero de 1 a 4 para confirmar sua escolha :");
		
		System.out.println("\nOpções:");
		System.out.println("[1] Banana:");
		System.out.println("[2] maçã:");
		System.out.println("[3] abacaxi:");
		System.out.println("[4]melão:");
		int opcao = teclado.nextInt();
		
		switch(opcao){
			case 1:
			System.out.print("kg da banana: R$4,99");
			break;
			
			case 2:
			System.out.print(" kg da maçã: R$3,50");
			break;
			
			case 3:
			System.out.print("kg do abacaxi: R$8,00");
			break;
			
			case 4:
			System.out.print("kg do melão: R$7,90");
			break;
			default:
				System.out.println("não existe está opção, tente outra vez!!");
		}
			teclado.close();
		}
	}
}	