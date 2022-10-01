package dinoSkeep;

import java.util.Scanner;


public class Teste {

	public static void main(String[] args)  throws Exception {

		try (Scanner scan = new Scanner(System.in)) {
			Dinossauro skeep = new Dinossauro();
			do {
				System.out.println("         Ol� eu sou o Skeep!        ");
				System.out.println(" ");
				System.out.println("O que vamos fazer?");
				System.out.println(
						" P = PULAR      C = CORRER \n M = COMER      A = CANTAR\n S = TOMAR SOL  O = FICAR NA SOMBRA ");
				System.out.println(" ");
				System.out.println("Esse � o meu Status: \n" + "Energia: " + skeep.energia + " Velocidade: "
						+ skeep.velocidade + " Temperatura: " + skeep.temperatura + " Humor: " + skeep.humor);
				String textoMaiusculo = scan.nextLine().toUpperCase();
				char letra = textoMaiusculo.charAt(0);

				switch (letra) {
				case 'P':
					skeep.Pular();
					break;
				case 'C':
					skeep.Correr();
					break;
				case 'M':
					skeep.Comer();
					break;
				case 'A':
					skeep.Cantar();
					break;
				case 'S':
					skeep.TomarSol();
					break;
				case 'O':
					skeep.FicarNaSombra();
					break;
				default:
					System.out.println("Poxa, voc� tem que dizer algo que eu saiba fazer n�!!");

				}

			} while (true);
		}
	}
}
