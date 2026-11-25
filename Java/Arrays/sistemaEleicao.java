import java.util.Scanner;
public class sistemaEleicao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int qntEleitores = 0, nulo = 0, joao = 0, maria = 0, carlos = 0, ganhador = 0;
	
		System.out.print("\nQuantos eleitores participarão?: ");
		qntEleitores = sc.nextInt();
		
		int[] qntVotos = new int[qntEleitores];
	
		System.out.println("Sistema de Eleição.\n");
		System.out.println("1 -- João");
		System.out.println("2 -- Maria");
		System.out.println("3 -- Carlos");
		System.out.println("0 -- Nulo");

		for(int i = 0; i<qntVotos.length; i++){
			System.out.print("Insira o voto do " + (i+1) + "° Eleitor: ");
			qntVotos[i] = sc.nextInt();
			
			switch (qntVotos[i]) {
				case 0:
					nulo++;
					System.out.print("\nVoto NULO registrado!\n");
					break;
				case 1:
					joao++;
					System.out.print("\nVoto JOÃO registrado!\n");
					break;
				case 2:
					maria++;
					System.out.print("\nVoto MARIA registrado!\n");
					break;
				case 3:
					carlos++;
					System.out.print("\nVoto CARLOS registrado!\n");
					break;
				default:
					System.out.print("\nVoto inválido!\n");
					break;
			}
			if (qntVotos[i] > ganhador) {
				ganhador = qntVotos[i];
			}
		}
		
		System.out.println("-Votos-" +
		"\nNulo: " + nulo +
		"\nJoão: " + joao +
		"\nMaria: " + maria +
		"\nCarlos: " + carlos);
		System.out.print("Candidato vencedor: " + ganhador +
		"Votaram nulo: " + nulo);
	}
}