import java.util.Arrays;
import java.util.Scanner;

public class Ordenado{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		
		int[] number = new int[10];
		
		for (int i = 0; i <number.length; i++)
		{
			System.out.print("Digite o " + (i + 1) + "° número:");
			 number[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(number));
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		sc.close();
	}
}
		
		
		
		
