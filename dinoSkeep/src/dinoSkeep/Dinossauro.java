package dinoSkeep;

public class Dinossauro {
	public int energia;
	public int velocidade;
	public int temperatura;
	public int humor;

	public void TomarSol() {
		velocidade++;
		temperatura++;
		humor++;
		System.out.println("Tomar sol é tão bom!!");

	}

	public void Comer() {
		energia++;
		humor++;
		velocidade--;
		System.out.println(
				"Hm, comer me da muita energia e me deixa feliz, mas diminui minha velocidade a não ser que eu vá tomar SOL ");
	}

	public void Correr() {
		if (energia == 0) {
			System.out
					.println("Não consigo fazer isso, estou sem energia! ALIMENTE-ME OU DEIXE-ME DESCANSAR NA SOMBRA ");
		} else {
			energia--;
			velocidade--;
			humor++;
			System.out.println("Correr me deixa muito feliz!!!");
		}
	}

	public void FicarNaSombra() {
		energia++;
		humor--;
		temperatura--;
		System.out.println("Descansar é bom para recuperar as energias.");
	}

	public void Cantar() {
		if (energia == 0) {
			System.out.println(
					"Eu amo cantar mas não tenho energia para isso. ALIMENTE-ME OU DEIXE-ME DESCANSAR NA SOMBRA");
		} else {
			energia--;
			humor++;
			System.out.println("É tão divertido Cantar, eu fico muito feliz!!");
		}
	}

	public void Pular() {
		if (energia == 0) {
			System.out
					.println("Poxa, estou tão cansado, não tenho energia. ALIMENTE-ME OU DEIXE-ME DESCANSAR NA SOMBRA");
		} else {
			energia--;
			velocidade--;
			humor++;
			System.out.println("Pular é tão legal!!!");
		}
	}

}
