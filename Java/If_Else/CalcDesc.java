import java.util.Scanner;
public class CalcDesc{
	public static void main(String[] args){
		Scanner teclado = new Scanner (System.in);
	
		System.out.print("Digite o valor da sua compra : ");
		float ValorCompra = teclado.nextFloat();
		
		if (ValorCompra <=100) {
		System.out.println("Sem desconto");
		}else if (ValorCompra <=500) {
			System.out.print(" Você pagará agora " + ValorCompra*0.90);
		}else{
			System.out.print("Você pagará agora " + ValorCompra*0.80);	
		}
		
		teclado.close();
	}
}	
			
		