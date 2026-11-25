import java.util.Scanner;
public class login{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do usuário: ");
		String usuario = entrada.next();
		System.out.println("Digite sua senha: ");
		String senha = entrada.next();
		
		if ( usuario.equals("")&& senha.equals("")) {
				
		System.out.println("B");
		} else {
		System.out.println("Usuário e/ou senha inválido(s)");			
		}		
		entrada.close();
	} 
}	
		