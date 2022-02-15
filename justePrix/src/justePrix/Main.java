package justePrix;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// déclaration et initialisation des variables
		Random r = new Random(); 
		//int justeprix = (int) Math.random()*200;
		int justeprix = r.nextInt(200);
		int essai = 0;

		// affichage console
		System.out.println("Veuillez entrer un numéro entre 0 et 200 :");

		// entrée console
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int prix = scan.nextInt();

		// boucle de saisie et affichage du juste prix tant qu'il n'est pas trouvé
		while(justeprix != prix) {

			// boucle +/-
			if (prix < justeprix && prix > 0) {
				System.out.println("C'est plus");
			} 
			else if (prix > justeprix && prix < 200) {
				System.out.println("c'est moins");
			} 
			else {
				System.out.println("Veuillez choisir entre 0 et 200");
			}

			// nouvelle entrée console
			prix = scan.nextInt();
			essai++;

		}

		// bonne réponse
		System.out.println("Bravo, vous avez trouvé le juste prix en " + essai + " essais");

	}

}
