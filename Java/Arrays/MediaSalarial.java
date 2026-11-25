import java.util.Scanner;
import java.util.Arrays;

public class MediaSalarial{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int[] salary = new int [15];
		
		for (int i = 0; i <salary.length; i++){
			System.out.print("Digite o " + (i + 1) + "° Salário : ");
			nota[i] = sc.nextInt();
		}
		System.out.println("");
		System.out.println(Arrays.toString(salary));
		Arrays.sort(salary);
		System.out.println(Arrays.toString(salary));
		System.out.println("");
		
		int media = salary*[15];
		
		System.out.println("=========TABELA DE SALÁRIO=========");
		System.out.println("Maior salário: "+ nota[14]);
		System.out.println("Menor salário: "+ nota[0]);
		System.out.println("Segunda maior nota: "+ nota[6]);
		
		
	}
}
	