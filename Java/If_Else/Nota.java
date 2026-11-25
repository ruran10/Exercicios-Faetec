import java.util.Scanner;
 public class mensal{
	 public static void main(String[] args){
		 Scanner teclado = new Scanner (System.in);
		 
		System.out.print("Digite sua nota ");
		 float mensal = teclado.nextFloat();
		 float bonus = (float) (mensal*1.20);
	 if(mensal >=100){
		float bonus = mensal*1.20
		 System.out.println("Você recebeu um bônus de :"+ mensal);
	 }else{
		 System.out.println("Você recebeu"+ mensal);
	 }
	 teclado.close();
	}	  
 }	