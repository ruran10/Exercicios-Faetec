import java.util.Scanner;
public class resultadoaluno{
 public static void main (String[] args){
   Scanner teclado = new Scanner (System.in);

  System.out.println("Insira o nome do aluno: ");
    String nome = teclado.next();
 
  System.out.println ("Insira a primeira nota: ");
    double nota1 = teclado.nextDouble ();
	
  System.out.println ("Insira a segunda nota: ");
    double nota2 = teclado.nextDouble ();
	
	System.out.println ("Insira a terceira nota: ");
    double nota3 = teclado.nextDouble ();
	
	double media = (nota1 + nota2 + nota3)/3;
	
	
	if (media < 5){
		System.out.println("aluno: " + nome);
		System.out.println("media: " + media);
		System.out.println("\nrecuperacao! ");	
	}else{ 
          System.out.println("aluno: " + nome);
		  System.out.println("media: " + media);
		  System.out.println("\naprovado! ");
	}
    teclado.close();
 }
}