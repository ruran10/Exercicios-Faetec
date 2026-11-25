
import java.util.InputMismatchException;
import java.util.Scanner;
public class NumeroInt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = 0;

            while (true) {
                System.out.println("Digite um número:");

                try {
                    num = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite apenas um número inteiro.");
                    sc.nextLine();
                }
            }

            if (num > 0) {
                System.out.println("Seu número é positivo");
            } else if (num < 0) {
                System.out.println("Seu número é negativo");
            } else {
                System.out.println("Seu número é igual a zero");
            }
        }
    }
}