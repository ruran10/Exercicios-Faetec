import java.util.Scanner;
 public class mensal{
	 public static void main(String[] args){
		 Scanner teclado = new Scanner (System.in);
		 
		System.out.print("Digite sua hora ");
		double hora = teclado.nextDouble();
		System.out.print("Digite seu salario ");
		double salario = teclado.nextDouble();
		double bonus = salario*1.20;
	 if(hora >=100){
		
		 System.out.println("Você recebeu um bônus de :" + bonus);
	 }else{
		 System.out.println("Você recebeu" + bonus);
	 }
	 teclado.close();
	}	  
 }	