import java.util.Scanner;
import java.util.Arrays;

public class ranking{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int[] nota = new int [8];
		
		for (int i = 0; i <nota.length; i++){
			System.out.print("Digite a " + (i + 1) + "° nota : ");
			nota[i] = sc.nextInt();
		}
		System.out.println("");
		System.out.println(Arrays.toString(nota));
		Arrays.sort(nota);
		System.out.println(Arrays.toString(nota));
		System.out.println("");
		
		
		System.out.println("=========RANKING=========");
		System.out.println("Maior nota: "+ nota[7]);
		System.out.println("Menor nota: "+ nota[0]);
		System.out.println("Segunda maior nota: "+ nota[6]);
		System.out.println("Segunda menor nota: "+ nota[1]);
		
	}
}
			
			
		
		